const crypto = require('crypto');
const express = require('express');
const cookieParser = require('cookie-parser');
const bodyParser = require('body-parser');
const jwt = require('jsonwebtoken');
const fs = require('fs');
const fetch = (...args) => import('node-fetch').then(({ default: fetch }) => fetch(...args));

const app = express();
app.use(express.urlencoded({ extended: false }));
app.use(bodyParser.json());
app.use(bodyParser.urlencoded({
    extended: true
}));
app.use("/", express.static(__dirname + "/static"));
app.use(cookieParser());
// =================================route=============================
app.get('/index', (req, res, next) => {
  try{
    res.sendFile(__dirname + "/static/index.html");
  } catch (error){
    res.send(error);
  }
});
app.get('/categories', (req, res, next) => {
  try{
    res.sendFile(__dirname + "/static/categories.html");
  } catch (error){
    res.send(error);
  }
});
app.get('/blog', (req, res, next) => {
  try{
    res.sendFile(__dirname + "/static/blog.html");
  } catch (error){
    res.send(error);
  }
});
app.get('/contact', (req, res, next) => {
  try{
    res.sendFile(__dirname + "/static/contact.html");
  } catch (error){
    res.send(error);
  }
});

app.get('/anime-details', (req, res, next) => {
  try{
    res.sendFile(__dirname + "/static/anime-details.html");
  } catch (error){
    res.send(error);
  }
});
app.get('/anime-watching', (req, res, next) => {
  try{
    res.sendFile(__dirname + "/static/anime-watching.html");
  } catch (error){
    res.send(error);
  }
});
//===================================================================================
class Tweet {
  constructor() {
    this.tweets = [];
    this.salt = `salt-${crypto.randomBytes(10).toString}`;
  }
  replaceVariables(content, variables) {
    Object.keys(variables).forEach((variable) => {
        const pattern = new RegExp(`{{${variable}}}`, 'g');
        content = content.replace(pattern, variables[variable]);
    });

    return content;
  }
  readAndReplaceFile(fileName, variables) {
    const filePath = __dirname + "/static/" + fileName;
    
    fs.readFile(filePath, 'utf8', (err, content) => {
      if (err) {
        console.error(err);
        return;
      }
      const replacedContent = this.replaceVariables(content, variables);
      this.tweets.push(replacedContent);
    });
  }

  makeTweet({ name, thoughts }) {
    const status = this.tweets.length;
    const variables = { name, thoughts };
    this.readAndReplaceFile("check-note.html", variables, this.tweets);
    return {
      status,
      hash: this.makeHash(status),
    };
  }
  //idor? 
  retrieveTweet({ status, hash }) {
    if (hash !== this.makeHash(status) || status >= this.tweets.length) {
      return { error: 'Sorry, we cannot find the contact' };
    }
    return { tweet_content: this.tweets[status] };
  }

  makeHash(status) {
    return crypto
      .createHmac('ripemd160WithRSA', this.salt)
      .update(status.toString())
      .digest('hex');
  }
}

const tw = new Tweet();
tw.makeTweet({ name: "admin", thoughts: process.env.ADMIN});


app.post('/tweet', (req, res) => {
  try{
    const thoughts = req.body.thoughts ?? '';
    const name = req.body.name ?? '';
    if (thoughts && name){
      const { status, hash } = tw.makeTweet({ name: name.toString() , thoughts: thoughts.toString() });
      res.send(`status=${status}&hash=${hash}`);
      return;
    }
    else {
      res.send('Missing');
      return;
    }
  } catch (error){
    res.send(error);
  }
});

app.get('/get_tweet', (req, res) => {
  try{
    const { status, hash } = req.query;
    const tweet = tw.retrieveTweet({
      status: parseInt(status ?? '-1'),
      hash: (hash ?? '').toString(),
    });
    if (tweet.error) {
      res.send(tweet.error);
    } else {
      res.send(tweet.tweet_content);
    }
  } catch (error){
    res.send(error);
  }
});

app.get('/admin', (req, res, next) => {
  try{
    res.sendFile(__dirname + "/static/admin.html");
  } catch (error){
    res.send(error);
  }
});

app.post('/admin', (req, res, next) => {
  try{
    const code = req.body.code ?? '';
    if (code == process.env.ADMIN) {
      const admin_token = jwt.sign({isAdmin: true}, process.env.JWT_SECRET_KEY);
      res.cookie('admin', admin_token);
      res.send('admin');
    }
    else {
      const non_token = jwt.sign({isAdmin: false}, process.env.JWT_MEM_KEY);
      res.cookie('member', non_token);
      res.send('Non-admin');
    }
    return;
  } catch (error){
    res.send(error);
  }
})

const combine = (sink, source) => {
  for (var property in source) {
      if (typeof sink[property] === 'object' && typeof source[property] === 'object') {    
          combine(sink[property], source[property]);
      } else {
          sink[property] = source[property];
      }
  }
  return sink
};

app.get('/prime', (req, res) => {
  try {
    const prime_token = req.cookies['admin'];
    if (jwt.verify(prime_token, process.env.JWT_SECRET_KEY)){
      res.sendFile(__dirname + "/static/prime.html");
    } else{
      return res.status(401).send(error);
    }
  } catch (error) {
    return res.status(401).send(error);
  }
});

app.post('/quote1', function (req, res, next) {
  try {
    const prime_token = req.cookies['admin'];
    if (jwt.verify(prime_token, process.env.JWT_SECRET_KEY)){
      const Quote = req.body.list.toString();
      const getQuote = require("./static/" + Quote);
      res.json(getQuote.all());
    } else{
      return res.status(401).send(error);
    }
  } catch (error) {
    return res.status(401).send(error);
  }
})

app.post('/quote2', function (req, res, next) {
  try {
    const prime_token = req.cookies['admin'];
    if (!prime_token) {
      return res.status(401).send('no having prime token');
    }

    const decodedToken = jwt.verify(prime_token, process.env.JWT_SECRET_KEY);

    if (!decodedToken) {
      return res.status(401).send('wrong token');
    }
    if (jwt.verify(prime_token, process.env.JWT_SECRET_KEY)){
      const Quote1 = require("./static/top-quote-1.js")
      const Quote2 = require("./static/top-quote-2.js")
      let superQuote = combine(Quote1.all(), Quote2.all())
      let data = req.body.data || "";
      superQuote = combine(superQuote, data);
      res.json(superQuote);
    } else{
      return res.status(401).send(error);
    }
  } catch (error) {
    return res.status(401).send(error);
  }
})


app.listen(3000, () => {
  console.log('listening on port 3000');
});
FROM node:14

RUN mkdir -p /usr/src/app

WORKDIR /usr/src/app

COPY ./src/ .

RUN npm install


ENV ADMIN="QxWnGYTrW2SuXQq"
ENV JWT_SECRET_KEY="BI_MAT_KO_THE_BAT_MI"
ENV JWT_MEM_KEY="FBT_HOC_PHI_28TR_700"

EXPOSE 3000

CMD [ "node", "index.js" ]
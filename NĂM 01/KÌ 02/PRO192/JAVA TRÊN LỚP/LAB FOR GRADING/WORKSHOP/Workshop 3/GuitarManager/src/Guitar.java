public class Guitar {
    int price; 
    String builder,model,backWood,topWood,serialNumber;
    
    //constructor
    public Guitar(){
        price = 0;
        builder = null;
        model = null;
        backWood = null;
        topWood = null;
        serialNumber = null;        
    }  
    public Guitar(String serialNumber, int price, String builder,String model, String backWood, String topWood){
        this.price = price;
        this.builder = builder;
        this.model = model;
        this.backWood = backWood;
        this.topWood = topWood;
        this.serialNumber = serialNumber;
    }
    
    //setter
    public void setPrice(int price){
        this.price = price;
    }
    public void setBuilder(String builder){
        this.builder = builder;
    }
    public void setModel(String model){
        this.model = model;
    }
    public void setBackWood(String backWood){
        this.backWood = backWood;
    }
    public void setTopWood(String topWood){
        this.topWood = topWood;
    }
    public void setSerialNumber(String serialNumber){
        this.serialNumber = serialNumber;
    }
    
    //getter
    public int getPrice(){
        return price;
    }
    public String getBuilder(){
        return builder;
    }
    public String getModel(){
        return model; 
    }
    public String getBackWood(){
        return backWood;
    }
    public String getTopWood(){
        return topWood;
    }
    public String getSerialNumber(){
        return serialNumber;
    }
    
    public void createSound(){
        System.out.println("Serial number: " + getSerialNumber());
        System.out.println("Builder: " + getBuilder());
        System.out.println("Price: " + getPrice());
        System.out.println("Model: " + getModel());
        System.out.println("Backwood: " + getBackWood());
        System.out.println("TopWood: " + getTopWood());
    }
}

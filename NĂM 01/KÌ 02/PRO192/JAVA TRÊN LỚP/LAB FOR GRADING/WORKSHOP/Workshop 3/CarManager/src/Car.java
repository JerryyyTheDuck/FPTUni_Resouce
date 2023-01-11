public class Car {
    int enginePower;
    boolean convertible,parkingBreak;   
    String colour;

    //instructor
    public Car(){
        colour = null;
        enginePower = 0;
        convertible = false;
        parkingBreak = false;
    }
    public Car(String colour,int enginePower, boolean convertible, boolean parkingBreak){
        this.colour = colour;
        this.enginePower = enginePower;
        this.convertible = convertible;
        this.parkingBreak = parkingBreak;
        
    }
    
    //getter 
    public String getColour(){
        return colour;
    }
    public int getEnginePower(){
        return enginePower;
    }    
    public boolean getConvertible(){
        return convertible;
    }    
    public boolean getParkingBreak(){
        return parkingBreak;
    }

    //setter 
    public void setColour(String colour){
        this.colour = colour;
    }
    public void setEnginePower(int enginePower){
        this.enginePower = enginePower;
    }  
    public void setConvertible(boolean convertible){
        this.convertible=convertible;
    }
    public void setParkingBreak(boolean parkingBreak){
        this.parkingBreak = parkingBreak;
    }
    public void pressStartButton(){
        System.out.println("You have pressed the start button");
    }
    public void pressAcceleratorButton(){
        System.out.println("You have pressed the Accelerator button");
    }
    
    public void output(){
        System.out.println("Colour: "+colour);
        System.out.println("Engine Power: "+enginePower);
        System.out.println("Convertible: " + convertible);
        System.out.println("Parking Break: "+ parkingBreak);
    }
}

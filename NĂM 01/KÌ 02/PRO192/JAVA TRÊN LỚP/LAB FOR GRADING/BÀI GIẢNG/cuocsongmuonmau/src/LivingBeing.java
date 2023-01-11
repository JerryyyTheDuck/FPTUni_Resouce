
public abstract class LivingBeing {
    private String name;
    
    public LivingBeing(){
        name = "";
    }

    public LivingBeing(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    
    public void useWater(){
        System.out.println("2 lit mot ngay");
    }
    public abstract void grow();
    
    
}

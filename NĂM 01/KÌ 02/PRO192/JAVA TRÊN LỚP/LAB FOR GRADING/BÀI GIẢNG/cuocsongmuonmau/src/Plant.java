
public class Plant extends LivingBeing {
    private int year;
    
    public Plant(){
        super();
        year = 0;
    }

    public Plant(int year, String name) {
        super();
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
    
    


    @Override
    public void grow() {
        System.out.println("by light");
    }
    
}

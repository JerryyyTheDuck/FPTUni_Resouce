

public class Komondo extends Animal implements Food {
    private int year;
    public Komondo(){
        super();
        year = 0;
    }

    public Komondo(int year) {
        this.year = year;
    }
    
    

    @Override
    public void eatbug() {
        System.out.println("Eat five times a week");
    }
    
    
}

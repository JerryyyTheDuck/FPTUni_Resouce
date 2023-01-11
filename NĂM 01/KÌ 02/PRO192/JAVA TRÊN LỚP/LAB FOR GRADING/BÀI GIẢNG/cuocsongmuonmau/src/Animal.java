
public class Animal extends LivingBeing {

    private String gender;

    public Animal() {
        super();
        gender = "";
    }
    public Animal(String gender, String name) {
        super(name);
        this.gender = gender;
    }

    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }

    public void run() {
        System.out.println("");
    }

    @Override
    public void grow() {
        System.out.println("by food");
    }
}

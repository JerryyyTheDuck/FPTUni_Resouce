
public class Venus extends Plant implements Food {

    private int size;

    public Venus() {
        super();
        size = 0;
    }

    public Venus(int size, int year, String name) {
        super(year, name);
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public void eatbug() {
        System.out.println("Eat bug 5 times a week");
    }

}

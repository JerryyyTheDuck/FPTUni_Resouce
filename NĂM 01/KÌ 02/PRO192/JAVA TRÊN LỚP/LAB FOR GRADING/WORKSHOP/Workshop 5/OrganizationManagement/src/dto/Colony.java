package dto;
public class Colony extends Organization {

    String place;

    public Colony() {
        super();
        place = "";
    }

    public Colony(String place, int size) {
        super(size);
        this.place = place;

    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public void grow() {
        System.out.println("an annual cycle of growth that begins in spring");
    }

    public void reproduce() {
        System.out.println("Colony can reproduce itself through a process");
    }

    @Override
    public void communicateByTool() {
        System.out.println("the colony communicate by sound");
    }

    @Override
    public String toString() {
        return "the colony size is" + size + ", the colony’s place is" + place;
    }

}

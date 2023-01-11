package dto;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Item {

    private int value;
    private String creator;

    public Item() {
        value = 0;
        creator = "";
    }
    public Item(int value, String creator) {
        this.value = value;
        this.creator = creator;
    }

    public int getValue() {
        return value;
    }
    public String getCreator() {
        return creator;
    }

    public void setValue(int value) {
        this.value = value;
    }
    public void setCreator(String creator) {
        this.creator = creator;
    }

    public void input() {
        Scanner s = new Scanner(System.in);
        boolean check = false;
        do {
            try {
                System.out.print("Input creator: ");
                creator = s.nextLine();
                if (creator == null) {
                    throw new InputMismatchException();
                }
                check = true;
            } catch (InputMismatchException e) {
                System.out.println("Empty creator");
            }
        } while (!check);

        while (true) {
            try {
                System.out.print("Input value");
                value = Integer.parseInt(s.nextLine());
                if (value <= 0) {
                    throw new Exception();
                }
                break;
            } catch (Exception e) {
                System.out.println("Input value greater than 0");
            }
        }
    }
    public void output() {
        System.out.println("Creator: "+ creator);
        System.out.println("Value: " + value);
    }
}

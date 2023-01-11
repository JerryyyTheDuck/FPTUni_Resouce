package dto;

import java.util.Scanner;

public class Statue extends Item {

    private int weight;
    private String colour;

    public Statue() {
        super();
        weight = 0;
        colour = "";
    }
    public Statue(int weight, String colour, int value, String creator) {
        super(value, creator);
        this.weight = weight;
        this.colour = colour;
    }

    public int getWeight() {
        return weight;
    }
    public String getColour() {
        return colour;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
    public void setColour(String colour) {
        this.colour = colour;
    }

    @Override
    public void input() {
        Scanner s = new Scanner(System.in);
        super.input();
        while (true) {
            try {
                System.out.print("Input weight: ");
                weight = Integer.parseInt(s.nextLine());
                if (weight <= 0) {
                    throw new Exception();
                }
                break;
            } catch (Exception e) {
                System.out.println("Weight must be > 0");
            }
        }
        
        while (true) {
            try {
                System.out.println("Input colour: ");
                String check = "^[a-zA-Z]+(a-za-Z )*$";
                colour = s.nextLine();
                if (!colour.matches(check)) {
                    throw new Exception();
                }
                break;
            } catch (Exception e) {
                System.out.println("There is no number in that colour");
            }
        }

    }
    @Override
    public void output() {
        super.output();
        System.out.println("Weight: " + weight);
        System.out.println("Colour: "+ colour);
    }

}

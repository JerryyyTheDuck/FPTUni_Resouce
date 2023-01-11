package dto;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Vase extends Item{
    private int height;
    private String material;
    
    public Vase(){
        super();
        height = 0;
        material = "";
    }
    public Vase(int height, String material, int value, String creator) {
        super(value, creator);
        this.height = height;
        this.material = material;
    }

    public int getHeight() {
        return height;
    }
    public String getMaterial() {
        return material;
    }

    public void setHeight(int height) {
        this.height = height;
    }
    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public void input() {
        super.input();
        Scanner s = new Scanner(System.in);
        boolean check = false;
        do {
            try {
                System.out.print("Input material: ");
                material = s.nextLine();
                if (material == null) {
                    throw new InputMismatchException();
                }
                check = true;
            } catch (InputMismatchException e) {
                System.out.println("Empty material");
            }
        } while (!check);

        while (true) {
            try {
                System.out.print("Input height");
                height = Integer.parseInt(s.nextLine());
                if (height <= 0) {
                    throw new Exception();
                }
                break;
            } catch (Exception e) {
                System.out.println("Input height greater than 0");
            }
        }
    }   
    @Override
    public void output() {
        super.output();
        System.out.println("Material: "+ material);
        System.out.println("Height: "+ height);
    }
    
    
}

package dto;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Painting extends Item {

    private int height;
    private int width;
    private boolean isWatercolour;
    private boolean isFramed;

    public Painting() {
        super();
        height = 0;
        width = 0;
        isWatercolour = false;
        isFramed = false;
    }
    public Painting(int height, int width, boolean isWatercolour, boolean isFramed, int value, String creator) {
        super(value, creator);
        this.height = height;
        this.width = width;
        this.isWatercolour = isWatercolour;
        this.isFramed = isFramed;
    }

    public int getHeight() {
        return height;
    }
    public int getWidth() {
        return width;
    }
    public boolean isIsWatercolour() {
        return isWatercolour;
    }
    public boolean isIsFramed() {
        return isFramed;
    }

    public void setHeight(int height) {
        this.height = height;
    }
    public void setWidth(int width) {
        this.width = width;
    }

    public void setIsWatercolour(boolean isWatercolour) {
        this.isWatercolour = isWatercolour;
    }
    public void setIsFramed(boolean isFramed) {
        this.isFramed = isFramed;
    }

    @Override
    public void input() {
        super.input();
        boolean check = false;
        Scanner s = new Scanner(System.in);
        do {
            try {
                System.out.print("Input height: ");
                height = Integer.parseInt(s.nextLine());
                if (height <= 0) {
                    throw new InputMismatchException();
                }
                check = true;
            } catch (InputMismatchException e) {
                System.out.println("Input height greater than 0");
            }
        } while (!check);

        while (true) {
            try {
                System.out.print("Input witdh");
                width = Integer.parseInt(s.nextLine());
                if (width <= 0) {
                    throw new Exception();
                }
                break;
            } catch (Exception e) {
                System.out.println("Input witdh greater than 0");
            }
        }

        while (true) {
            try {
                System.out.println("Is the painting Water couloured ? [True/False]");
                isWatercolour = s.nextBoolean();
                break;
            } catch (Exception e) {
                System.out.println("Only True or False");
            }
        }

        while (true) {
            try {
                System.out.println("Is the painting Framed ? [True/False]");
                isFramed = s.nextBoolean();
                break;
            } catch (Exception e) {
                System.out.println("Only True or False");
            }
        }
    }
    @Override
    public void output() {
        super.output();
        System.out.println("Height: " + height);
        System.out.println("Width: " + width);
        System.out.println("Water colour: " + isWatercolour);
        System.out.println("Framed: " + isFramed);
    }

}

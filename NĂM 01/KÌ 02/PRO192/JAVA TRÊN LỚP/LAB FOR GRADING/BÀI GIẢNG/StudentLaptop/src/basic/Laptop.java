import java.util.InputMismatchException;
import java.util.Scanner;

public class Laptop {

    private int id;
    private String brand;
    CPU cpu;

    public Laptop() {
        id = 0;
        brand = "";
        cpu = new CPU();
    }

    public Laptop(int id, String brand, CPU cpu) {
        this.id = id;
        this.brand = brand;
        this.cpu = cpu;
    }

    public int getId() {
        return id;
    }

    public String getBrand() {
        return brand;
    }

    public CPU getCpu() {
        return cpu;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setCpu(CPU cpu) {
        this.cpu = cpu;
    }

    public void input() {
        Scanner s = new Scanner(System.in);
        while (true) {
            try {
                System.out.print("Enter ID");
                id = Integer.parseInt(s.nextLine());
                if (id <= 0) {
                    throw new InputMismatchException();
                }
                break;
            } catch (InputMismatchException E) {
                System.out.println("Error cause by minus input");
            }
        }

        System.out.print("Enter brand: ");
        brand = s.nextLine();

        cpu.input();
    }

    public void output() {
        System.out.format("%8d%4s", id, brand);
        cpu.output();
    }
}

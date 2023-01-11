
import java.util.Scanner;

public class Tester {

    public static void main(String[] args) {
        int c;
        Student a = null;
        Laptop laptop = null;
        CPU cpu = null;

        do {
            System.out.println("1. Input Student ");
            System.out.println("2. Print out information");
            System.out.print("Your choice: ");
            Scanner s = new Scanner(System.in);
            c = Integer.parseInt(s.nextLine());
            switch (c) {
                case 1:
                    a = new Student();
                    a.nhapSV();
                    System.out.println("Done!");
                    break;
                case 2:
                    if (a != null) {
                        System.out.println("The result");
                        a.xuatSV();

                    } else {
                        System.out.println("Missing data");
                    }
                    break;

            }

        } while (c <= 2);
    }
}

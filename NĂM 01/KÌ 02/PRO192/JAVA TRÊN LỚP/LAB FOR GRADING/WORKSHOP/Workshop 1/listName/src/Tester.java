
import java.util.InputMismatchException;
import java.util.Scanner;

public class Tester {

    public static void main(String[] args) throws Exception {
        student a = new student();
        Scanner s = new Scanner(System.in);
        int number;
        while (true) {
            try {
                System.out.print("Enter the number of student: ");
                number = Integer.parseInt(s.nextLine());
                if (number <= 0) {
                    throw new InputMismatchException();
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println("Khong nhap ki tu, vui long nhap lai");
            } catch (InputMismatchException e) {
                System.out.println("Khong nhap so am, vui long nhap lai");
            }

        }
        a.input(number);

        System.out.println("After uppercase:");
        a.output(number);
    }
}

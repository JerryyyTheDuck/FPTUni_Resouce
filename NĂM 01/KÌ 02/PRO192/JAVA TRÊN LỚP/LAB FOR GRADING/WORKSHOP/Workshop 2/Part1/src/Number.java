
import java.util.InputMismatchException;
import java.util.Scanner;

public class Number {

    private double a;

    public void input() {
        while (true) {
            try {
                System.out.print("Enter the number: ");
                Scanner s = new Scanner(System.in);
                a = Double.parseDouble(s.nextLine());
                if (a < 1) {
                    throw new InputMismatchException();
                }
                break;
            } catch (NumberFormatException | InputMismatchException e) {
                System.out.println("Invalid input");
            }

        }
    }
    
    public void output(){
        System.out.println("The number is: " + a );
    }
}

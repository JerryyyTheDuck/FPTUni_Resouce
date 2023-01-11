
import java.util.Scanner;

public class StringMatch {

    String a;

    public void input() {
        Scanner s = new Scanner(System.in);
        boolean check = false;
        do {
            try {
                System.out.print("Input String: ");
                a = s.nextLine();
                if (!a.matches("^[Ss][Ee]+\\d+(\\.\\d+)?$$")) {
                    throw new Exception();
                }
                check = true;
            } catch (Exception e) {
                System.out.println("The string is wrong");
            }
        } while (!check);
    }

    public void output() {
        System.out.println("The string output is: " + a);
    }

    public void inputThrowCatch() throws Exception {
        Scanner s = new Scanner(System.in);
        System.out.print("Input String: ");
        a = s.nextLine();
        if (!a.matches("^[Ss][Ee]+\\d+(\\.\\d+)?$$")) {
            throw new Exception();
        }
    }
}


import java.util.Scanner;
import javax.xml.transform.OutputKeys;

public class Tester {

    public static void main(String[] args) {
        double result;
        soThuc a = new soThuc();
        soThuc b = new soThuc();
        Scanner s = new Scanner(System.in);
        String op;
        a.nhap();
        b.nhap();
        System.out.print("input the operator:");
        op = s.nextLine();
        switch (op) {
            case "+":
                result = a.sum(b);
                System.out.println("The result of " + a.num + "+" + b.num + "=" + result);
                break;
            case "-":
                result = a.minus(b);
                System.out.println("The result of " + a.num + "-" + b.num + "=" + result);
                break;
            case "*":
                result = a.product(b);
                System.out.println("The result of " + a.num + "*" + b.num + "=" + result);
                break;
            case "/":
                if (b.num != 0) {
                    result = a.divide(b);
                    System.out.println("The result of " + a.num + "/" + b.num + "=" + result);
                } else {
                    System.out.println("No result");
                }
                break;
        }
    }
}

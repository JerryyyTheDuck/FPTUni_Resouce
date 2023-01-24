
import java.util.Scanner;

public class Tools {
    public static String inputString(String msg, String pattern, String error) {
        Scanner sc = new Scanner(System.in);
        String input = "";
        while (true) {
            try {
                System.out.print(msg);
                input = sc.nextLine().toUpperCase();
                if (!input.matches(pattern)) {
                    throw new Exception();
                }
                break;
            } catch (Exception e) {
                System.out.println(error);
            }
        }
        return input;
    }

    public static int inputNumber(String msg, String pattern, String error) {
        Scanner sc = new Scanner(System.in);
        String number = "";
        while (true) {
            try {
                System.out.print(msg);
                number = sc.nextLine();
                if (!number.matches(pattern)) {
                    throw new Exception();
                }
                break;
            } catch (Exception e) {
                System.out.println(error);
            }
        }
        return Integer.parseInt(number);
    }

    public static void menu() {
        System.out.println("Menu");
        System.out.println("\t1. List all Products");
        System.out.println("\t2. List all Customers");
        System.out.println("\t3. Search a Customer based on his/her ID");
        System.out.println("\t4. Add a Customer");
        System.out.println("\t5. Update a Customer");
        System.out.println("\t6. Save Customers to the file, named.txt");
        System.out.println("\t7. List all Orders in ascending order of Customer name");
        System.out.println("\t8. List all pending Orders");
        System.out.println("\t9. Add an Order");
        System.out.println("\t10.Update an Order");
        System.out.println("\t11.Save order to file");
        System.out.println("Others- Quit");
    }


}

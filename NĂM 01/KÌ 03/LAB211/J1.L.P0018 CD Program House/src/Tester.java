
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author green
 */
public class Tester {

    public static void main(String[] args) {
        CDList list = Tool.readFile();
        int index = list.getCDCounterInFile();
        list.setCdCounter(index);
        Scanner sc = new Scanner(System.in);
        int choice = 0;
        do {
            Tool.Menu();
            choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    CD cdCase1 = new CD();
                    cdCase1.inputCdInfo();
                    if (!list.addCDToList(cdCase1)) {
                        System.out.println("unable to add cd ");
                    }
                    break;
                case 2:
                    CD cdCase2 = new CD();
                    String title = Tool.input("Input Collection title: ", "^[a-zA-Z]+$", "Invalid collection title");
                    if (list.findCDInList(title) != null) {
                        System.out.println("\tTHE RESULT");
                        System.out.format("%-20s%-20s%-20s%-20S%-20s%-20S\n", "COLLECTION NAME", "TYPE", "TITLE", "UNIT PRICE", "ID", "PUBLISHING YEAR");
                        cdCase2 = list.findCDInList(title);
                        cdCase2.outputCDInfo();
                    }
                    break;
                case 3:
                    list.displayCDInList();
                    break;
                case 4:
                    if (list.checkEmpty()) {
                        System.out.println("There is no data");
                    } else {
                        String title1 = Tool.input("Input Collection title: ", "^[a-zA-Z]+$", "Invalid collection title");
                        CD cd1 = list.findCDInList(title1);
                        if (cd1 != null) {
                            Tool.updateMenu();
                            int choice1 = Integer.parseInt(sc.nextLine());
                            switch (choice1) {
                                case 1:
                                    list.updateInList(cd1);
                                    break;
                                case 2:
                                    int index1 = list.getIndex(cd1);
                                    list.removeItem(index1);
                                    System.out.println("Success");
                                    break;
                            }
                        }
                    }
                    break;
                case 5:
                    list.writeFile();
                    break;
                case 6:
                    list.readCurrenFile();
                    break;
                case 7:
                    System.out.println("Bye");
                    break;
            }
        } while (choice > 0 && choice < 7);
    }

}

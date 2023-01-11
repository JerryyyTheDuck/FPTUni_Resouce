package gui;

import data.Product;
import data.ProductList;
import java.util.Collections;
import java.util.Scanner;
import java.util.TreeSet;
import myTool.Tool;

/**
 *
 * @author Jack
 */
public class tester {
    public static void main(String[] args) {
        final String letter_regEx = "^[a-zA-Z]+$";
        ProductList list = new ProductList();
        int choice = 0;
        char c = 0;
        Scanner sc = new Scanner(System.in);
        do {
            Tool.menu();
            choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    do {
                        list.displayProduct();
                        c = Tool.returnMenu();
                    } while (c != 'Y');
                    break;
                case 2:
                    do {
                        list.addProductInList();
                        c = Tool.returnMenu();
                    } while (c != 'Y');
                    break;
                case 3:
                    do {
                        if (list.checkEmpty()) {
                            System.out.println("There is no data");
                            break;
                        } else {
                            list.searchProuductByName();
                            break;
                        }
                    } while (c != 'Y');
                    break;
                case 4:
                    do {
                        if (!list.checkEmpty()) {
                            list.searchProductByNameContain();
                        }
                        c = Tool.returnMenu();
                    } while (c != 'Y');
                    break;
                case 5:
                    do {
                        if (list.checkEmpty()) {
                            System.out.println("There is no data at all");
                        } else {
                            Product p1 = list.searProductByID();   
                            if (p1 != null) {
//                                do {
                                    Tool.updateMenu();
                                    int choice1 = Integer.parseInt(sc.nextLine());
                                    switch (choice1) {
                                        case 1:
                                            list.updateInList(p1);
                                            list.displayProduct();
                                            break;
                                        case 2:
                                            list.deleteProductByID(p1.getId());
                                            System.out.println("Success");
                                            break;
                                    }
//                                } while (choice < 3 && choice > 0);
                            } else {
                                System.out.println("No name with this search");
                            }
                        }
                        c = Tool.returnMenu();
                    } while (c != 'Y');
                    break;
                case 6:
                    list.writeFile();
                    break;
                case 7:
                    list.readCurrentSaveFile();
                    break;
                case 8:
                    System.out.println("Have a great day");
                    break;
            }
        } while (choice < 8 && choice > 0);
    }
}

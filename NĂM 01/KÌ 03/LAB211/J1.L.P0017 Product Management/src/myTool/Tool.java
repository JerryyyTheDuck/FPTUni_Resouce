/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package myTool;

import java.io.BufferedReader;
import java.io.*;
import java.io.FileReader;
import java.net.FileNameMap;
import java.nio.Buffer;
import java.util.Scanner;
import java.util.*;
import java.io.FileWriter;
import data.Product;
import data.ProductList;

/**
 *
 * @author Jack
 */
public class Tool {
    //menu
    public static void menu() {
        System.out.println("Menu");
        System.out.println("\t1. Print");
        System.out.println("\t2. Create a Product");
        System.out.println("\t3. Check exist Product");
        System.out.println("\t4. Search Product's information by name");
        System.out.println("\t5. Update product");
        System.out.println("\t6. Save Products to file");
        System.out.println("\t7. Print list Products from the file");
        System.out.println("\t8. Quit");
        System.out.print("Your choice: ");
    }
    public static void updateMenu() {
        System.out.println("\t1. Update product");
        System.out.println("\t2. Remove product");
        System.out.println("\t3. Quit this function");
        System.out.print("Your choice: ");
    }
    public static char returnMenu() {
        Scanner sc = new Scanner(System.in);
        char c;
        String regEx = "^(Y|N|YES|NO)$", choice;
        while (true) {
            try {
                System.out.print("Do you want to go back to menu ?: ");
                choice = sc.nextLine().toUpperCase();
                if (!choice.matches(regEx)) {
                    throw new Exception();
                }
                break;
            } catch (Exception e) {
                System.out.println("Only input yes or no");
            }

        }
        return choice.charAt(0);
    }
    //read,write
    public static void writeFile(TreeSet<Product> list) {
        try {
            FileWriter fr = new FileWriter("Product.dat");
            BufferedWriter bw = new BufferedWriter(fr);
            for (Product product : list) {
                bw.write(product.toString());
                bw.newLine();
            }
            bw.close();
            fr.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static TreeSet<Product> readFile() {
        TreeSet<Product> list = new TreeSet<>();
        try {
            FileReader fr = new FileReader("Product.dat");
            BufferedReader br = new BufferedReader(fr);
            String line = "";
            while (true) {
                line = br.readLine();
                if (line == null) {
                    break;
                }
                String text[] = line.split(";");
                String id = text[0];
                String name = text[1];
                int unitPrice = Integer.parseInt(text[2]);
                int quantity = Integer.parseInt(text[3]);
                String status = text[4];
                list.add(new Product(id, name, unitPrice, quantity, status));
            }
            br.close();
            fr.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
    //input
    public static String input(String msg, String pattern, String error) {
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
    public static int inpputNumber(String msg, String pattern, String error) {
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

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tool;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;
import Library.SLL;
import data.train;
import Library.Node;
import data.Customer;

/**
 *
 * @author green
 */
public class MyTool {

    public static void Menu() {
        System.out.println("========================================");
        System.out.println("Welcome to Main Menu");
        System.out.println("1. Train List");
        System.out.println("2. Customer List");
        System.out.println("3. Booking List");
        System.out.println("4. Quit");
    }
    public static void MenuForTrain() {
        System.out.println("========================================");
        System.out.println("Welcome to Train Menu");
        System.out.println("1. Load data from file");
        System.out.println("2. Input and add to the head");
        System.out.println("3. Display data");
        System.out.println("4. Save train list to the file");
        System.out.println("5. Search by tcode");
        System.out.println("6. Delete by tcode");
        System.out.println("7. Sort by tcode");
        System.out.println("8. Add after position k");
        System.out.println("9. Delete tcode before the input tcode");
        System.out.println("10. Return menu");

    }
    public static void menuBanner() {
        System.out.println("tcode|Train_name|Seat|booked|depart_time|depart_place|availabe_seat");
        System.out.println("--------------------------------------------------------------");
    }
    public static void menuForCus() {
        System.out.println("========================================");
        System.out.println("Welcome to Customer Menu");
        System.out.println("1. Load data from file");
        System.out.println("2. Input customer");
        System.out.println("3. Display data");
        System.out.println("4. Save to file");
        System.out.println("5. Search by ccode");
        System.out.println("6. Delete by ccode");
        System.out.println("7. Return menu");
    }
    public static void menuForBooking(){
        System.out.println("1. Input data");
        System.out.println("2. Display booking data");
        System.out.println("3. Sort by tcode");
        System.out.println("4. Return to Menu");
    }
    public static char returnMainMenu() {
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

    public static String inputString(String msg, String regEx, String error) {
        Scanner sc = new Scanner(System.in);
        String input = "";
        while (true) {
            try {
                System.out.print(msg);
                input = sc.nextLine();
                if (!input.matches(regEx)) {
                    throw new Exception();
                }
                break;
            } catch (Exception e) {
                System.out.println(error);
            }
        }
        return input;
    }
    public static int inputIntNumber(String msg, String error) {
        int number = 0;
        Scanner sc = new Scanner(System.in);
        while (true) {
            try {
                System.out.print(msg);
                number = Integer.parseInt(sc.nextLine());
                if (number < 0) {
                    throw new Exception();
                }
                break;
            } catch (Exception e) {
                System.out.println(error);
            }
        }
        return number;
    }
    public static double inputDoubleNumber(String msg, String error) {
        double number = 0;
        Scanner sc = new Scanner(System.in);
        while (true) {
            try {
                System.out.print(msg);
                number = Double.parseDouble(sc.nextLine());
                if (number < 0) {
                    throw new Exception();
                }
                break;
            } catch (Exception e) {
                System.out.println(error);
            }
        }
        return number;
    }
    public static int inputChoice(String msg, String error, int max){
        int number = 0;
        Scanner sc = new Scanner(System.in);
        while (true) {
            try {
                System.out.print(msg);
                number = Integer.parseInt(sc.nextLine());
                if (number < 0 || number > max) {
                    throw new Exception();
                }
                break;
            } catch (Exception e) {
                System.out.println(error);
            }
        }
        return number;

    }

    public static void writeFileTrain(SLL<train> list) {
        try {
            FileWriter fr = new FileWriter("Train.dat");
            BufferedWriter bw = new BufferedWriter(fr);
            Node<train> temp = list.getHead();
            for (int i = 0; i <= list.getSize(); i++) {
                bw.write(temp.getValue().toString());
                temp = temp.getNext();
                bw.newLine();
            }
            bw.close();
            fr.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static SLL<train> readFileTrain() {
        SLL<train> list = new SLL();
        try {
            FileReader fr = new FileReader("Train.dat");
            BufferedReader br = new BufferedReader(fr);
            String line = "";
            while (true) {
                line = br.readLine();
                if (line == null) {
                    break;
                }
                String[] text = line.split(" \\| ");
                String tcode = text[0];
                String train_name = text[1];
                int seat = Integer.parseInt(text[2]);
                int booked = Integer.parseInt(text[3]);
                double depart_time = Double.parseDouble(text[4]);
                String depart_place = text[5];
                train t = new train(tcode, train_name, seat, booked, depart_time, depart_place, (seat - booked));
                list.addLast(t);
            }
            br.close();
            fr.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
    public static void writeFileCus(SLL<Customer> list) {
        try {
            FileWriter fr = new FileWriter("Customer.dat");
            BufferedWriter bw = new BufferedWriter(fr);
            Node<Customer> temp = list.getHead();
            for (int i = 0; i <= list.getSize(); i++) {
                bw.write(temp.getValue().toString());
                temp = temp.getNext();
                bw.newLine();
            }
            bw.close();
            fr.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static SLL<Customer> readFileCus() {
        SLL<Customer> list = new SLL();
        try {
            FileReader fr = new FileReader("Customer.dat");
            BufferedReader br = new BufferedReader(fr);
            String line = "";
            while (true) {
                line = br.readLine();
                if (line == null) {
                    break;
                }
                String[] text = line.split(" \\| ");
                String ccode = text[0];
                String name = text[1];
                String phone = text[2];
                Customer cus = new Customer(ccode, name, phone);
                list.addLast(cus);
            }
            br.close();
            fr.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
    
}

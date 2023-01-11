
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;
import java.util.TreeSet;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author green
 */
public class Tool {

    public static void Menu() {
        System.out.println("1. Add CD to the catalog");
        System.out.println("2. Search CD by title");
        System.out.println("3. Display the catalog");
        System.out.println("4. Update CD");
        System.out.println("5. Save account to file.");
        System.out.println("6. Print list CDs from file");
        System.out.println("7. Quit");
        System.out.print("Your choice: ");
    }

    public static void updateMenu() {
        System.out.println("1. Update CD information");
        System.out.println("2. Delete CD information");
        System.out.println("3. Quit");
        System.out.print("Your choice: ");

    }

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

    public static void writeFile(CDList list) {
        try {
            FileWriter fr = new FileWriter("CD.dat");
            BufferedWriter bw = new BufferedWriter(fr);
            for (int i = 0; i < list.getCdCounter(); i++) {
                bw.write(list.getToString(i));
                bw.newLine();
            }
            bw.close();
            fr.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static CDList readFile() {
       
        CDList list = new CDList();
            try {
            FileReader fr = new FileReader("CD.dat");
            BufferedReader br = new BufferedReader(fr);
            String line = "";
            while (true) {
                line = br.readLine();
                if (line == null) {
                    break;
                }
                String text[] = line.split(";");
                String collectionName = text[0];
                String type = text[1];
                String title = text[2];
                int unitPrice = Integer.parseInt(text[3]);
                String id = text[4];
                int publishingYear = Integer.parseInt(text[5]);
                CD cd = new CD(collectionName, type, title, unitPrice, id, publishingYear);
                list.addCDToList(cd);
            }
            br.close();
            fr.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
    
}

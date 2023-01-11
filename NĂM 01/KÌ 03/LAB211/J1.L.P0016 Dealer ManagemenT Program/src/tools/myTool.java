/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tools;

import java.io.*;
import java.util.*;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.text.ParseException;

/**
 *
 * @author Jack
 */
public class myTool {

    public static final Scanner sc = new Scanner(System.in);

    public static boolean validStr(String str, String regEx) {
        return str.matches(regEx);
    }

    public static boolean validPassword(String str, int min) {
        if (str.length() < min) {
            return false;
        }
        return str.matches(".*[a-zA-Z]+.*")
                && str.matches(".*[\\d]+.*")
                && str.matches(".*[\\w]+.*"); // + it nhat 1 lan  
    }

    public static Date parseDate(String dateStr, String dateFormat) {  //tu stirng ra date thi parse
        SimpleDateFormat df = (SimpleDateFormat) SimpleDateFormat.getInstance();
        df.applyPattern(dateFormat);
        try {
            long time = df.parse(dateFormat).getTime();
            return new Date(time);
        } catch (ParseException e) {
            System.out.println("Error: " + e);
        }
        return null;
    }

    public static String dateToString(Date date, String dateFormat) { //tu date ra string la format
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        dateFormat = formatter.format(date);
        return dateFormat;
    }

    public static boolean parseBool(String word) {
        char c = word.trim().toUpperCase().charAt(0);
        return (c == '1' || c == 'Y' || c == 'T');
    }

    public static String readNoBlank(String msg) {
        String input = "";
        do {
            System.out.println(msg + ": ");
            input = sc.nextLine().trim();
        } while (input.isEmpty());
        return input;
    }

    public static String readInput(String msg, String pattern) {
        String input = "";
        while (true) {
            try {
                System.out.println(msg + ": ");
                input = sc.nextLine();
                if (!input.matches(pattern)) {
                    throw new Exception();
                }
                break;
            } catch (Exception e) {
                System.out.println("Error: " + e);
            }
        }
        return input;
    }

    public static boolean readBool(String msg) {
        String input = "";
        String regEx = "[0|1|T|F|Y|N]";
        while (true) {
            try {
                System.out.println(msg + ": ");
                input = sc.nextLine();
                if (!input.matches(regEx)) {
                    throw new Exception();
                }
                break;
            } catch (Exception e) {
                System.out.println("Only input 1/0-Y/N-T/F");
            }
        }
        char c = Character.toLowerCase(input.charAt(0));
        return (c == '1' || c == 'Y' || c == 'T');
    }

//    public static List<String> readFile(String fileName) {
//        File file = new File(fileName);
//        ArrayList<String> list = new ArrayList();
//        try {
//            file.createNewFile();
//            Scanner sc = new Scanner(file);
//            while (sc.hasNext()) {                
//                String line = sc.nextLine().trim();
//                list.add(line);
//            }
//            sc.close();
//        } catch(Exception r)  {
//            r.printStackTrace();
//        }
//        return list;
//    }
    public static List<String> readFile(String fileName) {
        BufferedReader reader;
        File file = new File(fileName);
        ArrayList<String> list = new ArrayList<>();
        if (file.exists()) {
            try {
                reader = new BufferedReader(new FileReader(file));
                String line = reader.readLine().trim();
                while (line != null) {
                    if (!line.isEmpty()) {
                        list.add(line);
                    }
                    line = reader.readLine().trim();
                }
                reader.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return list;
    }

    public static void writeFile(File file, List list) {//ghi de
        try {
            FileWriter wr = new FileWriter(file);
            PrintWriter pr = new PrintWriter(wr);
            for (int i = 0; i < list.size(); i++) {
                pr.println(list.get(i));
            }
            pr.close();
            wr.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mylib;

import java.util.Scanner;

/**
 *
 * @author user
 */
//lop nay chi nen chua cac ham lam thu vien cho cac project
//khac su dung
public class Validation {
    //ham nay de nhap 1 number
    //no >=min and <=max
    //tra ve so da nhap
    public static double inputNumber(String msg,double min, double max) throws Exception{
        Scanner s=new Scanner(System.in);
        System.out.println(msg);
        double number=s.nextDouble();   
        if(number<min || number>max) throw new Exception();
        return number;
    }
    //ham nay de nhap chuoi tu ban phim
    //so sanh chuoi nhap voi 1 format 
    //tra ve chuoi nhap
    public static String inputString(String msg, String format) throws Exception{
        Scanner s=new Scanner(System.in);
        System.out.println(msg);
        String str=s.nextLine();
        if(!str.matches(format)) throw new Exception();
        return str;
    }
}

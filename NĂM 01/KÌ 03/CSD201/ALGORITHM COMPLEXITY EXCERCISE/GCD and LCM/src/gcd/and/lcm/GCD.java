/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gcd.and.lcm;

/**
 *
 * @author green
 */
public class GCD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(findGCD(4, 6));
        System.out.println(findGCD(7, 4));
        System.out.println(findGCDByRecursion(4, 6));
        System.out.println(findGCDByRecursion(7, 4));
    }
    static int findGCD(int a, int b){
        int result = 0;
        for (int i = 1; i <= a && i <=b; i++) {
            if(a%i == 0 && b%i == 0){
                result = i;
            }
        }
        return result;
    }
    static int findGCDByRecursion(int a, int b){
        int reminder = 0;
        if(a == 0){
            return b;
        }if(b == 0){
            return a;
        }else{
            if(a < b){
                int temp = a;
                a = b;
                b = temp;
            }
            reminder = a%b;
        }
        return findGCDByRecursion(b, reminder);
    }
}

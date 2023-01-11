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
        System.out.println(fibananciRecursion(6));
        System.out.println(fibonanci(6));
    }
    static int fibananciRecursion(int n){
        if(n <= 1){
            return 1;
        }
        return fibananciRecursion(n-1) + fibananciRecursion(n-2);
    }
    static int fibonanci(int n){
        int result = 2;
        if(n <= 1){
            return 1;
        }else{
            int a = 1;
            int b = 1;
            for (int i = 1; i < n; i++) {
                result = a+b;
                a = b;
                b = result;
            }
        }
        return result;
    }
}

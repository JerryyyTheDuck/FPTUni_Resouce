
import java.util.Stack;

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
        System.out.println(factorialLoop(4));
        System.out.println(factorialRecursion(4));
        System.out.println(factorialStack(4));
    }

    public static int factorialLoop(int n) {
        int total = 1;
        for (int i = 1; i <= n; i++) {
            total *= i;
        }
        return total;
    }

    public static int factorialRecursion(int n) {
        if (n == 1) {
            return 1;
        } else {
            return factorialRecursion(n - 1) * n;
        }
    }

    public static int factorialStack(int n) {
        int total = 1;
        Stack<Integer> list = new Stack();
        for (int i = 1; i <= n; i++) {
            list.push(i);
        }
        for (int i = 0; i <= list.size(); i++) {
            total = total * list.pop();

        }
        return total;
    }
}

package data;

import java.io.ObjectStreamConstants;
import java.net.InterfaceAddress;
import java.util.Scanner;

public class Tester3 {

    public static String add(String bigA, String bigB) {
        MyStack<Integer> stackA = new MyStack<>();
        MyStack<Integer> stackB = new MyStack<>();
        MyStack<Integer> stackC = new MyStack<>();
        for (int i = 0; i < bigA.length(); i++) {
            stackA.push(Integer.parseInt(Character.toString(bigA.charAt(i))));
        }
        for (int i = 0; i < bigB.length(); i++) {
            stackB.push(Integer.parseInt(Character.toString(bigB.charAt(i))));
        }
        String rs = "";
        int a, b;
        while (stackA.size() > 0) {
            a = stackA.pop();
            b = stackB.pop();
            if (a + b >= 10) {
                stackC.push((a + b) % 10);
                int c = (a + b) / 10;
                int d = stackA.pop() + c;
                stackA.push(d);
            } else {
                stackC.push(a + b);
            }
        }
        while (!stackC.isEmpty()) {
            rs += stackC.pop();
        }
        if (rs.charAt(0) == '0') {
            rs = rs.substring(1);
        }
        return rs;
    }

    public static String sub(String bigA, String bigB) {
        MyStack<Integer> stackA = new MyStack();
        MyStack<Integer> stackB = new MyStack();
        MyStack<Integer> stackC = new MyStack();
        for (int i = 0; i < bigA.length(); i++) {
            stackA.push(Integer.parseInt(Character.toString(bigA.charAt(i))));
        }
        for (int i = 0; i < bigB.length(); i++) {
            stackB.push(Integer.parseInt(Character.toString(bigB.charAt(i))));
        }
        String result = "";
        int rs = 0;
        int a, b;
        while (!stackA.isEmpty()) {
            a = stackA.pop();
            b = stackB.pop();
            if (a < b) {
                a = a + 10;
                stackC.push(a - b);
                int d = stackB.pop() + 1;
                stackB.push(d);
            } else {
                stackC.push(a - b);
            }
        }
        while (!stackC.isEmpty()) {
            result += Integer.toString(stackC.pop());
        }
        if (result.charAt(0) == '0') {
            result = result.substring(1);
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the big number 1: ");
        String bigA = sc.nextLine();
        System.out.print("Enter the big number 2: ");
        sc = new Scanner(System.in);
        String bigB = sc.nextLine();
        System.out.println(add(bigA, bigB));
        System.out.println(sub(bigA, bigB));

    }
}

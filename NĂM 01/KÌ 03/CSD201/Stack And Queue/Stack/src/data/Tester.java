/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;

/**
 *
 * @author green
 */
public class Tester {

    public static void main(String[] args) {
        MyStack<Integer> list = new MyStack<>();
        list.push(3);
        list.push(4);
        list.push(5);
        System.out.println(list.pop());
        System.out.println(list.top());
        System.out.println("================");
        System.out.println(findBinary(10));
//        System.out.println(checkParentheless("[()]"));
    }

    public static long findBinary(int divisor) {
        MyStack<Integer> list = new MyStack<>();
        String binary = "";
        int surplus;
        long result;
        while (divisor >= 1) {
            surplus = divisor % 2;
            list.push(surplus);
            divisor = divisor / 2;
        }
        while (!list.isEmpty()) {
            binary += Integer.toString(list.pop());
        }
        return result = Long.parseLong(binary);
    }
    
    public static boolean checkParen(String input){
        MyStack<Character> list = new MyStack<>();
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if( c == '{' || c == '[' || c == '('){
                list.push(input.charAt(i));
            }
        }
        return true;
    }

//    public static boolean checkParentheless(String input) {
//        char check;
//        MyStack<Character> list = new MyStack<>();
//        for (int i = 0; i < input.length(); i++) {
//            if (input.charAt(i) == '(' || input.charAt(i) == '['
//                    || input.charAt(i) == '{') {
//                list.push(input.charAt(i));
//            }
//            if (input.charAt(i) == ')' || input.charAt(i) == ']'
//                    || input.charAt(i) == '}') {
//                if (input.charAt(i) == ')') {
//                    check = list.pop();
//                    if (check == '(') {
//                        return true;
//                    } else {
//                        return false;
//                    }
//                }
//                if (input.charAt(i) == ']') {
//                    check = list.pop();
//                    if (check == ']') {
//                        return true;
//                    } else {
//                        return false;
//                    }
//                }
//                if (input.charAt(i) == '}') {
//                    check = list.pop();
//                    if (check == '{') {
//                        return true;
//                    } else {
//                        return true;
//                    }
//                }
//            } else {
//                return false;
//            }
//        }
//        if (!list.isEmpty()) {
//            return false;
//        }
//        return true;
//    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author green
 */
public class Padlidrome {

    public static void main(String[] args) {
        System.out.println(checkPadlindrome("abcdcba"));
        System.out.println(checkPadlindrome("abcdecba"));
        System.out.println(checkPalindromeRecursion("abcdecba"));
        System.out.println(checkPalindromeRecursion("abcdcba"));

    }

    static boolean checkPadlindrome(String check) {
        String rev = "";
        for (int i = check.length() - 1; i >= 0; i--) {
            rev += check.charAt(i);
        }
        if (rev.equals(check)) {
            return true;
        }
        return false;
    }

    static boolean checkPalindromeRecursion(String check) {
        if (check.length() == 1) {
            return true;
        }
        if (check.charAt(0) != check.charAt(check.length() - 1)) {
            return false;
        }
        return checkPalindromeRecursion(check.substring(1, check.length() - 1));
    }
}

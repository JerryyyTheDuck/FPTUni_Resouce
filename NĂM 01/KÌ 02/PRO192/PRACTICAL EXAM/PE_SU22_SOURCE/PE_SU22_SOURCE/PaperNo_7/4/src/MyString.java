
import java.util.Arrays;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author green
 */
public class MyString implements IString {

    public boolean checkPrime(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count++;
            }
        }
        if (count == 2) {
            return true;
        }
        return false;
    }

    @Override
    public int f1(String string) {
        int sum = 0;
        for (int i = 0; i < string.length(); i++) {
            char check = string.charAt(i);
            if (Character.isDigit(check)) {
                String s = String.valueOf(check);
                int num = Integer.parseInt(s);
                if (checkPrime(num)) {
                    sum = sum + num;
                }
            }
        }

        return sum;
    }

    @Override
    public String f2(String string) {
        int maxFreq = 0;
        String mostFreq = "";
        String list[] = string.split(" ");
        for (int i = 0; i < list.length; i++) {
            int countFreq = 1;
            for (int j = i + 1; j < list.length; j++) {
                if (list[i].equals(list[j])) {
                    countFreq++;
                    if (countFreq > maxFreq) {
                        maxFreq = countFreq;
                        mostFreq = list[i];
                    }

                }
            }
        }
        for (int i = 0; i < list.length; i++) {
            if (list[i].equals(mostFreq)) {
                list[i] = list[i].replace(list[i], "T");
            }
        }
        String s = Arrays.toString(list).replace("[", "").replace("]", "").replace(",", " ");
        return s;
    }
//cd ab xyz ab xyz xyz ab cd
}

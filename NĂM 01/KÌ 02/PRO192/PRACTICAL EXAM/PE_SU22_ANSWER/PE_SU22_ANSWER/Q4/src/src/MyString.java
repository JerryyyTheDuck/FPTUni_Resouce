
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

    @Override
    public int f1(String string) {
        int sum = 0;
        String word[] = string.split(" ");
        for (int i = 0; i < word.length; i++) {
            if (word[i].contains("1") || word[i].contains("3") || word[i].contains("5")
                    || word[i].contains("7") || word[i].contains("9")) {
                sum++;
            }
        }
        return sum;
    }
// a a1 b2 c34 d6
     @Override
    public String f2(String string) {
        String word[] = string.split(" ");
        for (int i = 0; i < word.length; i++) {
            String str = word[i];
            String rvstr = "";
            for (int j = word[i].length() - 1; j >= 0; j--) {
                rvstr = rvstr + str.charAt(j);
            }
            if (str.equals(rvstr)) {
                word[i] = "XX";
                break;
            }
// ab 12321 uv 12321 xy

        }
        String s = Arrays.toString(word).replace("[", "").replace("]", "").replace(",", "");
        return s;

    }
}

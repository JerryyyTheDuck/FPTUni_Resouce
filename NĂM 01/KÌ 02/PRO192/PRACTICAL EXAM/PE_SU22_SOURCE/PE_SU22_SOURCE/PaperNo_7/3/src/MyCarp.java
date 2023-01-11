
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author green
 */
public class MyCarp implements ICarp {

    @Override
    public int f1(List<Carp> list) {
        int count = 0;
        for (Carp carp : list) {
            char c = carp.getPond().charAt(1);
            if (Character.valueOf(c).isDigit(c)) {
                if (c % 2 == 0) {
                    count++;
                }
            }
        }
        return count;
    }

    public boolean checkPadlin(String s) {
        String rev = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            rev = rev + s.charAt(i);
        }
        if (s.equals(rev)) {
            return true;
        }
        return false;
    }

    @Override
    public void f2(List<Carp> list) {
        int count = 0;
        for (Carp carp : list) {
            if (checkPadlin(carp.getPond())) {
                carp.setState(99);
                count++;
                if (count >= 1) {
                    break;
                }
            }
        }
    }

    @Override
    public void f3(List<Carp> list) {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4-i; j++) {
                if (list.get(j).getState() > list.get(j+1).getState()) {
                    Collections.swap(list, j,j+1);
                }
                if (list.get(j).getState() == list.get(j+1).getState()) {
                    if(list.get(j).getPond().charAt(1) > list.get(j+1).getPond().charAt(1)){
                        Collections.swap(list, j, j+1);
                    }
                }
            }
        }

    }

}

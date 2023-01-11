/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Apriori;

/**
 * @author Nguyên
 */
import java.util.HashSet;
import java.util.Set;
import java.text.DecimalFormat;

public class Law {
    DecimalFormat newFormat = new DecimalFormat("#.###");
    Set<Integer> setA;
    Set<Integer> setB;
    double min_conf;

    public Law(Set<Integer> setA, Set<Integer> setB, double min_conf) {
        this.setA = setA;
        this.setB = setB;
        this.min_conf = min_conf;
    }

    public Law(double min_conf) {
        this.setA = new HashSet<>();
        this.setB = new HashSet<>();
        this.min_conf = min_conf;
    }

    public void setMin_conf(double min_conf) {
        this.min_conf = min_conf;
    }

    public String print() {
        min_conf = min_conf *100;
        String res = "";
        for (Integer i : setA) {
            res += i;
        }
        res += " --> ";
        for (Integer j : setB) {
            res += j;
        }
        res += "\t min_conf= " + Double.valueOf(newFormat.format(min_conf)) + " %";
        if(Double.valueOf(newFormat.format(min_conf)) >= 50){
            res += "\t Strong Association";
        }
        return res;
    }

}

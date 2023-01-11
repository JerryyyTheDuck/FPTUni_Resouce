
import java.util.*;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author green
 */
public class HaNoiTower {

    static void towerHanoiRecursion(int n, char first, char third, char second) {
        if (n == 1) {
            return;
        }
        towerHanoiRecursion(n - 1, first, second, third);
        System.out.println("Move disk " + n + " from rod " + first + " to rod " + third);
        towerHanoiRecursion(n - 1, second, third, first);
    }

    public void towerHanoi(int n, char first, char third, char second) {

    }

    public static void main(String args[]) {
        towerHanoiRecursion(3, 'A', 'C', 'B');
    }
}

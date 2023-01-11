/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package basicqueue;

/**
 *
 * @author green
 */
public class BasicQueue {

    public static void main(String[] args) {
        MyQueue<Integer> list = new MyQueue<>();
        list.enqueue(7);
        list.enqueue(8);
        list.enqueue(9);
        System.out.println(list.peakFront());
        System.out.println(list.dequeue());
        System.out.println(list.peakLast());
//        System.out.println(checkBinrayUsingQueue(1200000));
        checkBinaryFrom1ToN(8);
    }

    public static String checkBinrayUsingQueue(int i) {
        MyQueue<Integer> list = new MyQueue();
        int surplus = 0;
        String binary = "";
        while (i >= 1) {
            surplus = i % 2;
            list.enqueue(surplus);
            i /= 2;
        }
        for (int j = list.getSize() - 1; j >= 0; j--) {
            binary += list.getValue(j);
        }
        return binary;
    }
    public static void checkBinaryFrom1ToN(int n){
        for (int i = 1; i <= n; i++) {
            System.out.println(checkBinrayUsingQueue(i));
        }
    }
}

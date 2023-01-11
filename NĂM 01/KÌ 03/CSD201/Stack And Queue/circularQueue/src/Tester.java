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
        MyCirularQueue<Integer> list = new MyCirularQueue<>();
        list.enQueue(14);
        list.enQueue(22);
        list.enQueue(13);
        list.enQueue(-6);

        list.displayAll();
        System.out.println();
        System.out.println("Deleted value = " + list.deQueue());
        System.out.println();
        System.out.println("Deleted value = " + list.deQueue());

        list.displayAll();
        System.out.println();

        list.enQueue(9);
        list.enQueue(20);
        list.enQueue(5);

        System.out.println();
        list.displayAll();
        list.enQueue(20);
    }
}

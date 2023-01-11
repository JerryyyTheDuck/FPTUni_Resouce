/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author green
 */
public class MyCirularQueue<T extends Comparable<T>> {

    SLL<T> list = new SLL<>();

    T font(){
        return list.getValue(0);
    }
    T rear(){
        return list.getValue(list.getSize()-1);
    }
    void enQueue(T value){
        list.addLast(value);
    }
    T deQueue(){
        return list.removeFirst();
    }
    void displayAll(){
        list.printAll();
    }
}

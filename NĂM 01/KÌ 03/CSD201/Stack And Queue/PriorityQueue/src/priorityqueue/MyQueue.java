/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package priorityqueue;

/**
 *
 * @author green
 */
public class MyQueue<T extends Comparable<T>> {
    
    SLL<T> list = new SLL<>();
    boolean isEmpty(){
        return list.isEmpty();
    }
    void enqueue(T value){
        list.addLast(value);
    }
    
    int getSize(){
        return list.getSize();
    }
    T dequeue(){
        return list.removeFirst();
    }
    T peakFront(){
        return list.getValue(0);
    }
    T peakLast(){
        return list.getValue(list.getSize()-1);
    }
    T getValue(int pos){
        return list.getValue(pos);
    }
}


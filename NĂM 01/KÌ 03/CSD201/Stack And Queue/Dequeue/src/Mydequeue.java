/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author green
 */
public class Mydequeue<T extends Comparable<T>> {

    SLL<T> dequeue = new SLL<>();

    void pushFont(T value) {
        dequeue.addFirst(value);
    }

    void pushLast(T value) {
        dequeue.addLast(value);
    }

    T popFont() {
        return dequeue.removeFirst();
    }

    T popLast() {
        return dequeue.removeLast();
    }
    T peekFont(){
        return dequeue.getValue(0);
    }
    T peekLast(){
        return dequeue.getValue(dequeue.getSize()-1);
    }
    int getSize(){
        return dequeue.getSize();
    }
    void clear(){
        dequeue.removeAll();
    }
    
}

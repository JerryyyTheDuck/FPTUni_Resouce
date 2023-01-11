/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;

/**
 *
 * @author green
 */
public class MyStack<T extends Comparable<T>>{
    
    SLL<T> stack = new SLL();
    
    void push(T value){
        stack.addFirst(value);
    }
    public T pop(){
        return stack.removeFirst();
    }
    
    boolean isEmpty(){
        return stack.isEmpty();
    }
    int size(){
        return stack.getSize();
    }
    
    public T top(){
        return stack.getValue(0);
    }
    
}

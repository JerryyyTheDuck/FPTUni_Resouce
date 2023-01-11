/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se1743.bst;

/**
 *
 * @author BuiHung
 */
public class Node<T extends Comparable<T>> {
    T val;
    Node<T> left,right;
    public Node() { }
    public Node(T val) {
        this.val = val;       
    }
    public Node(T val, Node<T> left, Node<T> right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
    
    
}

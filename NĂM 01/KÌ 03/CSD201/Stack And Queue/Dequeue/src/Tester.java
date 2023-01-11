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
        Mydequeue<Integer> list = new Mydequeue<>();
        list.pushFont(1);
        list.pushFont(2);
        list.pushFont(3);
//        list.clear();
        System.out.println(list.getSize());
        System.out.println(list.peekFont());
        System.out.println(list.peekLast());
        System.out.println(list.popFont());
        System.out.println(list.popLast());
        System.out.println(list.getSize());
        
    }
}

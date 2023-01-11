/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package priorityqueue;

/**
 *
 * @author green
 */
public class Tester {
    public static void main(String[] args) {
      PriorityQueue list  = new PriorityQueue();
      list.enQueue(new Patient("Minh", 12));
      list.enQueue(new Patient("Nguyen", 14));
      list.enQueue(new Patient("Hau", 23));
      list.print();
      System.out.println("=====================");
      list.deQueue();  
      list.print();
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package priorityqueue;

/**
 *
 * @author green
 */
public class PriorityQueue extends MyQueue<Patient> {
    public void enQueue(Patient value) {
        if (isEmpty()) {
            list.addLast(value);
            return;
        } else {
            list.addLast(value);
            Node<Patient> current = list.head, index = null;
            Patient temp;
            if (list.head == null) {
                return;
            } else {
                while (current != null) {
                    index = current.next;
                    while (index != null) {
                        if (current.value.getId() < index.value.getId()) {
                            temp = current.value;
                            current.value = index.value;
                            index.value = temp;
                        }
                        index = index.next;
                    }
                    current = current.next;
                }
            }
        }
    }
    
    public Patient deQueue() {
        return list.removeFirst();
    }
    
    public void print() {
        list.printAll();
    }
    
}

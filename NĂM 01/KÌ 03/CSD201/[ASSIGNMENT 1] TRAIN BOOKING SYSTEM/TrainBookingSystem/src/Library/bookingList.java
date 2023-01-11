/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Library;

import Tool.MyTool;
import data.Customer;
import data.book;
import data.train;

/**
 *
 * @author green
 */
public class bookingList {

    SLL<book> list = new SLL();
    char c;

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public void inputBook(customerList cusList, trainList trainList) {
        do {
            Node<Customer> ctemp = cusList.searchByCcode();
            Node<train> ttemp = trainList.search();
            if (ctemp != null && ttemp != null) {
                if (ttemp.getValue().getAvailable_seat() == 0) {
                    System.out.println("The train is Exhausted");
                } else {
                    if (ttemp.getValue().getAvailable_seat() > 0) {
                        int seat = MyTool.inputIntNumber("Input number of seat: ", "Invalid seat number");
                        if (seat <= ttemp.getValue().getAvailable_seat()) {
                            list.addLast(new book(ttemp.value.getTcode(), ctemp.value.getCcode(), seat));
                            int available = ttemp.getValue().getAvailable_seat();
                            ttemp.value.setAvailable_seat((available - seat));
                        } else {
                            System.out.println("The data is not accepted");
                        }
                    } else {
                        System.out.println("The data is not accepted");
                    }
                }
            } else {
                System.out.println("The data is not accepted");
            }
            c = Tool.MyTool.returnMainMenu();
        } while (c != 'Y');

    }
    public void displayAll() {
        if (isEmpty()) {
            System.out.println("No data found");
        } else {
            Node<book> tmp = list.head;
            while (tmp != null) {
                System.out.println(tmp.value.toString());
                tmp = tmp.next;
            }
        }
    }
    public void sort() {
        do {
            Node<book> current = list.head, index = null;
            book temp;
            if (list.head == null) {
                return;
            } else {
                while (current != null) {
                    index = current.next;
                    while (index != null) {
                        if (current.value.getTcode().compareToIgnoreCase(index.value.getTcode()) > 0) {
                            temp = current.value;
                            current.value = index.value;
                            index.value = temp;
                        }
                        if (current.value.getTcode().compareToIgnoreCase(index.value.getTcode()) == 0) {
                            if (current.value.getCcode().compareToIgnoreCase(index.value.getCcode()) > 0) {
                                temp = current.value;
                                current.value = index.value;
                                index.value = temp;
                            }
                        }
                        index = index.next;
                    }
                    current = current.next;
                }
            }
            displayAll();
            c = MyTool.returnMainMenu();
        } while (c != 'Y');
    }
}

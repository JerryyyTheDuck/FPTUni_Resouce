/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Library;

import Tool.MyTool;
import data.Customer;
import data.train;

/**
 *
 * @author green
 */
public class customerList {

    SLL<Customer> list = Tool.MyTool.readFileCus();
    char c;
    public boolean isEmpty() {
        return list.isEmpty();
    }

    public void displayAll() {
        if (isEmpty()) {
            System.out.println("Nothing to display");
        } else {
            Node<Customer> temp = list.head;
            while (temp != null) {
                System.out.println(temp.value);
                temp = temp.next;
            }
        }
    }

    public void addLast(Customer c) {
        list.addLast(c);
    }

    public Node<Customer> searchByCcode() {
        String ccode = MyTool.inputString("Input customer ccode to search: ", "^[A-Za-z]{1}[0-9]{2}$", "Invalid ccode").toUpperCase();
        Node<Customer> temp = list.head;
        for (int i = 0; i <= list.getSize(); i++) {
            if (ccode.equalsIgnoreCase(temp.value.getCcode())) {
                return temp;
            }
            temp = temp.next;
        }
        return null;
    }

    public boolean checkExisted(Customer check) {
        Node<Customer> temp = list.getHead();
        for (int i = 0; i <= list.getSize(); i++) {
            if (temp.getValue().getCcode().equalsIgnoreCase(check.getCcode())) {
                return true;
            }
            temp = temp.getNext();
            if (temp == null) {
                break;
            }
        }
        return false;
    }


    //MenuFunction
    public void printList() {
            if (isEmpty()) {
                System.out.println("Nothing to print");
            } else {
                SLL<Customer> list = MyTool.readFileCus();
                list.printAll();
            }
    }
    public void addCusToList() {
        do {
            Customer cus = new Customer();
            cus.inputCustomer();
            if (checkExisted(cus)) {
                System.out.println("This customer code already in list");
            } else {
                addLast(cus);
                System.out.println("Success");
            }
            c = MyTool.returnMainMenu();
        } while (c != 'Y');
    }
    public void saveToFile() {
        MyTool.writeFileCus(list);
        System.out.println("Success");
    }
    public void searchAndPrint() {
        do {
            Node<Customer> cus = new Node();
            cus = searchByCcode();
            if (cus != null) {
                System.out.println(cus.value.toString());
            } else {
                System.out.println("Not found");
            }
            c = Tool.MyTool.returnMainMenu();
        } while (c != 'Y');

    }
    public void delete() {
        do {
            Node<Customer> check = searchByCcode();
            Node<Customer> temp = list.head;
            if (check != null) {
                for (int i = 0; i <= list.getSize(); i++) {
                    if (check.getValue().getCcode().equalsIgnoreCase(temp.getValue().getCcode())) {
                        list.removeNode(i);
                        System.out.println("Sucess");
                    }
                    temp = temp.next;
                }
            } else {
                System.out.println("Cannot find cus to delete");
            }
            c = Tool.MyTool.returnMainMenu();
        } while (c != 'Y');

    }


}

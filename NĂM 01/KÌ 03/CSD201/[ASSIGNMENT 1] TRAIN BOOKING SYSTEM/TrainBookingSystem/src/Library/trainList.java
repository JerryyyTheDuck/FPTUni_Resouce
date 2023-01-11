/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Library;


import Tool.MyTool;
import data.train;

/**
 *
 * @author green
 */
public class trainList {
    SLL<train> list = MyTool.readFileTrain();
    char c;
    public boolean checkEmpty() {
        return list.isEmpty();
    }
    public void addFirst(train el) {
        Node<train> p = new Node<train>(el);
        if (list.isEmpty()) {
            list.head = list.tail = p;
        } else {
            p.next = list.head;
            list.head = p;
        }

    }
    public int checkExisted(train check) {
        int count = 0;
        Node<train> temp = list.getHead();
        for (int i = 0; i < list.getSize(); i++) {
            if (temp.getValue().getTcode().equalsIgnoreCase(check.getTcode())) {
                count++;
                break;
            }
            temp = temp.getNext();
            if (temp == null) {
                break;
            }
        }
        return count;
    }
    public Node<train> search() {
        String tcode = MyTool.inputString("Input train code: ", "^[A-Za-z]{1}[0-9]{2}$", "Invalid train code");
        Node<train> temp = list.getHead();
        for (int i = 0; i <= list.getSize(); i++) {
            if (temp.getValue().getTcode().equalsIgnoreCase(tcode)) {
                return temp;
            }
            temp = temp.next;
        }
        return null;
    }
    
    //print function
    public void printCurrentDataInList(SLL<train> list1) {
        SLL<train> list = list1;
        list.printAll();
    }
    public void printAll() {
        list.printAll();
    }
    public void printAllWithIndex() {
        Node<train> temp = list.head;
        int index = 0;
        while (temp != null) {
            System.out.println(index + " | " + temp.value);
            temp = temp.next;
            index++;
        }
    }

    //menuFunction
    public void printCurrentList(){
            if (checkEmpty()) {
                System.out.println("Nothing to print");
            } else {
                printCurrentDataInList(MyTool.readFileTrain());
            }
    }
    public void addTrainToList(){
        do {
            train t = new train();
            t.inputTrain();
            if (checkExisted(t) != 0) {
                System.out.println("This train code already in list");
            } else {
                addFirst(t);
                printAll();
            }
            c = MyTool.returnMainMenu();
        } while (c != 'Y');

    }
    public void printAllWithBanner(){
        do {
            MyTool.menuBanner();
            printAll();
            c = MyTool.returnMainMenu();
        } while (c != 'Y');

    }
    public void writeFile() {
        MyTool.writeFileTrain(list);
        System.out.println("Success");
    }
    public void searchByTCode(){
        do {
            if (search() != null) {
                System.out.println("Found");
            } else {
                System.out.println("Not found");
            }
            c = MyTool.returnMainMenu();
        } while (c != 'Y');
    }
    public void deleteItem() {
        do {
            printAll();
            Node<train> check = search();
            Node<train> temp = list.getHead();
            if (check != null) {
                for (int i = 0; i <= list.getSize(); i++) {
                    if (check.getValue().getTcode().equalsIgnoreCase(temp.value.getTcode())) {
                        list.removeNode(i);
                    }
                    temp = temp.next;
                }
                System.out.println("Success");
            } else {
                System.out.println("Not found");
            }
            c = MyTool.returnMainMenu();
        } while (c != 'Y');
    }
    public void sortList() {
        do {
            Node<train> current = list.head, index = null;
            train temp;
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
                        index = index.next;
                    }
                    current = current.next;
                }
            }
            printAll();
            c = MyTool.returnMainMenu();
        } while (c != 'Y');

    }
    public void addPos() {
        do {
            printAllWithIndex();
            int position = 0;
            train temp = new train();
            while (true) {
                try {
                    position = MyTool.inputIntNumber("Input position: ", "Invalid posiotion");
                    if (position > list.getSize()) {
                        throw new Exception();
                    }
                    break;
                } catch (Exception e) {
                    System.out.println("Position number must be < " + (list.getSize() + 1));
                }
            }
            temp.inputTrain();
            list.addPos(position + 1, temp);
            c = MyTool.returnMainMenu();
        } while (c != 'Y');

    }
    public void deleteBefore() {
        do {
            printAll();
            Node<train> check = search();
            Node<train> temp = list.getHead();
            if (check != null) {
                for (int i = 0; i <= list.getSize(); i++) {
                    if (check.getValue().getTcode().equalsIgnoreCase(temp.value.getTcode())) {
                        if(i != 0){
                            list.removeNode(i - 1);
                            System.out.println("Success");
                        }else {
                            System.out.println("Cannot delete the train before because this train is the head of the list");
                        }
                    }
                    temp = temp.next;
                }
            } else {
                System.out.println("Not found!");
            }
            c = MyTool.returnMainMenu();
        } while (c != 'Y');
    }

}

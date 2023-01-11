package Library;

import Library.Node;
import Tool.MyTool;
import data.train;
import Library.Node;
import Library.Node;
import java.util.LinkedList;

public class SLL<T extends Comparable<T>> {

    Node<T> head, tail;

    public SLL() {
    }

    public Node<T> getHead() {
        return head;
    }

    public void setHead(Node<T> head) {
        this.head = head;
    }

    public Node<T> getEail() {
        return tail;
    }

    public void setEail(Node<T> tail) {
        this.tail = tail;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addFirst(T el) {
        Node<T> p = new Node<T>(el);
        if (isEmpty()) {
            head = tail = p;
        } else {
            p.next = head;
            head = p;
        }

    }

    public void printAll() {
        Node<T> tmp = head;
        while (tmp != null) {
            System.out.println(tmp.getValue());
            tmp = tmp.next;
        }
    }

    //add last
    public void addLast(T last) {
        Node<T> p = new Node<T>(last);
        if (isEmpty()) {
            head = tail = p;
        } else {
            tail.next = p; //tim pre
            tail = p;   //tim next
        }
    }

    //add in n pos
    public void addPos(int pos, T value) {
        Node<T> p = new Node();
        if (isEmpty()) {
            pos = 0;
            head = tail = p;
        } else {
            Node<T> pre = head;
            for (int i = 0; i < pos - 1; i++) {
                pre = pre.next; //tim pre
            }
            Node<T> after = pre.next; //tim next
            p.next = after;
            pre.next = p;
            p.setValue(value);
        }
    }

    public void removeFirst() {
        if (isEmpty()) {
            System.out.println("nothing to delete");
        } else {
            head = head.next;
        }
    }

    public void removeLast() {
        if (isEmpty()) {
            System.out.println("nothing to delete");
        } else {
            Node<T> pre = head;
            Node<T> temp = pre.next;
            while (temp.next != null) {
                pre = pre.next;
                temp = pre.next;
            }
            pre.next = null;
            tail = pre;
        }
    }

    void removeNode(int position) {
        if (head == null) {
            return;
        }
        Node temp = head;
        if (position == 0) {
            head = temp.next;
            return;
        }
        for (int i = 0; temp != null && i < position - 1;
                i++) {
            temp = temp.next;
        }
        if (temp == null || temp.next == null) {
            return;
        }
        Node next = temp.next.next;
        temp.next = next;
    }
    public int indexOf(T value) {
        int count = 0;
        Node tmp = head;
        while (tmp != null) {
            count++;
            if (tmp.value.equals(value)) {
                return count;
            }
            tmp = tmp.next;
        }
        return -1;
    }

    public int getSize() {
        if (isEmpty()) {
            System.out.println("no data to get size");
        } else {
            Node<T> p = head;
            int count = -1;
            while (p != null) {
                count++;
                p = p.next;
            }
            return count;
        }
        return -1;
    }

    public void printCurrentDataInList(SLL<T> list1) {
        SLL<T> list = list1;
        list.printAll();
    }

}

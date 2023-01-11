package data;

import java.lang.reflect.Array;
import java.util.LinkedList;

public class Tester {

    public static void main(String[] args) {
        SLL sll = new SLL();
        sll.addFirst(5);
        sll.addFirst(7);
        sll.addFirst(9);
        sll.printAll();
        System.out.println("");
        System.out.println("===========");
        LinkedList<Integer> l = new LinkedList<>();
        l.add(5);
        l.add(7);
        l.add(9);
        for (Integer integer : l) {
            System.out.print(integer + " ");
        }
        System.out.println();
        System.out.println(l.indexOf(7));
        System.out.println(l.get(1));
        System.out.println("");
        System.out.println("===========");
        sll.addLast(0);
        sll.printAll();

        System.out.println("");
        System.out.println("===========");
        sll.addPos(2, 2);
        sll.printAll();

        System.out.println("");
        System.out.println("===========");
        sll.removeFirst();
        sll.printAll();

        System.out.println("");
        System.out.println("===========");
        sll.removeLast();
        sll.printAll();

        System.out.println("");
        System.out.println("===========");
        sll.removePos(1);
        sll.printAll();
        System.out.println("");
        System.out.println("===========");
        sll.removeAll();
        sll.printAll();

        System.out.println("");
        System.out.println("===========");
        sll.addFirst(10);
        sll.addFirst(11);
        sll.addFirst(12);
        sll.printAll();
        System.out.println("");
        System.out.print("The position is: " + sll.indexOf(11));

        System.out.println("");
        System.out.println("===========");
        sll.getSize();

        System.out.println("");
        System.out.println("===========");
        SLL<Student> list = new SLL<Student>();
        list.addLast(new Student("Minhh", 23));
        list.addLast(new Student("Nguyen", 25));
        list.printAll();
    }
}

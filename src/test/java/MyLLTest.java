
import org.junit.runner.RunWith;

import static org.junit.Assert.*;


public class MyLLTest {

    @org.junit.Test
    public void addFirst() {
        MyLL list = new MyLL();
        list.addFirst(3);
        list.addFirst(5);
        list.addFirst(8);
        System.out.println("\nPrinting List before adding element to front:--");
        list.printLinkedList(list);

        list.addFirst(9);
        list.addFirst(16);
        list.addFirst(78);
        System.out.println("\nPrinting List after adding element to front:--");
        list.printLinkedList(list);
    }

    @org.junit.Test
    public void addLast() {
        MyLL list = new MyLL();
        list.addFirst(3);
        list.addFirst(5);
        list.addFirst(8);
        System.out.println("\nPrinting List before adding element to last:--");
        list.printLinkedList(list);
        list.addLast(100);
        list.addLast(200);
        list.addLast(300);
        System.out.println("\nPrinting List after adding element to last:--");
        list.printLinkedList(list);
    }

    @org.junit.Test
    public void removeFirst() {
        MyLL list = new MyLL();
        list.addFirst(3);
        list.addFirst(5);
        list.addFirst(8);

        System.out.println("\nPrinting List before removing first element:--");
        list.printLinkedList(list);
        list.removeFirst();
        System.out.println("\nPrinting List after removing first element:--");
        list.printLinkedList(list);
    }

    @org.junit.Test
    public void removeLast() {
        MyLL list = new MyLL();
        list.addFirst(3);
        list.addFirst(5);
        list.addFirst(8);

        System.out.println("\nPrinting List before removing last element:--");
        list.printLinkedList(list);
        list.removeLast();
        System.out.println("\nPrinting List after removing last element:--");
        list.printLinkedList(list);




    }
}

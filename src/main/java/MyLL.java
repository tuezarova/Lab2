public class MyLL<E> {


        Node head;
        Node tail;

        MyLL() {
            this.head = null;
            this.tail = null;
        }

        private static final class Node<E> {
            E data;
            Node next;

            Node(E data) {
                this.data = data;
                this.next = null;

            }
        }

        /*public static void main(String[] args) {


        }*/

        public void addFirst(E data) {
            Node newNode = new Node(data);
            newNode.next = head;
            head = newNode;

        }

        public void addLast(E data) {
            Node newNode = new Node(data);
            Node tmp = head;
            if (head == null)
                head = newNode;
            else {
                while (tmp.next != null) {
                    tmp = tmp.next;
                }

                tmp.next = newNode;
            }

        }

        public void removeFirst() {
            if (head == null)
                return;
            else {
                if (head.next == null)
                    head = null;
                else {
                    head = head.next;
                }
            }
        }

        public void removeLast() {

            if (head == null) {
                return;
            }
            Node previous = null;
            Node current = head;
            if (current.next == null)
                removeFirst();
            else {
                while (current.next != null) {

                    previous = current;
                    current = current.next;

                }
                previous.next = null;
            }

        }

        public void printLinkedList(MyLL list) {
            Node tmp = head;

            while (tmp != null) {
                System.out.printf("%d ", tmp.data);
                tmp = tmp.next;
            }
        }





}

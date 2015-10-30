package lesson16;

/**
 * Created by Джек on 19.04.2015.
 */
public class MyLinkedList2 {
    Node tail;
    Node head;

    public void addHead(int value) {
        Node newNode = new Node (null, value, null);
        if (tail == null) {
            tail = newNode;
            return;
        }
        Node tmp = tail;
        while (tmp.next != null) {
            tmp = tmp.next;
        }
        tmp.next = newNode;

    }public void addTail(int value) {
        Node newNode = new Node (null, value, null);
        if (tail == null) {
            tail = newNode;
            return;
        }

        Node newNod = new Node (null, value, tail);
        tail = newNod;

    }

    public void removeNode (int index) {
        Node node = tail;

        while (index-- > 1) {
            node = node.next;
        }
        node.next = node.next.next;


    }

    public class Node {
        private Node previous;
        private int value;
        private Node next;

        public Node (Node previous, int value, Node next) {
            this.previous = previous;
            this.value = value;
            this.next = next;

        }
    }
}

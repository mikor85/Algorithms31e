package Algorithms.lessonNine.ourLinkedList;

public class MyLinkedList {
    private Node head;
    private int size;

    public MyLinkedList() {
        this.head = null;
        this.size = 0;
    }

    // O(1) - Time complexity
    public void pushToHead(int data) {
        Node node = new Node(data);
        node.setNext(head);
        head = node;
        size++;
    }

    // O(n) - Time complexity
    // O(1) - If you use an additional variable with link to last element
    public void pushToTail(int data) {
        Node node = new Node(data);
        if (head == null) {
            head = node;
            size++;
            return;
        }
        Node current = head;
        while (current.getNext() != null) {
            current = current.getNext();
        }
        current.setNext(node);
    }

    // O(1) - Time complexity
    public boolean removeFirst() {
        if (head == null) {
            return false;
        }
        Node current = head;
        head = current.getNext();
        current.setNext(null);
        size--;
        return true;
    }

    // O(n) - Time complexity
    public boolean removeLast() {
        if (head == null) {
            return false;
        }
        Node current = head;
        Node previous = null;
        while (current.getNext() != null) {
            previous = current;
            current = current.getNext();
        }
        if (previous != null) {
            previous.setNext(null);
        }
        return true;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        Node node = head;
        stringBuilder.append("[");
        while (node != null) {
            stringBuilder.append(node.getData());
            if (node.getNext() != null) {
                stringBuilder.append(", ");
            }
            node = node.getNext();
        }
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    // Home
    // pushToIndex(int index, int data)
    // remove(int index)
    // get(int index)

}

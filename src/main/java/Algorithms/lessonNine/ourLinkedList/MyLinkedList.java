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

    public void pushToIndex(int index, int data) {
        Node node = new Node(data);
        if (head == null) {
            head = node;
            size++;
            return;
        }
        if (index > size || index < 0) {
            System.out.println("Индекс вышел за допустимый предел");
            return;
        }
        if (index == 0) {
            node.setNext(head);
            head = node;
            size++;
            return;
        }
        Node current = head;
        // 2 1 0
        while (current.getNext() != null && index > 1) {
            current = current.getNext();
            index--;
        }
        node.setNext(current.getNext());
        current.setNext(node);
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

    public int get(int index) {
        if (index < 0 || index >= size) {
            System.out.println("Индекс вышел за допустимые пределы");
            return -1;
        }
        if (index == 0) {
            return head.getData();
        }
        Node current = head;
        while (current.getNext() != null) {
            current = current.getNext();
            index--;
            if (index == 0) {
                return current.getData();
            }
        }
        return current.getData();
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

    public boolean remove(int index) {
        if (index < 0 || index >= size) {
            System.out.println("Индекс вышел за допустимые пределы");
            return false;
        }
        if (index == 0) {
            return removeFirst();
        }
        if (index == size - 1) {
            return removeLast();
        }
        Node current = head;
        while (current.getNext() != null) {
            if (index == 1) {
                current.setNext(current.getNext().getNext());
            }
            current = current.getNext();
            index--;
        }
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
        size--;
        return true;
    }

    public int size() {
        return size;
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
}

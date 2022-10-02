package Algorithms.lessonNine.ourLinkedList;

public class ListApp {
    public static void main(String[] args) {
        // 1 - 2 - 3 - 4 - 5
        Node node5 = new Node(5, null);
        Node node4 = new Node(4, node5);
        Node node3 = new Node(3, node4);
        Node node2 = new Node(2, node3);
        Node node1 = new Node(1, node2);

        ListApp listApp = new ListApp();

        listApp.print(node1);
        System.out.println(listApp.getNode(node1, 3));

        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.pushToTail(1);
        System.out.println(myLinkedList);

    }

    private void print(Node node) {
        System.out.print("[");
        while (node != null) {
            if (node.getNext() == null) {
                System.out.print(node.getData() + "]");
                ;
            } else {
                System.out.print(node.getData() + ", ");
            }
            node = node.getNext();
        }
        System.out.println();
    }

    private int getNode(Node node, int number) {
        while (node != null && number > 1) {
            node = node.getNext();
            number--;
        }
        return node.getData();
    }
}

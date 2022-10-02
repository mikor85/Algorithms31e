package Algorithms.lessonNine.homework;

// Задача:
// Написать метод, который будет проверять наличие цикла в связном спиcке.(возвращает true или false)
// Как понять это есть цикл ?
// Для данной задачи, цикл - когда последний элемент связного списка ссылается
// не на null, а на какой либо предыдущий элемент.
// Пример:
// Список без цикла: // 1 - 2 - 3 - 4 - 5
// Список с циклом:  // 1 - 2 - 3 - 4 - 5 - 3

// Список задать можно задать отдельными нодами, как делали на уроке.
// Решение сделать с пространственной сложностью O(1).
// Если есть вопросы, пишите.

import Algorithms.lessonNine.ourLinkedList.Node;

public class HasLinkedListCycle {
    public static void main(String[] args) {
        // 1 - 2 - 3 - 4 - 5 - 3

        Node node6 = new Node();
        Node node5 = new Node(5, node6);
        Node node4 = new Node(4, node5);
        Node node3 = new Node(3, node4);
        Node node2 = new Node(2, node3);
        Node head = new Node(1, node2);
        node6.setNext(node3);

        System.out.println(hasLinkedListCycle(head));
    }

    private static boolean hasLinkedListCycle(Node head) {
        if (head == null) {
            return false;
        }
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.getNext() != null) {
            slow = slow.getNext();
            fast = fast.getNext().getNext();
            if (slow == fast) {
                return true;
            }
        }
        return false;
    }
}
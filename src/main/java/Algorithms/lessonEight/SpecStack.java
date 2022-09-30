package Algorithms.lessonEight;

import java.util.Stack;

public class SpecStack {
    private Stack<Integer> helper = new Stack<>();
    private int top = -1;
    private static int STACK_SIZE = 1000;
    private int[] arr = new int[STACK_SIZE];

    public boolean empty() {
        return top < 0;
    }

    public int peek() {
        if (top < 0) {
            System.out.println("Stack is empty");
            return 0;
        }
        return arr[top];
    }

    public int pop() {
        if (top < 0) {
            System.out.println("Stack is empty");
            return 0;
        }
        if (helper.peek() == arr[top]) {
            helper.pop();
        }
        System.out.println("Element " + arr[top] + " is deleted from stack");
        return arr[top--];
    }

    public void push(int x) {
        if (top < STACK_SIZE - 1) {
            arr[++top] = x;
            System.out.println("Element " + x + " has been added to stack");
        } else {
            System.out.println("Stack overflow");
        }
        if (helper.empty()) {
            helper.push(x);
        } else if (x <= helper.peek()) {
            helper.push(x);
        }
    }

    public int size() {
        return top + 1;
    }

    public int getMin() {
        if (helper.empty()) {
            System.out.print("Stack is empty");
            return 0;
        }
        return helper.peek();
    }

    public void reverseStack() {
        if (!empty()) {
            int topElement = pop();
            reverseStack();
            insertAtBottom(topElement);
        }
    }

    public void insertAtBottom(int i) {
        if (empty()){
            push(i);
        } else {
            int topElement = pop();
            insertAtBottom(i);
            push(topElement);
        }
    }

    public void printStack() {
        System.out.print("[");
        for (int i = top; i >= 0; i--) {
            if (i > 0) {
                System.out.print(arr[i] + ", ");
            } else {
                System.out.println(arr[i] + "]");
            }
        }
    }
}
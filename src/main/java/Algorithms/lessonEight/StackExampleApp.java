package Algorithms.lessonEight;

public class StackExampleApp {
    public static void main(String[] args) {
        SpecStack stack = new SpecStack();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(20);
        stack.push(90);
        stack.push(70);
        stack.push(5);
        System.out.println("Min element is: " + stack.getMin());
        stack.pop();
        System.out.println("Min element is: " + stack.getMin());
        stack.push(9);
        System.out.println("Min element is: " + stack.getMin());
        stack.push(9);
        System.out.println("Min element is: " + stack.getMin());
        stack.pop();
        stack.pop();
        stack.printStack();
        System.out.println("Min element is: " + stack.getMin());
        System.out.println("----------");
        stack.reverseStack();
        System.out.println("----------");
        stack.printStack();
        stack.push(5);
        stack.printStack();
        System.out.println("Min element is: " + stack.getMin());
    }
}

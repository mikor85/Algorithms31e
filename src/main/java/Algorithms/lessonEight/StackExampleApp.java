package Algorithms.lessonEight;

public class StackExampleApp {
    public static void main(String[] args) {
        SpecStack stack = new SpecStack();
        stack.push(10);
        stack.push(5);
        stack.push(15);
        stack.printStack();

        System.out.println(stack.pop());
        stack.printStack();
    }
}

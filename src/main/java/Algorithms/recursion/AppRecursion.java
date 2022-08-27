package Algorithms.recursion;

public class AppRecursion {
    public static void main(String[] args) {
        char[] arr = new char[]{'h', 'e', 'l', 'l', 'o'};  // 'h' ->, 'e'->, 'l'->, 'l'->, 'o'

        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(" " + arr[i]);
        }
        System.out.println();
        System.out.println("----------");
        print(0, arr);

    }

    public static void print(int index, char[] arr) {
        if (arr == null || index >= arr.length) {
            return;
        }
        print(index + 1, arr);
        System.out.print(" " + arr[index]);
    }
}

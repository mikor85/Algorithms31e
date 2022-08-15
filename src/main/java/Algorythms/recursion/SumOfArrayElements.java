package Algorythms.recursion;

// Задача 1:
// Дан массив, вычислить рекурсивно сумму всех элементов этого массива.
// Итоговую сумму вывести в консоль.

public class SumOfArrayElements {
    public static void main(String[] args) {

        // Task Nr.1
        System.out.println("Task Nr.1:");
        int[] arr = new int[]{1, 2, 3, 4, 5};
        System.out.println("Sum Of Array Elements is: " + calculateSumOfArrayElements(arr, 0, arr.length));
        System.out.println("----------");
    }

    public static int calculateSumOfArrayElements(int[] arr, int firstIndex, int lastIndex) {
        if (firstIndex == lastIndex - 1) {
            return arr[firstIndex];
        } else {
            int middle = (firstIndex + lastIndex) / 2;
            return calculateSumOfArrayElements(arr, firstIndex, middle) + calculateSumOfArrayElements(arr, middle, lastIndex);
        }
    }
}

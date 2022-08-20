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
        SumOfArrayElements arrSum = new SumOfArrayElements();
        System.out.println("Sum Of Array Elements is: " + arrSum.arraySum(arr, arr.length - 1));
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

    //Начальное значение индекса - (длина массива-1)
    private int arraySum(int[] arr, int index) {
        if (index == 0) {
            return arr[0]; // Базовый случай вернем первый элемент
        }
        //Проходим по массиву, пока индекс не будет == 0
        //и начинаем складывать элементы с предыдущим
        //когда рекурсивные методы будут завершать работу
        return arr[index] + arraySum(arr, index - 1);
    }
}

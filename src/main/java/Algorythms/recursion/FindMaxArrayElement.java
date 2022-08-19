package Algorythms.recursion;

// Задача 2:
// Дан массив, написать рекурсивный метод нахождения максимального элемента в этом массиве.
// Максимальное число вывести в консоль.

public class FindMaxArrayElement {
    public static void main(String[] args) {
        System.out.println("Task Nr.2:");
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {1, 4, 45, 6, -50, 10, 2};
        int n1 = arr1.length;
        int n2 = arr2.length;
        int n3 = arr2.length - 1;
        System.out.println("In arr1 the maximum element is: ");
        System.out.println(findMaxArrayElement(n1, arr1));
        System.out.println("----------");
        System.out.println("In arr2 the maximum element is: ");
        System.out.println(findMaxArrayElement(n2, arr2));
        System.out.println("----------");
        System.out.println(arrayMax(n3, arr2));
        System.out.println("----------");
    }

    // рекурсивный поиск максимального элемента
    public static int findMaxArrayElement(int n, int[] arr) {
        if (n == 1) {
            return arr[0];
        }
        return Math.max(arr[n - 1], findMaxArrayElement(n - 1, arr));
    }

    //Немного упрощенный вариант, стартовый индекс - (длина массива -1)
    public static int arrayMax(int n, int[] arr) {
        if (n == 0)  // Базовый случай
            return arr[0];
        //Будем выбирать каждый раз между элементом и предыдущим
        return Math.max(arr[n], arrayMax(n - 1, arr));
    }

    // итеративный поиск максимального элемента
    public static int findArrayMaximum(int from, int[] arr) {
        int maximum = arr[from];
        for (int i = from + 1; i < arr.length; i++) {
            if (arr[i] > maximum) {
                maximum = arr[i];
            }
        }
        return maximum;
    }
}

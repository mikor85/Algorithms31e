package Algorithms.recursion;

// Задача 2:
// Дан массив, написать рекурсивный метод нахождения максимального элемента в этом массиве.
// Максимальное число вывести в консоль.

public class FindMaxArrayElement {
    public static void main(String[] args) {
        System.out.println("Task Nr.2:");
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {100, 4, 45, 6, -50, 10, 2, 60};
        int n1 = arr1.length;
        int n2 = arr2.length;
        int n3 = arr2.length - 1;
        System.out.println("In arr1 the maximum element is: ");
        System.out.println(findMaxArrayElement(n1, arr1));
        System.out.println("----------");
        System.out.println("In arr2 the maximum element is: ");
        System.out.println(findMaxArrayElement(n2, arr2));
        System.out.println("----------");

        FindMaxArrayElement maxArr = new FindMaxArrayElement();
        System.out.println(maxArr.arrayMax(n3, arr2));
        System.out.println("----------");

        int maxElement = maxArr.maxArray(arr2, 0, arr2.length);
        System.out.println("Max element = " + maxElement);
    }

    // рекурсивный поиск максимального элемента
    public static int findMaxArrayElement(int n, int[] arr) {
        if (n == 1) {
            return arr[0];
        }
        return Math.max(arr[n - 1], findMaxArrayElement(n - 1, arr));
    }

    // Немного упрощенный вариант, стартовый индекс - (длина массива -1)
    private int arrayMax(int n, int[] arr) {
        if (n == 0)  // Базовый случай
            return arr[0];
        //Будем выбирать каждый раз между элементом и предыдущим
        return Math.max(arr[n], arrayMax(n - 1, arr));
    }

    // Проверить, почему не работает на граничных значениях (левое и правое)
    private int maxArray(int[] array, int index, int end) {
        if (array.length < 2){
            return array.length == 0 ? -1 : array[0];
        }

        if (index == end - 1) {  // Базовый случай
            return array[index];
        }
        int mid = (end + index) / 2;
        int maxLeft = maxArray(array, index, mid);
        int maxRight = maxArray(array, mid, end);

        return Math.max(array[index], Math.max(maxLeft, maxRight));
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

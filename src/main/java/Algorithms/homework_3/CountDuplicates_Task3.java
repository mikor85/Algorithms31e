package Algorithms.homework_3;

// Task 3:
/* 3. Имея отсортированный массив arr[] и число x, напишите функцию, которая подсчитывает вхождения x в arr[].
    Ожидаемая временная сложность O(log n)
    arr[] = {1, 1, 2, 2, 2, 2, 3,}, x = 2, Вывод: 4 раза. */

public class CountDuplicates_Task3 {
    public static void main(String[] args) {

        int x = 2;
        int[] arr = {1, 1, 2, 2, 2, 2, 2, 3, 3, 3, 7, 7};

        int firstIndex = findFirstOccurrenceIndex(arr, x);
        int lastIndex = findLastOccurrenceIndex(arr, x);
        if (firstIndex == -1 || lastIndex == -1) {
            System.out.printf("Элемент %d не найден в массиве", x);
        } else {
            if (lastIndex - firstIndex + 1 == 2 ||
                    lastIndex - firstIndex + 1 == 3 ||
                    lastIndex - firstIndex + 1 == 4) {
                System.out.printf("Элемент %d встречается в массиве %d раза", x, lastIndex - firstIndex + 1);
                System.out.println();
            } else {
                System.out.printf("Элемент %d встречается в массиве %d раз", x, lastIndex - firstIndex + 1);
                System.out.println();
            }
        }
    }

    private static int findFirstOccurrenceIndex(int[] arr, int x) {
        int left = 0;
        int right = arr.length - 1;
        int result = -1;

        while (left <= right) {
            int mid = (left + right) / 2;
            if (x == arr[mid]) {
                result = mid;
                right = mid - 1;
            } else if (x < arr[mid]) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return result;
    }

    private static int findLastOccurrenceIndex(int[] arr, int x) {
        int left = 0;
        int right = arr.length - 1;
        int result = -1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (x == arr[mid]) {
                result = mid;
                left = mid + 1;
            } else if (x < arr[mid]) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return result;
    }

    // My
    private int countNumberDuplicatesInArrayMy(int[] arr, int x) {
        int res = 0;
        for (int i = 0; i < arr.length; i++) {
            if (x == arr[i]) {
                res++;
            }
        }
        return res;
    }
}

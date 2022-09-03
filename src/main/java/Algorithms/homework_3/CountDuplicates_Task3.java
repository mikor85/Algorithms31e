package Algorithms.homework_3;

// Task 3:
/* 3. Имея отсортированный массив arr[] и число x, напишите функцию, которая подсчитывает вхождения x в arr[].
    Ожидаемая временная сложность O(log n)
    arr[] = {1, 1, 2, 2, 2, 2, 3,}, x = 2, Вывод: 4 раза. */

public class CountDuplicates_Task3 {
    public static void main(String[] args) {

        CountDuplicates_Task3 countDuplicates = new CountDuplicates_Task3();
        int x = 2;
        int[] arr = {1, 1, 2, 2, 2, 2, 3,};
        System.out.println(countDuplicates.countNumberDuplicatesInArray(x, arr));
    }

    private int countNumberDuplicatesInArray(int x, int[] arr) {
        int res = 0;
        for (int i = 0; i < arr.length; i++) {
            if (x == arr[i]) {
                res++;
            }
        }
        return res;
    }
}

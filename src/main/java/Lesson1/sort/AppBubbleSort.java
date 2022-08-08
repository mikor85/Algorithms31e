package Lesson1.sort;

import java.util.Arrays;

// пузырьковая сортировка
public class AppBubbleSort {
    public static void main(String[] args) {

        int[] array = new int[]{10, 2, 3, 5, 9, 6, 1, 7, 8, 0};
        for (int j = 0; j < array.length; j++) {
            for (int i = 0; i < array.length - j - 1; i++) {
                if (array[i] > array[i + 1]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }
}

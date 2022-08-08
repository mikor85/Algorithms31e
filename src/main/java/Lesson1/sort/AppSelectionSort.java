package Lesson1.sort;

import java.util.Arrays;

// сортировка вставками
public class AppSelectionSort {
    public static void main(String[] args) {

        int[] array = {7, 2, 3, 5, 4, 9, 6, 1, 10, 8, 0};
        System.out.println("Start array = " + Arrays.toString(array));
        for (int j = 0; j < array.length - 1; j++) {
            int maxPos = j;
            System.out.println("Start position = " + maxPos);
            for (int i = j; i < array.length; i++) {
                if (array[i] > array[maxPos]) {
                    maxPos = i;
                }
            }
            int temp = array[j];
            array[j] = array[maxPos];
            array[maxPos] = temp;
            System.out.println(Arrays.toString(array));
            System.out.println("Max position = " + maxPos);
            System.out.println("----------");
        }
        System.out.println();
        System.out.println(Arrays.toString(array));
    }
}

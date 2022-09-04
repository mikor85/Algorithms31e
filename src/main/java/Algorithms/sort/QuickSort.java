package Algorithms.sort;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] array = {34, 56, 22, 78, 9, 3, 5, 15};
        quickSort(array, 0, array.length - 1);
        System.out.println(Arrays.toString(array));

        int[] arrayTwo = {34, 56, 22, 78, 9, 3, 5, 15};
        Arrays.sort(arrayTwo);
        System.out.println(Arrays.toString(arrayTwo));
    }

    private static void quickSort(int[] array, int start, int end) {
        if (start < end) {  // базовый случай
            int indexPivot = getIndexPivot(array, start, end);
            quickSort(array, start, indexPivot - 1);
            quickSort(array, indexPivot + 1, end);
        }
    }

    private static int getIndexPivot(int[] array, int start, int end) {
        int pivot = array[end];
        int indexPivot = start;
        for (int i = start; i < end; i++) {
            if (array[i] <= pivot) {
                swap(array, indexPivot, i);
                indexPivot++;
            }
        }
        swap(array, indexPivot, end);
        return indexPivot;
    }

    private static void swap(int[] array, int first, int second) {
        int temp = array[first];
        array[first] = array[second];
        array[second] = temp;
    }
}

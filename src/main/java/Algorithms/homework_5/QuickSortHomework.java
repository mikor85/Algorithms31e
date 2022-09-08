package Algorithms.homework_5;

import java.util.Arrays;

public class QuickSortHomework {
    public static void main(String[] args) {
        int[] array = {34, 56, 22, 78, 9, 3, 5, 15};
        quickSort(array, 0, array.length - 1);
        System.out.println(Arrays.toString(array));

        System.out.println("----------");

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
        int leftIndex = start;
        int rightIndex = end;

        // оптимальный случай
        //int pivot = array[start + (end - start) / 2];

        // худший случай 1 - выбран первый опорный элемент
        int pivot = array[start];

        // худший случай 2 - выбран последний опорный элемент
        //int pivot = array[end];

        while (leftIndex <= rightIndex){

            while (array[leftIndex] < pivot){
                leftIndex++;
            }
            while (array[rightIndex] > pivot){
                rightIndex--;
            }
            if (leftIndex <= rightIndex){
                swap(array, leftIndex, rightIndex);
                leftIndex++;
                rightIndex--;
            }
        }

        return leftIndex;
    }

    private static void swap(int[] array, int first, int second) {
        int temp = array[first];
        array[first] = array[second];
        array[second] = temp;
    }
}

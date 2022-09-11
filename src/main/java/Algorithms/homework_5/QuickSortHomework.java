package Algorithms.homework_5;

import java.util.Arrays;

public class QuickSortHomework {
    public static void main(String[] args) {

        // Худшие случаи для входных массивов:
        // 1. Массив отсортирован по возрастанию.
        // 2. Массив отсортирован по убыванию.
        // 3. Все элемента имеют одинаковые значения (частный случай для первого и второго случаев).
        // 4. Выбран первый или последний элемент в качестве опорного.

        int[] array = {34, 56, 22, 78, 9, 3, 5, 15};
        int[] arrayTwo = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        quickSort(arrayTwo, 0, arrayTwo.length - 1);
        System.out.println(Arrays.toString(arrayTwo));
        System.out.println("----------");

    }

    private static void quickSort(int[] array, int start, int end) {
        if (start < end) {  // базовый случай
            int indexPivot = getIndexPivot(array, start, end);
            quickSort(array, start, indexPivot - 1);
            quickSort(array, indexPivot/* + 1*/, end);
        }
    }

    private static int getIndexPivot(int[] array, int start, int end) {
        // оптимальный случай
        //int pivot = array[start + (end - start) / 2];

        // худший случай 1 - выбран первый опорный элемент
        //int pivot = array[start];

        // худший случай 2 - выбран последний опорный элемент
        int pivot = array[end];

        // =================================================
        if (pivot == array[end]){
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
        int leftIndex = start;
        int rightIndex = end;
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

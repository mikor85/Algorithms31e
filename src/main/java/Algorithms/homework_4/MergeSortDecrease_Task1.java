package Algorithms.homework_4;

// 1. Повторить алгоритм сортировки слиянием,
// результатом должен стать целочисленный массив отсортированный в порядке убывания.

import java.util.Arrays;

public class MergeSortDecrease_Task1 {
    public static void main(String[] args) {
        int[] arrTwo = {23, 4, 334, 3, 2, 23, 4};
        System.out.println("Array before mergeSort: " + Arrays.toString(arrTwo));
        mergeSort(arrTwo, arrTwo.length);
        System.out.println("Merge sort after: " + Arrays.toString(arrTwo));
    }

    private static void mergeSort(int[] array, int length) {
        if (length < 2) {
            return;
        }
        int mid = length / 2;
        int[] left = new int[mid];
        int[] right = new int[length - mid];
        for (int i = 0; i < mid; i++) {
            left[i] = array[i];
        }
        for (int i = mid; i < length; i++) {
            right[i - mid] = array[i];
        }

        mergeSort(left, mid);
        mergeSort(right, length - mid);
        mergeArray(left, right, array);
    }

    private static void mergeArray(int[] one, int[] two, int[] array) {
        int indexOne = 0;
        int indexTwo = 0;

        for (int i = 0; i < array.length; i++) {
            if (indexOne < one.length && indexTwo < two.length) {
                int elementOne = one[indexOne];
                int elementTwo = two[indexTwo];
                // знак "больше" или "меньше" указывает на порядок сортировки => убывание или возрастание
                if (elementOne > elementTwo) {
                    array[i] = elementOne;
                    indexOne++;
                } else {
                    array[i] = elementTwo;
                    indexTwo++;
                }
                continue;
            }
            if (indexOne < one.length) {
                array[i] = one[indexOne];
                indexOne++;
            }
            if (indexTwo < two.length) {
                array[i] = two[indexTwo];
                indexTwo++;
            }
        }
    }
}

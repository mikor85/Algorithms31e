package Algorithms.homework_3;

// Task 2:
/* 2. Имея два отсортированных массива размера m и n соответственно, вам нужно найти элемент,
   который будет находиться на k-й позиции в конечном отсортированном массиве.
   Массив 1 - 100 112 256 349 770
   Массив 2 - 72 86 113 119 265 445 892
   k = 7, Вывод: 256
   Окончательный отсортированный массив -
    0(1)  1(2)  2(3)  3(4)  4(5)  5(6)  6(7)  7(8)  8(9)  9(10)  10(11)  11(12)
    72,  86,   100,  112,  113,  119,  256,  265,  349,  445,   770,    892
     7-й элемент этого массива равен 256. */

import java.util.Arrays;

// TwoPointers Algorithm
public class TwoSortedArrays_Task2 {
    public static void main(String[] args) {
        int[] arr1 = {100, 112, 256, 349, 770};
        int[] arr2 = {72, 86, 113, 119, 265, 445, 892};
        int k = 7;  // это порядковый номер элемента в массиве (НЕ ИНДЕКС !!!)
        System.out.println(Arrays.toString(mergeArray(arr1, arr2)));
        System.out.println("----------");
        System.out.println(mergeArray(arr1, arr2, k));
        System.out.println("----------");
        System.out.println(getKPositionElement((mergeArray(arr1, arr2)), k));
        System.out.println("----------");
        TwoSortedArrays_Task2 twoSortedArrays = new TwoSortedArrays_Task2();
        System.out.println(twoSortedArrays.getArrayElement(arr1, arr2, k));
    }

    // без слияния массивов
    private static int mergeArray(int[] one, int[] two, int k) {
        int length = one.length + two.length;
        int indexOne = 0;
        int indexTwo = 0;
        int current = one[0];
        int count = 0;

        for (int i = 0; i < length; i++) {
            if (indexOne < one.length && indexTwo < two.length) {
                int elementOne = one[indexOne];
                int elementTwo = two[indexTwo];
                if (elementOne < elementTwo) {
                    indexOne++;
                    current = elementOne;
                } else {
                    indexTwo++;
                    current = elementTwo;
                }
                count++;
                if (count == k) {
                    return current;
                }
                continue;
            }
            if (indexOne < one.length && indexTwo >= two.length) {
                current = one[indexOne];
                count++;
                indexOne++;
            }
            if (indexOne >= one.length && indexTwo < two.length) {
                current = two[indexTwo];
                indexTwo++;
            }
            count++;
            if (count == k) {
                return current;
            }
        }
        throw new IllegalArgumentException();
    }

    // получение в итоговом отсортированном массиве элемента под номером k
    private static int getKPositionElement(int[] array, int k) {
        return array[k - 1];
    }

    // метод слияния двух массивов
    private static int[] mergeArray(int[] arr1, int[] arr2) {
        int[] result = new int[arr1.length + arr2.length];
        int indexOne = 0;
        int indexTwo = 0;

        for (int i = 0; i < result.length; i++) {
            if (indexOne < arr1.length && indexTwo < arr2.length) {
                int elementOne = arr1[indexOne];
                int elementTwo = arr2[indexTwo];
                if (elementOne < elementTwo) {
                    result[i] = elementOne;
                    indexOne++;
                } else {
                    result[i] = elementTwo;
                    indexTwo++;
                }
                continue;
            }
            if (indexOne < arr1.length) {
                result[i] = arr1[indexOne];
                indexOne++;
            }
            if (indexTwo < arr2.length) {
                result[i] = arr2[indexTwo];
                indexTwo++;
            }
        }
        return result;
    }

    private int getArrayElement(int[] arr1, int[] arr2, int k) {

        int[] resArray = new int[arr1.length + arr2.length];
        for (int i = 0; i < arr1.length; i++) {
            resArray[i] = arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            resArray[i + arr1.length] = arr2[i];
        }

        for (int j = 0; j < resArray.length; j++) {
            for (int i = 0; i < resArray.length - j - 1; i++) {
                if (resArray[i] > resArray[i + 1]) {
                    int temp = resArray[i];
                    resArray[i] = resArray[i + 1];
                    resArray[i + 1] = temp;
                }
            }
        }

        return resArray[k - 1];
    }

    // поиск позиции, на которую вставлять элемент
    public static int binarySearch(int[] a, int number) {
        int minIndex = 0;
        int maxIndex = a.length - 1;
        while (minIndex <= maxIndex) {
            int midIndex = (minIndex + maxIndex) / 2;
            if (a[minIndex] < number) {
                minIndex = midIndex + 1;
            } else if (number < a[maxIndex]) {
                maxIndex = midIndex - 1;
            } else return midIndex;
        }
        return minIndex;
    }

    // вставить "в середину" массива А значение, вернуть новый массив
    public static int[] insert(int[] a, int index, int number) {
        int[] newArr = new int[a.length + 1];
        for (int i = 0; i < index; i++) {
            newArr[i] = a[i];
        }
        newArr[index] = number;
        for (int i = index + 1; i < newArr.length; i++) {
            newArr[i] = a[i - 1];
        }
        return newArr;
    }
}

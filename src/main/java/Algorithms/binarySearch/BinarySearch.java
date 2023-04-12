package Algorithms.binarySearch;

public class BinarySearch {
    public static void main(String[] args) {
        //            0   1  2  3  4  5  6  7  8   9  10  11  12  13  14
        int[] arr = {-5, -2, 0, 4, 6, 7, 8, 8, 8, 12, 15, 16, 21, 24, 30};
        int target = 8;

        //              0  1  2  3  4  5  6
        int[] array = {1, 1, 2, 2, 2, 2, 3};
        int x = 2;

        //System.out.println(binarySearch(arr, target));
        System.out.println(binarySearch2(array, x));

        System.out.println("==========");
        int[] arr128 = new int[128];
        for (int i = 0; i < arr128.length; i++) {
            arr128[i] = i + 1;
        }
        System.out.println(getCountOfComparison(arr128, 1));

    }

    private static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        int mid;
        while (left <= right) {
            mid = left + (right - left) / 2;
            if (arr[mid] == target) {
                return mid;
            }
            if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }

    // returns a place of the element if it's not exists in array
    public static int binarySearch2(int[] a, int number) {
        int minIndex = 0;
        int maxIndex = a.length - 1;
        while (minIndex <= maxIndex) {
            int midIndex = minIndex + (maxIndex - minIndex) / 2;
            if (number == a[midIndex]) {
                return midIndex;
            } else if (a[minIndex] < number) {
                minIndex = midIndex + 1;
            } else if (number < a[maxIndex]) {
                maxIndex = midIndex - 1;
            } else return midIndex;
        }
        //return minIndex;
        return maxIndex;
    }

    // returns a count of comparison
    private static int getCountOfComparison(int[] sortedArray, int number) {
        int left = 0;
        int right = sortedArray.length - 1;
        int comparisonCounter = 0;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (number == sortedArray[mid]) {
                comparisonCounter++;
                return comparisonCounter;
            } else if (number > sortedArray[mid]) {
                comparisonCounter++;
                left = mid + 1;
            } else if (number < sortedArray[mid]) {
                comparisonCounter++;
                right = mid - 1;
            }
        }

        return comparisonCounter;
    }
}

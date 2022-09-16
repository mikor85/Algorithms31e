package Algorithms.binarySearch;

public class BinarySearch {
    public static void main(String[] args) {
        //            0   1  2  3  4  5  6  7  8   9  10  11  12  13  14
        int[] arr = {-5, -2, 0, 4, 6, 7, 8, 8, 8, 12, 15, 16, 21, 24, 30};
        int target = 8;

        //              0  1  2  3  4  5  6
        int [] array = {1, 1, 2, 2, 2, 2, 3};
        int x = 2;

        //System.out.println(binarySearch(arr, target));
        System.out.println(binarySearch2(array, x));
    }

    private static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        int mid = 0;
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
}

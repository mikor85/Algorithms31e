package Algorithms.lessonMostPopularPatterns;

import java.util.Arrays;

public class TwoPointers {
    public static void main(String[] args) {
        TwoPointers twoPointers = new TwoPointers();
        // 1. Reverse String solution
        System.out.println("Case Nr.1:");
        String text = "abcdefgh";
        twoPointers.reverseString(text);

        // 2. Return array of squares sorted on non-decreasing order - sqrSortedArray
        System.out.println();
        System.out.println("Case Nr.2:");
        int[] arrTask2 = {-3, -1, 0, 1, 2};
        twoPointers.sqrSortedArray(arrTask2);

        // 3. Remove duplicates from sorted array (in-place)
        System.out.println();
        System.out.println("Case Nr.3:");
        int[] arrTask3 = {2, 3, 3, 3, 6, 9, 9};  // => {2, 3, 6, 9}
        twoPointers.removeDuplicatesFromSortedArray(arrTask3);

        // 4. IsPairWithTargetSum [2,4,5,6,8,9], target = 7 => true


    }

    // 1. Reverse String solution
    // Time complexity O(n)
    // Space complexity O(n)
    private void reverseString(String text) {
        char[] chars = text.toCharArray();
        int left = 0;
        int right = chars.length - 1;
        while (left < right) {
            char temp = chars[left];
            chars[left++] = chars[right];
            chars[right--] = temp;
        }
        System.out.println(Arrays.toString(chars));
        System.out.println(new String(chars));
    }

    // 2. Return array of squares sorted on non-decreasing order - sqrSortedArray
    private void sqrSortedArray(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        int[] sqr = new int[arr.length];
        int index = sqr.length - 1;
        while (index >= 0) {
            int sqrL = arr[left] * arr[left];    // long if needs
            int sqrR = arr[right] * arr[right];  // long if needs
            if (sqrR > sqrL) {
                sqr[index] = sqrR;
                right--;
            } else {
                sqr[index] = sqrL;
                left++;
            }
            index--;
        }
        System.out.println(Arrays.toString(sqr));
    }

    // 3. Remove duplicates from sorted array (in-place)
    private void removeDuplicatesFromSortedArray(int[] arr) {
        if (arr.length == 0) {
            return;
        }
        int slow = 0;
        for (int fast = 1; fast < arr.length; fast++) {
            if (arr[slow] != arr[fast]) {
                arr[++slow] = arr[fast];
            }
        }
        System.out.println("Count non duplicates elements = " + (slow + 1));
        System.out.println(Arrays.toString(arr));
    }

}
package Algorithms.lessonMostPopularPatterns;

public class SlidingWindows {
    public static void main(String[] args) {
        SlidingWindows slidingWindows = new SlidingWindows();

        // 1. Get continuous SubArray with Target Sum of elements
        System.out.println("Case Nr.1:");
        int[] arr = {2, 1, 5, 1, 3, 2};
        int n = 3;   // 1 <= n <= arr.length
        // 2,1,5=8   1,5,1=7   5,1,3=9   1,3,2=6
        System.out.println("Maximum sum = " + slidingWindows.getContinuousSubArrayWithTargetMaxSum(arr, n));

        // 2. Get min size of continuous SubArray with Target Sum of elements
        System.out.println("Case Nr.2:");
        int[] array = {2, 1, 5, 2, 3, 2};
        int target = 7;
        System.out.println("Min subArray length = " + slidingWindows.minSizeSubArraySum(array, target));
    }

    // 1. Get continuous SubArray with Target Sum of elements
    // Time complexity O(n)
    // Space complexity O(1)
    private int getContinuousSubArrayWithTargetMaxSum(int[] arr, int n) {
        if (n >= arr.length) {
            n = arr.length;
        }
        int tempSum = 0;         //
        int maxSum = 0;
        int startIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            tempSum += arr[i];
            if (i >= n - 1) {
                maxSum = Math.max(maxSum, tempSum);
                tempSum -= arr[startIndex++];
            }
        }
        return maxSum;
    }

    // 2. Get min size of continuous SubArray with >=Target Sum of elements
    private int minSizeSubArraySum(int[] array, int target) {
        int sum = 0;
        int start = 0;
        int minLength = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
            while (sum >= target) {
                minLength = Math.min(minLength, i - start + 1);
                sum -= array[start];
                start++;
            }
        }
        return minLength == Integer.MAX_VALUE ? 0 : minLength;
    }
}
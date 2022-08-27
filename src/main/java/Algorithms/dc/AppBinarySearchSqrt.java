package Algorithms.dc;

public class AppBinarySearchSqrt {
    public static void main(String[] args) {
        int number = 144;
        AppBinarySearchSqrt appBinarySearchSqrt = new AppBinarySearchSqrt();
        System.out.print("Is square ? " + number);
        System.out.println(" => " + appBinarySearchSqrt.isSquare(number));

    }

    private boolean isSquare(int number) {
        int left = 1;
        int right = 16;
        int mid = 0;
        while (left <= right) {
            mid = (left + right) / 2;
            if (mid * mid == number) {
                return true;
            }
            if (mid * mid > number) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return false;
    }
}

package Algorythms.dc;

public class AppBinarySearchSqrt {
    public static void main(String[] args) {
        int number = 16;
        AppBinarySearchSqrt appBinarySearchSqrt = new AppBinarySearchSqrt();
        System.out.println("Is square ? " + number);

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
                right = mid + 1;
            } else {
                left = mid + 1;
            }
        }
        return false;
    }
}

package MyPractice.GrokkingAlgorithms_Recursion4;

public class BinarySearchRecursion {

    public static void main(String[] args) {

        int[] array = new int[]{1, 2, 3, 4, 5, 6, 10, 15};
        int target = 10;
        int startIndex = 0;
        int endIndex = array.length - 1;
        System.out.println(binarySearchRecursion(array, target, startIndex, endIndex));

    }

    private static int binarySearchRecursion(int[] array, int target, int start, int end) {

        if (start <= end) {
            int middle = start + (end - start) / 2;
            if (array[middle] == target) {
                return middle;
            }
            if (array[middle] < target) {
                return binarySearchRecursion(array, target, middle + 1, end);
            } else {
                return binarySearchRecursion(array, target, start, middle - 1);
            }

        }
        return -1;
    }
}
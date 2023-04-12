package MyPractice.GrokkingAlgorithms_Recursion4;

public class SumRecursion {

    public static void main(String[] args) {

        int[] array = new int[]{2, 4, 6};
        System.out.println("Sum of all array elements = " + sum(array, array.length - 1));
    }

    private static int sum(int[] array, int startIndex) {

        if (startIndex == 0) {
            return array[0];
        }

        return array[startIndex] + sum(array, startIndex - 1);
    }
}
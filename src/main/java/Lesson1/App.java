package Lesson1;

public class App {
    public static void main(String[] args) {

        int[] array = new int[]{1, 3, 5, 63, 6, 8, 3, 4};
        int target = 4;
        int position = -1;

        // Time complexity = O(n)
        for (int i = 0; i < array.length; i++) {  // цикл по массиву
            if (array[i] == target){
                position = 1;
                break;
            }
        }
        System.out.println(position);
    }

}

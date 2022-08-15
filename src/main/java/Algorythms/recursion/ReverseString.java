package Algorythms.recursion;

import java.util.Arrays;

public class ReverseString {
    public static void main(String[] args) {
        char[] arr = {'h', 'e', 'l', 'l', 'o', ' ', 'w', 'o', 'r', 'l', 'd'};

        int left = 0;
        int right = arr.length - 1;
        while (left < right){
            char tmp = arr[left];
            arr[left++] = arr[right];
            arr[right--] = tmp;
        }
        System.out.println(Arrays.toString(arr));

        System.out.println("---------------");
        reverseArrRecursion(0, arr.length-1, arr);
        System.out.println(Arrays.toString(arr));
    }
    private static void reverseArrRecursion (int left, int right, char[] chars){
        if (left >= right){
            return;
        }
        char tmp = chars[left];
        chars[left] = chars[right];
        chars[right] = tmp;
        reverseArrRecursion(++left, --right, chars);
    }
}
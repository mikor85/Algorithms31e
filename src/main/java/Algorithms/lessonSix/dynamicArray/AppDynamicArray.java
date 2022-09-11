package Algorithms.lessonSix.dynamicArray;

public class AppDynamicArray {
    public static void main(String[] args) {

        DynamicArray dynamicArray = new DynamicArray();
        System.out.println(dynamicArray);
        dynamicArray.add(2);
        System.out.println(dynamicArray);
        dynamicArray.add(3);
        System.out.println(dynamicArray);
        dynamicArray.add(0);
        System.out.println(dynamicArray);
        dynamicArray.add(4);
        System.out.println(dynamicArray);
        dynamicArray.add(6);
        System.out.println(dynamicArray);

        dynamicArray.add(3, 7);
        System.out.println(dynamicArray);
    }
}

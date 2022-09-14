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
        System.out.println("----------");
        dynamicArray.removeAt(4);
        System.out.println(dynamicArray);
        System.out.println("----------");
        dynamicArray.set(3, 40);
        System.out.println(dynamicArray);
        System.out.println("----------");

        System.out.println(dynamicArray);
        dynamicArray.addAt(3, 7);
        System.out.println(dynamicArray);
        dynamicArray.shrinkSize();

        System.out.println(dynamicArray);
        System.out.println(dynamicArray.contains(1));
        dynamicArray.clear();
        System.out.println(dynamicArray);
    }
}

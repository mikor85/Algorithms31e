package Algorithms.lessonSix.homework;

// 1. Напишите метод, который добавляет 1000000 элементов в ArrayList
// (можно попробовать использовать вместо ArrayList свой динамический массив) и LinkedList.
// 2. Напишите еще один метод, который выбирает из заполненного списка элемент наугад 100000 раз.
// Замерьте время, которое потрачено на это. Сравните результаты и предположите, почему они именно такие.

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MillionArrayList {
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();
        int n = 1000000;

        double timeAddBefore = System.currentTimeMillis();
        addMillionInArrayList(integerList, n);
        double timeAddAfter = System.currentTimeMillis();
        double timeDelta = (timeAddAfter - timeAddBefore) / 1000;
        System.out.println("Время добавления " + n + " элементов = " + timeDelta + "sec."); // 0.161sec.
        System.out.println("----------");
        timeAddBefore = System.currentTimeMillis();
        System.out.println(getRandomElement(integerList, n));
        timeAddAfter = System.currentTimeMillis();
        timeDelta = (timeAddAfter - timeAddBefore) / 1000;
        System.out.println("Время выбора элемента наугад " + n + " элементов = " + timeDelta + "sec."); // 0.0sec.

        // Метод добавления элементов имеет худшее timeComplexity O(n),
        // в то время как метод получения элемента из массива имеет timeComplexity O(1).
        // Поэтому на получение элемента практически не требуется времени, а на добавление необходимо время.
    }

    private static void addMillionInArrayList(List<Integer> integerList, int n) {
        Random rand = new Random();
        for (int i = 0; i < n; i++) {
            integerList.add(rand.nextInt());
        }
    }

    private static int getRandomElement(List<Integer> integerList, int n) {
        Random rand = new Random();
        return integerList.get(rand.nextInt(n));
    }

}

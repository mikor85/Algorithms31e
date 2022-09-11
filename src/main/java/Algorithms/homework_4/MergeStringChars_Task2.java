package Algorithms.homework_4;

// 2. Даны две строки, например "abcde" и "dgk",
// слить строки в одну используя только один проход в цикле,
// элементы должны сливаться через 1, те первый элемент с первой строки,
// второй со второй, третий с первой и т.д. Если какая-то строка больше чем другая,
// то остаток переписываем в результат. Метод аналогичен слиянию массивов в merge sort,
// но без учета сравнения элементов.

public class MergeStringChars_Task2 {
    public static void main(String[] args) {
        String one = "abcde";  // adbgckde
        String two = "dgk";
        System.out.println(new MergeStringChars_Task2().mergeString(one, two));
    }

    private String mergeString(String one, String two) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < one.length() + two.length(); i++) {
            if (i < one.length() && i < two.length()) {
                result.append(one.charAt(i)).append(two.charAt(i));
                continue;
            }
            if (i < one.length()) {
                result.append(one.charAt(i));
            }
            if (i < two.length()) {
                result.append(two.charAt(i));
            }
        }
        return result.toString();
    }
}

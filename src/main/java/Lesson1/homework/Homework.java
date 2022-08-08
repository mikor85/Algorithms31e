package Lesson1.homework;

// First level: Задача на сортировку :
// Отсортировать по алфавиту список студентов группы.
// 1. Задать массив строк с произвольными фамилиями студентов, достаточно будет массива из 10-15 элементов.
// (изначально, элементы в массиве должны быть в произвольном порядке)

// 2. Используя Bubble sort отсортировать все элементы массива по алфавиту, в порядке от A до Z.
// Для тех кто будет использовать Java, посмотрите на метод compareTo у класса String, который возвращает
// целочисленное значение для сравниваемых строк, это может быть число меньше 0, 0, число больше 0,
// в зависимости от того как две строки равны между собой,
// при сравнении именно будет использоваться именно лексикографический порядок, то что нужно.

// 3. Отсортированный массив вывести в консоль, в виде: на отдельной строке: порядковый номер в списке - фамилия.
// 4. Результат можно прислать в виде ссылки не решение на гитхабе или ссылки на файловый архив.
//
// Second level: Выполнить аналогичное задание с помощью сортировки Выбором(Selection).

import java.util.Arrays;

public class Homework {
    public static void main(String[] args) {
        String s1 = "Ivanov";
        String s2 = "Petrov";
        String s3 = "Sidorov";
        String s4 = "Kozlov";
        String s5 = "Ovsov";
        String s6 = "Baranov";
        String s7 = "Konev";
        String s8 = "Goncov";
        String s9 = "Rakov";
        String s10 = "Ershov";
        String s11 = "Rybin";
        String s12 = "Kuznecov";

        // Bubble sort
        String[] string1 = new String[]{s1, s2, s3, s4, s5, s6, s7, s8, s9, s10};

        for (int j = 0; j < string1.length; j++) {
            for (int i = 0; i < string1.length - j - 1; i++) {
                if (string1[i].compareTo(string1[i + 1]) > 0) {
                    String temp = string1[i];
                    string1[i] = string1[i + 1];
                    string1[i + 1] = temp;
                }
            }
        }
        // Print string array
        for (int i = 0; i < string1.length; i++) {
            System.out.println(i + 1 + ". " + string1[i]);
        }
        System.out.println("----------");

        // Selection sort
        String[] string2 = new String[]{s12, s11, s10, s9, s8, s7, s6, s5, s4, s3, s2, s1};
        for (int j = 0; j < string2.length - 1; j++) {
            int maxPos = j;
            for (int i = j; i < string2.length; i++) {
                if (string2[i].compareTo(string2[maxPos]) < 0) {
                    maxPos = i;
                }
            }
            String temp = string2[j];
            string2[j] = string2[maxPos];
            string2[maxPos] = temp;
        }
        // Print string array
        for (int i = 0; i < string2.length; i++) {
            System.out.println(i + 1 + ". " + string2[i]);
        }
    }
}

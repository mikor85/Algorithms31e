package Algorythms.homework_3;

// Task 1:
/* 1. Даны два целых числа x и n, напишите функцию для вычисления x^n (x в степени n).
   Первое решение выполнить рекурсивно за временную сложность O(n) - линейная.
   Второе решение это улучшить решение 1 до временной сложности O(log n) - логарифмическая. */

// Task 2:
/* 2. Имея два отсортированных массива размера m и n соответственно, вам нужно найти элемент,
   который будет находиться на k-й позиции в конечном отсортированном массиве.
   Массив 1 - 100 112 256 349 770
   Массив 2 - 72 86 113 119 265 445 892
   k = 7, Вывод: 256
   Окончательный отсортированный массив -
    0(1)  1(2)  2(3)  3(4)  4(5)  5(6)  6(7)  7(8)  8(9)  9(10)  10(11)  11(12)
    72,  86,   100,  112,  113,  119,  256,  265,  349,  445,   770,    892
     7-й элемент этого массива равен 256. */

// Task 3:
/* 3. Имея отсортированный массив arr[] и число x, напишите функцию, которая подсчитывает вхождения x в arr[].
    Ожидаемая временная сложность O(log n)
    arr[] = {1, 1, 2, 2, 2, 2, 3,}, x = 2, Вывод: 4 раза. */

// Task 4:
/* 4. Найдите пиковый элемент в двумерном массиве.
    Элемент является пиковым, если он больше или равен своим четырем соседям слева, справа, сверху и снизу. Например, соседями для A[i][j] являются A[i-1][j], A[i+1][j], A[i][j-1] и A[i][j+1 ]. Для угловых элементов отсутствующие соседи считаются отрицательными бесконечными значениями.
     10 20 15
     21 30 14
      7 16 32
     Выход: 30

  30 — пиковый элемент, потому что все его соседи меньше или равны ему. 32 также можно выбрать в качестве пика.
  Note:
 - Смежная диагональ не считается соседней.
 - Пиковый элемент, не обязательно, является максимальным элементом.
 - Таких элементов может быть несколько.
 - Всегда есть пиковый элемент. */

public class Homework_3 {
    public static void main(String[] args) {
        Homework_3 powerN = new Homework_3();
        int x = 3, n = 4;
        System.out.println("Methods to raise the number to a power");
        System.out.println("1. Recursive method O(log n): " + x + " in a " + n + " power = " + powerN.getPowerRecursiveOLogN(x, n));
        System.out.println("2. Recursive method O(n): " + x + " in a " + n + " power = " + powerN.getPowerRecursiveOn(x, n));
        System.out.println("3. Binary method: " + x + " in a " + n + " power = " + powerN.getPowerBinary(x, n));
        System.out.println("4. Iterative method: " + x + " in a " + n + " power = " + powerN.getPowerIterative(x, n));

    }

    // 1. Рекурсивный метод O(log n)
    private int getPowerRecursiveOLogN(int x, int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return x;
        }
        if (n % 2 == 1) {
            return x * getPowerRecursiveOLogN(x, n - 1);
        } else {
            return getPowerRecursiveOLogN(x, n / 2) * getPowerRecursiveOLogN(x, n / 2);
        }
    }

    // 2. Рекурсивный метод O(n)
    private int getPowerRecursiveOn(int x, int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return x;
        }
        return x * getPowerRecursiveOn(x, n - 1);
    }

    // 3. Бинарный метод
    private int getPowerBinary(int x, int n) {
        int res = 1;
        while (n >= 1) {
            if (n % 2 == 1)
                res *= x;
            x *= x;
            n >>= 1;
        }
        return res;
    }

    // 4. Итеративный метод
    private int getPowerIterative(int x, int n) {
        int numPower = 1;
        for (int i = 0; i < n; i++) {
            numPower *= x;
        }
        return numPower;
    }
}

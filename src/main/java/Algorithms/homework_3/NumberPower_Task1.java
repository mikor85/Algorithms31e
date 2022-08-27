package Algorithms.homework_3;

// Task 1:
/* 1. Даны два целых числа x и n, напишите функцию для вычисления x^n (x в степени n).
   Первое решение выполнить рекурсивно за временную сложность O(n) - линейная.
   Второе решение это улучшить решение 1 до временной сложности O(log n) - логарифмическая. */

public class NumberPower_Task1 {
    public static void main(String[] args) {
        NumberPower_Task1 powerN = new NumberPower_Task1();
        int x = 3, n = 4;
        System.out.println("Task 1:");
        System.out.println("Methods to raise the number to a power");
        System.out.println("1. Recursive method O(log n): " + x + " in a " + n + " power = " + powerN.getPowerRecursiveOLogN(x, n));
        System.out.println("2. Recursive method O(n): " + x + " in a " + n + " power = " + powerN.getPowerRecursiveOn(x, n));
        System.out.println("3. Binary method: " + x + " in a " + n + " power = " + powerN.getPowerBinary(x, n));
        System.out.println("4. Iterative method: " + x + " in a " + n + " power = " + powerN.getPowerIterative(x, n));

    }

    // 1. Рекурсивный метод O(log n)
    private long getPowerRecursiveOLogN(long x, long n) {
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
    private long getPowerRecursiveOn(long x, long n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return x;
        }
        return x * getPowerRecursiveOn(x, n - 1);
    }

    // 3. Бинарный метод
    private long getPowerBinary(long x, long n) {
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
    private long getPowerIterative(long x, long n) {
        int res = 1;
        for (int i = 0; i < n; i++) {
            res *= x;
        }
        return res;
    }
}

package Algorithms.lessonSeven;

public class Fibonacci {

    public static void main(String[] args) {
        int n = 46;
        // в int максимальное число под номером 46,
        // на 47 элементе

        double timeRecBefore = System.currentTimeMillis();
        System.out.println("Recursion = " + rec(n));
        double timeRecAfter = System.currentTimeMillis();
        System.out.println("Recursion time = " + (timeRecAfter - timeRecBefore) + "ms");

        int[] arr = new int[n + 1];
        for (int i = 2; i <= n; i++) {
            arr[i] = -1;
        }

        double timeMemoBefore = System.currentTimeMillis();
        System.out.println("Memoization = " + fibonacciDPMemo(n, arr));
        double timeMemoAfter = System.currentTimeMillis();
        System.out.println("Memoization time = " + (timeRecAfter - timeRecBefore) + "ms");

        double timeTabBefore = System.currentTimeMillis();
        System.out.println("Tabulation = " + fibonacciDPTab(n));
        double timeTabAfter = System.currentTimeMillis();
        System.out.println("Tabulation time = " + (timeRecAfter - timeRecBefore) + "ms");
    }

    private static int rec(int n) {
        if (n < 2) {
            return n;
        }
        return rec(n - 1) + rec(n - 2);
    }

    private static int fibonacciDPMemo(int n, int arr[]) {
        if (n < 2) {
            return n;
        }
        if (arr[n] != -1) {
            return arr[n];
        }
        arr[n] = fibonacciDPMemo(n - 1, arr) + fibonacciDPMemo(n - 2, arr);
        return arr[n];
    }

    private static int fibonacciDPTab(int n) {
        int[] arr = new int[n + 1];
        arr[0] = 0;
        arr[1] = 1;
        for (int i = 2; i <= n; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
            if (i == n){
                return arr[n];
            }
        }
        return -1;
    }
}
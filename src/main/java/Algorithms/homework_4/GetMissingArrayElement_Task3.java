package Algorithms.homework_4;

// 3. Дан отсортированный по возрастанию массив, все элементы этого массива уникальные.
// Дано целое число n, написать метод, который вернет n-й отсутствующий элемент в массиве.
// Например дан массив: [4,7,9,10,14], если:
// n = 1, вернуть первый отсутствующий элемент => ответ 5;
// n = 2, вернуть второй отсутствующий элемент => ответ 6;
// n = 3, вернуть третий отсутствующий элемент => ответ 8.

// Second level:
// 4. Решить задачу 3 с ожидаемой сложностью O(log n).

public class GetMissingArrayElement_Task3 {
    public static void main(String[] args) {
        int[] array = {4, 7, 9, 10, 14};
        int n = 10;
        System.out.println(getMissedUniqueElement(array, n));
        System.out.println("----------");
        System.out.println(findMissedElement(array, n));
    }

    public static int findMissedElement(int[] array, int n) {
        int misElement = array[0] + n;
        for (int count = 1; count < array.length && array[count] <= misElement; count++, misElement++) {
        }
        return misElement;
    }

    // n =               1    2       3           4     5     6
    // index         0   1    2   3   4   5  6    7     8     9    10
    // actual index  0            1       2  3                     4   = length=5
    // array        {4, (5), (6), 7, (8), 9, 10, (11), (12), (13), 14}

    private static int getMissedUniqueElement(int[] array, int n) {
        // кол-во пропущенных элементов
        int misNum = array[array.length - 1] - array[0] - array.length + 1;
        if (n > misNum) {
            return array[array.length - 1] + n - misNum;
        } else {
            int count = n;
            int index;
            int addCount;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i + 1] - array[i] == 1) {
                    continue;
                }
                addCount = 0;
                for (int j = array[i] + 1; j < array[i + 1]; j++) {
                    addCount++;
                    count--;
                    if (count == 0) {
                        index = i;
                        return array[index] + addCount;
                    }
                }
            }
        }
        return array[0];
    }
}
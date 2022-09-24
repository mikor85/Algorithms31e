package Algorithms.homework_4;

// 3. Дан отсортированный по возрастанию массив, все элементы этого массива уникальные.
// Дано целое число n, написать метод, который вернет n-й отсутствующий элемент в массиве.
// Например дан массив: [4,7,9,10,14], если:
// n = 1, вернуть первый отсутствующий элемент => ответ 5;
// n = 2, вернуть второй отсутствующий элемент => ответ 6;
// n = 3, вернуть третий отсутствующий элемент => ответ 8.

// Second level:
// 4. Решить задачу 3 с ожидаемой сложностью O(log n).

public class HWElement_Task3 {
    public static void main(String[] args) {
        int[] nums = {4, 7, 9, 10, 14};
        int[] numsSingle = {4};
        int n = 3;
        HWElement_Task3 hwElement = new HWElement_Task3();
        int missingElement = hwElement.binarySearchMissingElement(n, nums);
        System.out.println(missingElement);

        System.out.println(hwElement.binarySearchMissingElement(n, numsSingle));
    }

    // Variant at Lesson7
    private int missingCount(int index, int[] nums) {
        return nums[index] - nums[0] - index;
    }

    private int binarySearchMissingElement(int n, int[] nums) {
        int missingCount = missingCount(nums.length - 1, nums);
        if (n > missingCount) {
            return nums[nums.length - 1] + (n - missingCount);
        }
        int left = 0;
        int right = nums.length - 1;
        int mid = 0;
        while (left != right) {
            mid = left + (right - left) / 2;
            missingCount = missingCount(mid, nums);
            if (missingCount < n) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return nums[left - 1] + (n - missingCount(left - 1, nums));
    }


    // First variant My
    private static int findMissedElement(int[] array, int n) {
        int misElement = array[0] + n;
        for (int count = 1; count < array.length && array[count] <= misElement; count++, misElement++) {
        }
        return misElement;
    }

    // n =               1    2       3           4     5     6
    // index         0   1    2   3   4   5  6    7     8     9    10
    // actual index  0            1       2  3                     4   = length=5
    // array        {4, (5), (6), 7, (8), 9, 10, (11), (12), (13), 14}

    // Second variant My
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
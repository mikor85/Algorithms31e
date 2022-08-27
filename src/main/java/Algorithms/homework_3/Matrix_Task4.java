package Algorithms.homework_3;

// Task 4:
/* 4. Найдите пиковый элемент в двумерном массиве.
    Элемент является пиковым, если он больше или равен своим четырем соседям слева, справа, сверху и снизу.
    Например, соседями для A[i][j] являются A[i-1][j], A[i+1][j], A[i][j-1] и A[i][j+1 ].
    Для угловых элементов отсутствующие соседи считаются отрицательными бесконечными значениями.
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

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Matrix_Task4 {
    public static void main(String[] args) {
        int[][] twoDimArray = {
                {10, 20, 15},
                {21, 30, 14},
                {7, 16, 32}
        };
        int[][] twoDimArray2 = {
                {40, 20, 15, 75},
                {21, 30, 14, 11},
                {7, 16, 32, 15},
                {3, 100, 24, 19}
        };
        Matrix_Task4 element = new Matrix_Task4();
        System.out.println(element.getPeakElement(twoDimArray));
        System.out.println("----------");
        System.out.println(element.getPeakElement(twoDimArray2));
    }

    private int getPeakElement(int[][] twoDimArray) {
        List<int[]> peakList = new ArrayList<>();
        for (int i = 0; i < twoDimArray.length; i++) {
            for (int j = 0; j < twoDimArray[i].length; j++) {
                // проверяем левый верхний угол
                if (i == 0 && j == 0 &&
                        twoDimArray[i][j] > twoDimArray[i][j + 1] &&
                        twoDimArray[i][j] > twoDimArray[i + 1][j]) {
                    peakList.add(new int[]{i, j});
                }
                // проверяем верхнюю сторону
                if (i == 0 && j > 0 && j < twoDimArray[i].length - 1 &&
                        twoDimArray[i][j] > twoDimArray[i][j - 1] &&
                        twoDimArray[i][j] > twoDimArray[i][j + 1] &&
                        twoDimArray[i][j] > twoDimArray[i + 1][j]) {
                    peakList.add(new int[]{i, j});
                }
                // проверяем правый верхний угол
                if (i == 0 && j == twoDimArray[i].length - 1 &&
                        twoDimArray[i][j] > twoDimArray[i][j - 1] &&
                        twoDimArray[i][j] > twoDimArray[i + 1][j]) {
                    peakList.add(new int[]{i, j});
                }
                // проверяем правую сторону
                if (i > 0 && i < twoDimArray.length - 1 && j == twoDimArray[i].length - 1 &&
                        twoDimArray[i][j] > twoDimArray[i - 1][j] &&
                        twoDimArray[i][j] > twoDimArray[i + 1][j] &&
                        twoDimArray[i][j] > twoDimArray[i][j - 1]) {
                    peakList.add(new int[]{i, j});
                }
                // проверяем правый нижний угол
                if (i == twoDimArray.length - 1 && j == twoDimArray[i].length - 1 &&
                        twoDimArray[i][j] > twoDimArray[i - 1][j] &&
                        twoDimArray[i][j] > twoDimArray[i][j - 1]) {
                    peakList.add(new int[]{i, j});
                }
                // проверяем нижнюю сторону
                if (i == twoDimArray.length - 1 && j > 0 && j < twoDimArray[i].length - 1 &&
                        twoDimArray[i][j] > twoDimArray[i - 1][j] &&
                        twoDimArray[i][j] > twoDimArray[i][j - 1] &&
                        twoDimArray[i][j] > twoDimArray[i][j + 1]) {
                    peakList.add(new int[]{i, j});
                }
                // проверяем левый нижний угол
                if (i == twoDimArray.length - 1 && j == 0 &&
                        twoDimArray[i][j] > twoDimArray[i - 1][j] &&
                        twoDimArray[i][j] > twoDimArray[i][j + 1]) {
                    peakList.add(new int[]{i, j});
                }
                // проверяем левую сторону
                if (i > 0 && i < twoDimArray.length - 1 && j == 0 &&
                        twoDimArray[i][j] > twoDimArray[i][j + 1] &&
                        twoDimArray[i][j] > twoDimArray[i - 1][j] &&
                        twoDimArray[i][j] > twoDimArray[i + 1][j]) {
                    peakList.add(new int[]{i, j});
                }
                // проверяем середину матрицы
                if (i > 0 && i < twoDimArray.length - 1 && j > 0 && j < twoDimArray[i].length - 1 &&
                        twoDimArray[i][j] > twoDimArray[i][j + 1] &&
                        twoDimArray[i][j] > twoDimArray[i - 1][j] &&
                        twoDimArray[i][j] > twoDimArray[i + 1][j]) {
                    peakList.add(new int[]{i, j});
                }
            }
        }
        int[] resArr = getRandomIndexOfPeakElement(peakList);
        return twoDimArray[resArr[0]][resArr[1]];
    }

    public int[] getRandomIndexOfPeakElement(List<int[]> list) {
        Random rand = new Random();
        return list.get(rand.nextInt(list.size()));
    }
}
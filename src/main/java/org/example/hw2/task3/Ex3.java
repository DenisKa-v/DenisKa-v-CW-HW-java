package org.example.hw2.task3;

/**
 * 3) Дан массив целых чисел. Заменить отрицательные элементы на сумму индексов двузначных элементов массива.
 */
public class Ex3 {
    public static void main(String[] args) {
        int[] array = new int[]{1, 20, -1, 5, -5, 6, 8, -11, 9, 21};
        printArray(array);
        replaceNeg(array);
        printArray(array);
    }

    /**
     * вывод массива
     * @param array массив
     */
    private static void printArray(int[] array) {
        String result = "[";
        for (int i = 0; i < array.length; i++) {
            result += array[i] + (i == array.length - 1 ? "]" : ",");
        }
        System.out.println(result);
    }

    /**
     * Замена отрицательных элементов на сумму индексов двузначных элементов массива
     * @param array массив
     */
    private static void replaceNeg(int[] array) {
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            if ((10 <= array[i] && array[i] <= 99) || (-99 <= array[i] && array[i] <= -10)) {
                sum += i;
            }
        }

        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) array[i] = sum;
        }

    }
}
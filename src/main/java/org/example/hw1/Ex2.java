package org.example.hw1;

// Дана последовательность целых чисел, оканчивающаяся нулем. Найти сумму положительных чисел,
// после которых следует отрицательное число.
// Пример ввода: 1 2 1 2 -1 1 3 1 3 -1 0
// Логика расчета:
// 2 -1 переход -> 2 в сумму
// 3 -1 переход -> 3 в сумму
// Пример вывода: 5

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        System.out.print("Введите первый элемент: ");
        int n = scanner.nextInt();
        while (n != 0) {
            System.out.print("Введите следующий элемент: ");
            int m = scanner.nextInt();
            if (m != 0) {
                if (n > 0 && m < 0) {
                    sum += n;
                }
            }
            n = m;
        }
        System.out.println("Результат: " + sum);
    }
}

package org.example.hw2.task1;

import java.util.Scanner;

/**
 * 1) Дана последовательность N целых чисел. Найти сумму простых чисел.
 */
public class Ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("sum = " + sumSimple(n));
    }

    /**
     *
     * @param n длина последовательности
     * @return сумма простых чисел
     */
    public static int sumSimple(int n){
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        for (int i = 0; i < n; i++) {
            int m = scanner.nextInt();
            if (isSimple(m)) sum += m;
        }
        return sum;
    }
    /**
     *
     * @param m проверяемое число
     * @return является ли число простым
     */
    public static boolean isSimple(int m) {
        Double sq = Math.sqrt(m);
        for (int i = 2; i <= sq.intValue(); i++) {
            if (m % i == 0) return false;
        }
        return true;

    }
}
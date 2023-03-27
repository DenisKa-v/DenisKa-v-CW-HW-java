package org.example.hw2.task2;

import java.util.Scanner;

/**
 * 2) Дана последовательность из N целых чисел. Верно ли, что последовательность является возрастающей.
 */
public class Ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println("Последовательность возрастающая? " + isGrowing(n));

    }

    /**
     *
     * @param n дина последовательности
     * @return является ли последовательность возрастающей
     */
    private static boolean isGrowing(int n) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b;
        for (int i = 1; i < n; i++) {
            b = scanner.nextInt();
            if (b <= a) return false;
            a = b;
        }
        return true;

    }

}
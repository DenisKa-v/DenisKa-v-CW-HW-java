package org.example.hw1;

import java.util.Scanner;

// 151. Reverse Words in a String
public class Ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите выражение: ");
        String str = scanner.nextLine();
        String result = reverseWords(str);
        System.out.printf("Развернутое выражение: %s", result);
    }

    /**
     * @apiNote Разворот строки
     * @param s строка
     * @return строка
     */
    public static String reverseWords(String s) {
        String[] arr = s.trim().split("\\s+");
        String res = "";
        for (int i = arr.length - 1; i >= 0; i--) {
            res += arr[i] + " ";
        }
        return res;
    }
}

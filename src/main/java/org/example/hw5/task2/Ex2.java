package org.example.hw5.task2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Подсчитать количество искомого слова, через map
 * (наполнением значение, где искомое слово будет являться ключом), вносить все слова не нужно
 */
public class Ex2 {
    public static void main(String[] args) {
        String inputString = "Россия идет вперед всей планеты . Планета — это не Россия.";
        System.out.println(inputString);
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите искомое слово: ");
        String searchWord = scanner.nextLine().toLowerCase();
        Integer countWord = searchWord(inputString.toLowerCase(), searchWord);
        System.out.println("Слово \"" + searchWord + "\" встретилось - " + countWord + " раз.");

    }

    private static Integer searchWord(String inputString, String searchWord) {
        Map<String, Integer> count = new HashMap<>();
        String[] arrWords = inputString.split(" ");
        for (String inputWord : arrWords) {
            String word = inputWord.replaceAll("[^А-Яа-яЁё]", "");
            if (word.equals(searchWord)) {
                count.putIfAbsent(word,0);
                count.put(word,count.get(word)+1);
                return count.get(searchWord);
            }
        }
        return 0;
    }
}

package org.example.hw5.task1;


import java.util.HashMap;
import java.util.Map;

/**
 * Подсчитать количество вхождения каждого слова
 * Пример:
 * Россия идет вперед всей планеты. Планета — это не Россия.
 * toLoverCase().
 * (Усложнение - игнорировать пунктуацию)*
 */
public class Ex1 {
    public static void main(String[] args) {
        String inputString = "Россия идет вперед всей планеты . Планета — это не Россия.".toLowerCase();
        Map<String, Integer> countMap = countWords(inputString);
        for (var entry:countMap.entrySet()) {
            System.out.println("Слово \"" + entry.getKey()+"\" встретилось - "+entry.getValue()+" раз.");
        }

    }

    private static Map<String, Integer> countWords(String inputString) {
        Map<String, Integer> count = new HashMap<>();
        String [] arrWords = inputString.split(" ");
        for (String inputWord : arrWords) {
            String word = inputWord.replaceAll("[^А-Яа-яЁё]","");
            if (word.isEmpty()) continue;
            count.putIfAbsent(word,0);
            count.put(word,count.get(word)+1);
            }
        return count;
    }
}

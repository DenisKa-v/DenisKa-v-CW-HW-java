package org.example.hw3.task3;

import org.example.hw3.task3.model.Books;

import java.util.ArrayList;
import java.util.List;

/**
 * 3. Сведения о книге состоят из названия, фамилии автора, цены, года издания и количества страниц.
 * Найти названия книг, в которых простое количество страниц, фамилия автора содержит «А»
 * и год издания после 2010 г, включительно.
 */
public class Ex3 {
    public static void main(String[] args) {
        Books book1 = new Books("книга Пушкина", "Пушкин", 120, 2021, 200);
        Books book2 = new Books("книга Лермонтова", "Лермонтов", 110, 1950, 170);
        Books book3 = new Books("книга Ахматовой", "Ахматова", 200, 2011, 127);
        Books book4 = new Books("книга Куприна", "Куприн", 200, 2015, 55);
        Books book5 = new Books("книга Толстого", "Толстой", 150, 2020, 350);
        Books book6 = new Books("книга Достоевского", "Достоевский", 100, 2008, 51);

        List<Books> listBooks = new ArrayList<>();
        listBooks.add(book1);
        listBooks.add(book2);
        listBooks.add(book3);
        listBooks.add(book4);
        listBooks.add(book5);
        listBooks.add(book6);

        List<String> result = new ArrayList<>();
        for (Books book : listBooks) {
            if (isSimple(book.getPageCount())
                    & (book.getAuthor().contains("А") | book.getAuthor().contains("а"))
                    & book.getYear() >= 2010) {
                result.add(book.getName());
            }
        }
        System.out.println(result);
    }

    /**
     * Проверка числа: простое оно или нет
     *
     * @param a проверяемое число
     * @return является ли число простым
     */
    public static boolean isSimple(int a) {
        Double sq = Math.sqrt(a);
        for (int i = 2; i <= sq.intValue(); i++) {
            if (a % i == 0) return false;
        }
        return true;
    }


}

package org.example.hw3.task3.model;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * Сведения о книге состоят из названия, фамилии автора, цены, года издания и количества страниц.
 */
@Data
@AllArgsConstructor
public class Books {
    private String name;
    private String author;
    private int price;
    private int year;
    private int pageCount;
}
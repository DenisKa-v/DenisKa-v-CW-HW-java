package org.example.hw3.task1.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Products {
    private String name;
    private int price;
    private int sort;

    private int weight;
    private String country;

}
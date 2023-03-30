package org.example.hw3.task2;

import org.example.hw3.task1.model.Products;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 2. Сведения о товаре состоят из наименования, страны-производителя, веса, цены, сорта.
 * Получить наименования товаров заданного сорта с наименьшей ценой.
 */
public class Ex2 {
    public static void main(String[] args) {
        Products product1 = new Products("высший товар1", 16, 1, 15, "Страна1");
        Products product2 = new Products("товар2", 5, 2, 150, "Страна2");
        Products product3 = new Products("товар3", 45, 3, 900, "Страна1");
        Products product4 = new Products("товар4", 18, 1, 250, "Страна3");
        Products product5 = new Products("товар5", 15, 2, 100, "Страна4");
        Products product6 = new Products("товар6", 5, 2, 300, "Страна2");

        List<Products> listProducts = new ArrayList<>();
        listProducts.add(product1);
        listProducts.add(product2);
        listProducts.add(product3);
        listProducts.add(product4);
        listProducts.add(product5);
        listProducts.add(product6);

        System.out.print("Введите сорт товара: ");
        Scanner scanner = new Scanner(System.in);
        int searchSort = scanner.nextInt();
        List<String> result = new ArrayList<>();
        int minPrice = -1;
        for(Products product : listProducts){
            if (product.getSort() == searchSort){
                if(minPrice == -1) minPrice = product.getPrice();

                if(product.getPrice() < minPrice){
                    minPrice = product.getPrice();
                    result.clear();
                    result.add(product.getName());
                } else if (product.getPrice() == minPrice) {
                    result.add(product.getName());
                }
            }
        }
        System.out.print("Наименование(-я) товара(-ов) :");
        System.out.println(result);
    }
}
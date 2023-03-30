package org.example.hw3.task1;

import org.example.hw3.task1.model.Products;

import java.util.ArrayList;
import java.util.List;

/**
 * 1. Дан массив записей: наименование товара, цена, сорт.
 * Найти наибольшую цену товаров 1го или 2го сорта среди товаров,
 * название которых содержит «высший».
 */
public class Ex1 {
    public static void main(String[] args) {
        Products product1 = new Products("высший товар1", 16, 1, 15, "Страна1");
        Products product2 = new Products("товар2", 33, 2, 150, "Страна2");
        Products product3 = new Products("товар3", 45, 3, 900, "Страна1");
        Products product4 = new Products("товар4", 18, 1, 250, "Страна3");
        Products product5 = new Products("товар5", 5, 2, 100, "Страна4");
        Products product6 = new Products("высший товар6", 45, 2, 300, "Страна2");

        List<Products> listProducts = new ArrayList<>();
        listProducts.add(product1);
        listProducts.add(product2);
        listProducts.add(product3);
        listProducts.add(product4);
        listProducts.add(product5);
        listProducts.add(product6);

        int maxPrice = 0;
        for (Products product : listProducts) {
            if (product.getName().contains("высший")
                    & (product.getSort() == 1 | product.getSort() == 2)
                    & product.getPrice() > maxPrice) {
                maxPrice = product.getPrice();
            }
        }
        System.out.println("Наибольшая цена товара: " + maxPrice);
    }
}
package org.example.hw6;

import org.example.hw6.model.Market;

public class Ex {
    public static void main(String[] args) {
        Market store = new Market(8);
        System.out.println(store);
        store.findNotebook();
    }
}

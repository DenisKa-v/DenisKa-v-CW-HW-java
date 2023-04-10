package org.example.hw6.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Random;
import java.util.Scanner;

@Data
@AllArgsConstructor
public class Market {
    private Notebook[] listNotebook;

    public Market(int count) {
        Random rand = new Random();
        listNotebook = new Notebook[count];
        for (int i = 0; i < listNotebook.length; i++) {
            listNotebook[i] = new Notebook(rand.nextInt(8000), rand.nextInt(1024), "Windows", "Red");
        }
    }

    public void findNotebook() {
        System.out.println("1 - ОЗУ\n" +
                "2 - Объем ЖД\n" +
                "3 - Операционная система\n" +
                "4 - Цвет");
        System.out.print("Введите цифру, соответствующую необходимому критерию: ");
        Scanner sc = new Scanner(System.in);
        switch (sc.nextInt()) {
            case 1:
                System.out.print("Введите минимальный объём ОЗУ: ");
                int ram = sc.nextInt();
                for (var item : getListNotebook()) {
                    if (item.get_ram() >= ram) {
                        System.out.println(item);
                    }
                }
                break;
            case 2:
                System.out.print("Введите минимальный объём жёсткого диска: ");
                int hd = sc.nextInt();
                for (var item : getListNotebook()) {
                    if (item.get_hd() >= hd) {
                        System.out.println(item);
                    }
                }
                break;
            case 3:
                System.out.print("Введите требуемую ос: ");
                String os = sc.next();
                for (var item : getListNotebook()) {
                    if (item.get_os().equals(os)) {
                        System.out.println(item);
                    }
                }
                break;
            case 4:
                System.out.print("Введите цвет: ");
                String color = sc.next();
                for (var item : getListNotebook()) {
                    if (item.get_color().equals(color)) {
                        System.out.println(item);
                    }
                }
                break;
            default:
                System.out.println("Not found!");
                break;
        }
    }
}

package org.example.hw4.task1;

import java.util.LinkedList;

/**
 * Вывести список на экран в перевернутом виде (без массивов и ArrayList)
 */
public class Ex1 {
    public static void main(String[] args) {
        LinkedList inputLinkedList = new LinkedList<>();
        for (int i = 0; i < 6; i++) {
            inputLinkedList.add(i);
        }
        System.out.println(inputLinkedList);
        LinkedList reversLinkedList = reverseList(inputLinkedList);
        System.out.println(reversLinkedList);
    }

    /**
     * Разворот списка
     *
     * @param inputLinkedList входящий список
     * @return развернутый список
     */
    private static LinkedList reverseList(LinkedList inputLinkedList) {
        LinkedList resultLinkedList = new LinkedList<>();
        while (inputLinkedList.size() > 0) {
            resultLinkedList.addFirst(inputLinkedList.pop());
        }
        return resultLinkedList;
    }
}

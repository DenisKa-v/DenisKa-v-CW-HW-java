package org.example.hw4.task2;

import java.util.Deque;
import java.util.LinkedList;

/**
 * Given a string s containing just the characters '(', ')', '{', '}', '[' and ']',
 * determine if the input string is valid.
 */
public class Ex2 {
    public static void main(String[] args) {
        String inputString1 = "[](]";
        String inputString2 = "()[]{}";
        String inputString3 = "()";
        String inputString4 = "[(])";
        String inputString5 = "][";
        System.out.println(inputString1 + ": " + isValid(inputString1));
        System.out.println(inputString2 + ": " + isValid(inputString2));
        System.out.println(inputString3 + ": " + isValid(inputString3));
        System.out.println(inputString4 + ": " + isValid(inputString4));
        System.out.println(inputString5 + ": " + isValid(inputString5));
    }

    private static Boolean isValid(String inputString) {
        char[] arr = inputString.toCharArray();
        Deque qu = new LinkedList();
        String open = "([{";
        for (Character ch : arr) {
            if (open.contains(ch.toString())) qu.add(ch);
            else if (qu.isEmpty()) return false;
            else if (ch.equals(']') && !qu.pollLast().equals('[')) return false;
            else if (ch.equals(')') && !qu.pollLast().equals('(')) return false;
            else if (ch.equals('}') && !qu.pollLast().equals('{')) return false;
        }
        return qu.isEmpty();
    }
}

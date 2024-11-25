package com.random.practice;

import java.util.NoSuchElementException;

public class ReverseString {

    public static void main(String[] args) {
        String str = "abcdefghijklmnopqrstuvwxyz";
        System.out.println(reverseString(str));
    }

    private static String reverseString(String str) {
        if ( str == null)
            throw new NoSuchElementException("value not present");

        char[] charsString = str.toCharArray();
        StringBuilder reversedString = new StringBuilder();
        for (int i = charsString.length-1; i >= 0 ; i--)
            reversedString.append(charsString[i]);

        return reversedString.toString();
    }

}

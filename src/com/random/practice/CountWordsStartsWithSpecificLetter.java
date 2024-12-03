package com.random.practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class CountWordsStartsWithSpecificLetter {
    //How do you count the words in a list that start with a specific letter using Stream API?
public static void main(String[] args){

    List<String> words = Arrays.asList("apple", "banana", "apricot", "cherry", "avocado");

    long count = words.stream().filter(word -> word.startsWith("a"))
        .count();
    System.out.println("Words starting with 'a': " + count);
}
}

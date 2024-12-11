package com.random.practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Convert all strings in a list to uppercase using Stream API.
public class ListOfStringToUpperCase {
    public static void main(String[] args){

        List<String> words = Arrays.asList("java", "spring", "hibernate");

        List<String> uppercaseWords = words.stream().map(String::toUpperCase).toList();

        uppercaseWords.stream().forEach(System.out::println);
    }

}

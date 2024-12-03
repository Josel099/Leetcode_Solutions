package com.random.practice;

import java.util.Arrays;
import java.util.List;

//Write a program to calculate the sum of even numbers in a list using Stream API.
public class SumofEvenNumber {

    public static void main(String[] args) {

        List<Integer> listOfNumbers = Arrays.asList(1, 2, 3, 4, 234, 32, 5, 12, 3, 556, 2, 34, 123,
            34, 5, 45, 6);

        int sum = listOfNumbers.stream().filter(num -> num % 2 == 0).mapToInt(Integer::intValue)
            .sum();
        System.out.println(sum);
    }

}

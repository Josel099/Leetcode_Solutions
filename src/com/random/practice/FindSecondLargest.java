package com.random.practice;

import java.util.Arrays;
import java.util.List;
//write a program to find the second largest number in a list using Stream API.
public class FindSecondLargest {
public static  void main(String[] args){

    List<Integer> numbers = Arrays.asList(1,2,12,23,4,5,2,3,4,5);

    int secondLargest = numbers.stream().sorted((a,b)->b-a)
        .skip(1)
        .findFirst()
        .orElseThrow(()->new RuntimeException("List does not have enough elements"));

    System.out.println(secondLargest);
}
}

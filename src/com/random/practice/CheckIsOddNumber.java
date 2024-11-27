package com.random.practice;

import java.util.Arrays;
import java.util.List;

// check if a list of integers contains only odd numbers in Java?
public class CheckIsOddNumber {

    public static void main(String[] args) {
        System.out.println(isListContainOnlyOdd(Arrays.asList(1, 33, 41, 15)));
        System.out.println("using Streams : "+isListContainOnlyOddUsingStreams(Arrays.asList(1,349,55,13)));
    }

    private static boolean isListContainOnlyOdd(List<Integer> list) {
        for (int i : list)
            if (i % 2 == 0)
                return false;

        return true;
    }

    private static boolean isListContainOnlyOddUsingStreams(List<Integer> list) {
        return list.stream().allMatch(a -> a % 2 != 0);
    }

}
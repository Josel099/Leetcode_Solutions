package com.random.practice;

public class Fibonacci {

    public static void main(String[] args) {
        printFibonacci(10);
    }

    private static void printFibonacci(int num) {
        for (int i = 0; i <= num; i++) {
            System.out.println(fibonacci(i) + " ");
        }
    }

    private static int fibonacci(int i) {
        if (i == 0)
            return 0;
        if (i == 1)
            return i;
        return fibonacci(i - 1) + fibonacci(i - 2);
    }

}

package com.random.practice;

public class SwapNumbers {

    public static void main(String[] args) {
        int a = 103;
        int b = 58;
        swapNumbers(a, b);
        swapNumbersWithoutAddAndSub(a, b);
    }

    private static void swapNumbers(int a, int b) {
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("a = " + a + "\n b = " + b);
    }

    private static void swapNumbersWithoutAddAndSub(float a, float b) {
        a = a / b;
        b = a * b;
        a = b / a;
        System.out.println("swap without additon and subtraction \n a = " + a + "\n b = " + b);
    }

}

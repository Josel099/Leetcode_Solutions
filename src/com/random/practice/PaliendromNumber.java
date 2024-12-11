package com.random.practice;

public class PaliendromNumber {

    public static void main(String[] args) {
        System.out.println(isPalindrome(-121));
    }

    public static boolean isPalindrome(int x) {
        int temp = x;
        int reverse = 0;
        while (temp != 0) {
            reverse = reverse * 10 + (temp % 10);
            temp = temp / 10;
        }
        return Math.abs(x) == reverse;
    }
}

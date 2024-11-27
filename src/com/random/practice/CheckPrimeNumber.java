package com.random.practice;

public class CheckPrimeNumber {

    public static void main(String[] args) {
        System.out.println(checkPrime(23));
    }

    private static boolean checkPrime(int num) {
        if (num == 1 || num == 0)
            return false;
        for (int i = 2; i<=num/2; i++) {
            if (num % i == 0)
                return false;
        }
       return true;
    }
}

package com.leetcode.array.easy;

public class FibonacciNumber509 {
}
// Recursive Solution
class fibn {
    public int fib(int n) {
        if(n<=1 ) return n;
    return  fib(n-1) + fib(n-2);
    }
}

//Optimized Solution
class fibnacci509 {
    int a = 0;
    int b = 1;
    int sum;
    public int fib(int n) {
        if(n<=1 ) return n;

        while(n>1){
            sum = a+b;
            a = b;
            b = sum;
            n--;
        }
        return  sum;
    }
}
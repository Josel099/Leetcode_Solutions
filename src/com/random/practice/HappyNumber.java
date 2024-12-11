package com.random.practice;

import java.util.HashSet;

public class HappyNumber {

    public static void main(String[] args) {
        System.out.println(isHappy(19));
    }

    private static boolean isHappy(int num) {
        int sum  = num;
        HashSet<Integer> set = new HashSet<>();
        set.add(sum);
      while(sum != 1){
          sum = happySum(sum);
          if(set.contains(sum)) return false;
          set.add(sum);
        }
        return sum == 1;
    }

    public static int happySum(int n) {
        int reminder = n % 10;
        int sum = reminder*reminder;
        int divider  = n /10 ;
            while(divider / 10 > 0 ){
                reminder = divider%10;
                divider = divider/10;
                sum+= reminder*reminder;
            }

        sum += divider*divider;
        return sum;
    }

}
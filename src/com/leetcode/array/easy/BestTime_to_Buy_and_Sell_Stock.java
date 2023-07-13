package com.leetcode.array.easy;

import java.util.Scanner;

public class BestTime_to_Buy_and_Sell_Stock {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        int n = sc.nextInt();
        int [] prices= new int[n];
        for(int i=0;i<n;i++){
            prices[i]=sc.nextInt();
        }
        Solution s = new Solution();
        System.out.println(s.maxProfit(prices));

    }
}
class Solution {
    public int maxProfit(int[] prices) {
        int buy=Integer.MAX_VALUE;
        int profit=0;
        for (int i=0 ; i<prices.length ; i++){

            if( buy > prices[i]){
                buy= prices[i];
            }
            else if( profit < (prices[i]-buy) ){
                profit = prices[i]-buy;
            }

        }

    return profit;
    }
}

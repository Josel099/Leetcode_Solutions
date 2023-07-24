package com.leetcode.array.easy;

public class BuyandSellStock122 {
    public static void main(String[] args) {
      int[]  prices = {1,2,3,4,5};
      stock2 s= new stock2();
      System.out.println(s.maxProfit(prices));
    }
}
class stock2 {
    public int maxProfit(int[] prices) {

        int buy = Integer.MAX_VALUE;
        int profit = 0 ;
        int tempProfit = 0;
        int sell =0;
        boolean flag = false;
        for (int i = 0; i<prices.length;i++){

            if(prices[i]<buy || prices[i] < sell){
                buy = prices[i];
                profit =tempProfit+profit;
                tempProfit =0;
                sell =0 ;
                flag =false;
            }
            if (tempProfit < (prices[i] - buy)) {
                sell =prices[i];
                tempProfit = prices[i] - buy;
                flag = true;
            }
        }
            if(flag == true){
                profit =tempProfit+profit;
            }
    return profit;
    }
}


// optimized code :::
class Stock122 {
    public int maxProfit(int[] prices) {
    int profit = 0;

    for(int i =1 ; i< prices.length;i++){
        if(prices[i]>prices[i-1]){
            profit += (prices[i]-prices[i-1]);
        }
    }

    return  profit;
    }}



//--Qestion
//    You are given an integer array prices where prices[i] is the price of a given stock on the ith day.
//
//        On each day, you may decide to buy and/or sell the stock. You can only hold at most one share of the stock at any time. However, you can buy it then immediately sell it on the same day.
//
//        Find and return the maximum profit you can achieve.
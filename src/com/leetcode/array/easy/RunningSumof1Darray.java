package com.leetcode.array.easy;

public class RunningSumof1Darray {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};
        runningsum rs = new runningsum();
        int[] sum = rs.runningSum(nums);
        for (int i = 0 ; i< nums.length;i++){
            System.out.println(sum[i]);
        }
    }
}
class runningsum {
    public int[] runningSum(int[] nums) {

        int[] runningsum = new int[nums.length];
        runningsum[0] = nums[0];

        for(int i =1 ;i< nums.length;i++){
            runningsum[i] =runningsum[i-1]+nums[i];
        }


        return runningsum;
    }
}
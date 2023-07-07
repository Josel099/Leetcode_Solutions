package com.leetcode.array.easy;

public class Twosum {

}
 class Solution1 {
    public int[] twoSum(int[] nums, int target) {
        int [] addtotarget= new int[2];

        for(int i=0;i<nums.length-1; i++){

            for(int j=i+1;j<nums.length; j++){

                if(target==( nums[i]+nums[j])){
                    addtotarget[0]=i;
                    addtotarget[1]=j;
                    break;
                }

            }

        }

        return addtotarget;
    }
}
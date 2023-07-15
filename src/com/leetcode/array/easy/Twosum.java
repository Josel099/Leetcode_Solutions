package com.leetcode.array.easy;

import java.util.HashMap;
import java.util.Map;

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

        return  addtotarget;
    }
}

// solution 2 : optimized

class Solution2{
    public int[] twoSum(int[] nums, int target) {
        Map <Integer,Integer> map = new HashMap<>();

        for(int i =0; i<nums.length ; i++ ){
        if(map.containsKey(target-nums[i])){

            return new int[] {map.get(target-nums[i]),i};
        }
        else
            map.put(nums[i],i);

    }

        return new int[] {};
    }
}
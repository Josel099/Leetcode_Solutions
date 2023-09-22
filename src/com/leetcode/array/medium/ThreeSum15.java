package com.leetcode.array.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum15 {
}

 class Solution15{
     public List<List<Integer>> threeSum(int[] nums) {
         List<List<Integer>> result = new ArrayList<>();
         Arrays.sort(nums);
         for(int i = 0 ; i< nums.length ; i++){
             if( i > 0 && nums[i] == nums[i-1]) continue; // to skip the duplicate of first element of the triplet
           int  j=i+1;
           int k = nums.length-1;
            while(j<k) {
                int sum = nums[i] + nums[j] + nums[k];
                if (sum < 0) j++;
                else if (sum > 0) k--;
                else if (sum == 0 ) {
                    result.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    j++;
                    k--;
                }
                // Skip duplicates for the second and third elements of the triplet.


            }

         }
         return result ;
     }

 }
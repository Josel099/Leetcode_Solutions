package com.leetcode.array.medium;

public class SubarraySumEqualsK560 {

}
class Solution560 {  // bruteforce approach
    public int subarraySum(int[] nums, int k) {
        int count=0 ;
        for(int i = 0 ; i< nums.length ; i++ ){ // loop for first position moving
             int sum = nums[i] ;
             if(sum == k ) {                    // condition for find  if an one element of the array is equals to the k (target element);
                 count++;
             }
             for(int j=i+1 ; j< nums.length; j++){    // loop for continuous sub array sum finding
                 sum = sum+ nums[j];

                 if(sum == k ) count++;

             }
        }
 return count;
    }
}

class Solution5602{
    public int subarraySum(int[] nums , int k ) {

    }
}
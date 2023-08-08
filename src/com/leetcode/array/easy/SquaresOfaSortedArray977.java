package com.leetcode.array.easy;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SquaresOfaSortedArray977 {
}

// simple  solution
// time complexity ::: O(n log n)
class squareofsortedarray977 {
    public int[] sortedSquares(int[] nums) {


        for(int i = 0 ; i<nums.length ; i++){
            nums[i]=nums[i]*nums[i];
        }
        Arrays.sort(nums);

    return nums;
    }
}

// optimized solution with linear time complexity : O(n)
class Solution977 {
    public int[] sortedSquares(int[] nums) {

        int left =0 ;
        int right = nums.length-1 ;
        int[] arr = new int[nums.length];

        for( int i = nums.length-1; i >= 0 ; i-- ){
        if( Math.abs(nums[left]) <= Math.abs(nums[right])){
            arr[i] = nums[right] * nums[right];
            right-- ;
        }else {
            arr[i] =nums[left] * nums[left];
            left++;
        }
        }

    return arr;
    }
}
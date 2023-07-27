package com.leetcode.array.easy;

public class FindPivotIndex724 {
    public static void main(String[] args) {
        int [] nums = { 2,1,-1 };
        pivotIndex pi = new pivotIndex();
        int i = pi.pivotIndex(nums);
        System.out.println(i);
    }
}
class pivotIndex {
    public int pivotIndex(int[] nums) {

        int leftSum = 0 ;
        int rightSum = 0 ;

        for(int i =1 ; i< nums.length; i++ ){
            rightSum = rightSum + nums[i];
        }
        for(int i =0; i<nums.length ; i++){

            if(leftSum == rightSum){ // checking the pivot index
                return i;
            }
            else if(i != nums.length-1){
                rightSum -= nums[i + 1]; //  updating the right sum
                leftSum += nums[i];    // adding the left sum
            }
        }

    return -1;
    }
}
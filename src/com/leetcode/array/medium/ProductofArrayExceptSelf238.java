package com.leetcode.array.medium;

public class  ProductofArrayExceptSelf238 {

}
class Solution238 {
    public int[] productExceptSelf(int[] nums) {

        int[] Answer = new int[nums.length];

        //int prefix = 1 ;
        for(int i = 0 ; i< nums.length ; i++){

            if(i==0) Answer[i] = 1;
            else{
                Answer[i] = Answer[i-1] * nums[i-1] ;
            }
        }

        int postfix = 1 ;
        for(int i = nums.length-1 ; i>=0 ; i--){

            if(i == nums.length-1) Answer[i] = Answer[i] * postfix ;
            else{
                postfix = postfix* nums[i+1] ;
                Answer[i] = Answer[i]*postfix ;
            }
        }

    return  Answer;
    }
}

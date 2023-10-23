package com.leetcode.array.medium;

import java.util.HashMap;

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

//Optimal Soloution

class Solution602{
    public int subarraySum(int[] nums , int k ) {
        int sum=0 ;
        int count=0 ;
        HashMap<Integer,Integer> hashMap= new HashMap<>();
        hashMap.put(0,1);
        for(int i = 0 ; i< nums.length ; i++){
            sum = sum + nums[i];
            if(hashMap.containsKey(sum-k)){ // checking the hashMap contains the
                count= count+hashMap.get(sum-k);
            }
            if(hashMap.containsKey(sum)) // Check if the key is already present in the HashMap
                hashMap.put(sum, hashMap.get(sum)+1); // Key is present, increment the value by 1
            else  hashMap.put(sum,1);

        }
        return count;
    }
}
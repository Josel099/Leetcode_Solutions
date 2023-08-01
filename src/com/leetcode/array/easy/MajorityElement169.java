package com.leetcode.array.easy;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement169 {
}
class majorityElement169 {
    public int majorityElement(int[] nums) {

        Map<Integer,Integer> map = new HashMap<>();

//        for(int i : nums ){
//            if(map.containsKey(i)){
//               int count = map.get(i);
//               map.put(i,count+1);
//            }
//            else map.put(i,1);
//        }
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int n = nums.length;
        for (int num : map.keySet()) {
            if (map.get(num) > n / 2) {
                return num;
            }
        }

    return -1;
    }
}

// optimized solution
// moore's voting algorithem
class majorityElment169Optimized {
    public int majorityElement(int[] nums) {

   Integer  majorityNum = null;
   int count = 0 ;

   for(int num : nums){

       if(count == 0 ){
           majorityNum = num;
           count++;
       }else if(majorityNum == num){
           count++;
       }else count--;

   }

    return majorityNum;
    }
}

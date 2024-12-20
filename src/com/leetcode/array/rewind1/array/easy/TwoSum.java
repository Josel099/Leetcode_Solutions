package com.leetcode.array.rewind1.array.easy;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static void main(String[] args) {
        twoSum(new int[] { 1, 2, 3, 4, 23, 11, 2, 33, 43 }, 4);
    }

    public static int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];

            if (map.containsKey(diff)) {
                return new int[] { i, map.get(diff) };
            } else {
                map.put(nums[i], i);
            }
        }
        return new int[] {};
    }

}
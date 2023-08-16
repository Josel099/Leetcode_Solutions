package com.leetcode.array.easy;

public class RemoveDuplicatesfromSortedArray26 {

}
class Solutions26 {
        public int removeDuplicates(int[] nums) {
            int left = 0;
            int right = 1;

            while (right < nums.length) {
                if (nums[left] != nums[right]) {
                    left++;
                    nums[left] = nums[right];
                }
                right++; // Increment right regardless of the condition
            }

            return left + 1; // Return the length of the new array
        }
    }
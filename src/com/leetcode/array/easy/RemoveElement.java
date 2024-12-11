package com.leetcode.array.easy;

public class RemoveElement {

    public static void main(String[] args) {

    }

    public static int removeElement(int[] nums, int val) {
        int writeElement = 0;
        for (int i = 0; i <= nums.length - 1; i++) {
            if (nums[i] != val) {
                nums[writeElement] = nums[i];
                writeElement++;

            }

        }
        return writeElement;
    }

}

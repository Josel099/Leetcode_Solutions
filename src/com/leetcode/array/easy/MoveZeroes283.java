package com.leetcode.array.easy;

public class MoveZeroes283 {
    public static void main(String[] args) {

        int[]  nums= {0 , 1 , 0 , 3 , 12};
        move m = new move();
        int[] r = m.moveZeroes(nums);
        for(int i = 0; i<nums.length ; i++){
            System.out.println(nums[i]);
        }
    }


}
class move {
    public int[] moveZeroes(int[] nums) {

        int zPointer =0;
        int numPointer = 1;

        while(numPointer < nums.length){

            if( nums[zPointer] != 0){
                zPointer++;
                numPointer++;
            }
            else if( nums[zPointer] == 0 && nums[numPointer] !=0){

                int temp = nums[zPointer] ;
                nums[zPointer] = nums[numPointer];
                nums[numPointer] = temp;
                zPointer++;
                numPointer++;
            } else if ( nums[numPointer] == 0 ) {
                numPointer++;
            }

        }

    return nums;
    }
}
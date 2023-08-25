package com.leetcode.array.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeIntervals56 {

}
class Solution56 {
    public int[][] merge(int[][] intervals) {

       List<int[]> mergedArray = new ArrayList<>();

        Arrays.sort(intervals,(a,b) -> a[0] - b[0]); //lambda expression

        //mergedArray.add(intervals[0]);

        int[] newInterval = intervals[0] ;

        for(int[] interval : intervals){

            if(newInterval[1] >=  interval[0]){

                newInterval[1] = Math.max(newInterval[1],interval[1]);
            }
            else{
                    mergedArray.add(newInterval);
                    newInterval = interval;
            }
        }
        mergedArray.add(newInterval);// in this method last interval is not added to the finelArray by the for loop so we additionly add the remaining interval to the result .
        return mergedArray.toArray(new int[mergedArray.size()][]);
    }
}

//    Time Complexity: O(n log n) for sorting + O(n) for iteration and conversion = O(n log n)
//        Space Complexity: O(n) for the ArrayList + O(n) for the output array = O(n)
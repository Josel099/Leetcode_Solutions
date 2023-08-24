package com.leetcode.array.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeIntervals56 {

}
class Solution56 {
    public int[][] merge(int[][] intervals) {

       List<int[]> mergedArray = new ArrayList<>();

        Arrays.sort(intervals,(a,b) -> a[0] - b[0]);
        for (int i = 0; i < intervals.length - 1; i += 2) {

            if (intervals[i][1] >= intervals[i + 1][0]) {

                mergedArray.get(i)[0] = intervals[i][0];
                mergedArray.get(i)[1] = intervals[i + 1][1];

            } else {
                mergedArray.add(intervals[i]);
            }


        }
        return mergedArray.toArray(new int[mergedArray.size()][]);
    }
}

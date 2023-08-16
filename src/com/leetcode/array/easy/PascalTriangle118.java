package com.leetcode.array.easy;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle118 {
}
class Solution118 {
    public List<List<Integer>> generate(int numRows) {

        List<List<Integer>> result = new ArrayList<>();
        if (numRows == 0) return result;

        // Base case: First row is always [1]
        List<Integer> row = new ArrayList<>();
        row.add(1); // first element  of the list is 1
        result.add(row); // adding the first list to the main list

        List <Integer> prev = new ArrayList<>();

        for(int i = 1 ; i < numRows ; i++ ){ // Start from row 1 (index 0) as the first row is already added
        List<Integer> currentRow = new ArrayList<>();
        currentRow.add(1);   // First element of each row is always 1

        for(int j = 1 ; j < i ; j++ ){
            currentRow.add( prev.get(j)+prev.get(j-1)) ;
        }
        currentRow.add(1);  // Last element of each row is always 1
        result.add(currentRow);
        prev = currentRow;
        }
        return result;
    }
}

// better solution with combinations nCr  : n-1 C r-1
// time complexity = O(n) 
class betterSolution188{
    public List<List<Integer>> generate(int numRows) {

        List<List<Integer>> res=new ArrayList<>();
        for(int i=1;i<=numRows;i++){
            //each row
            List<Integer> temp=new ArrayList<>();
            int ans=1;
            temp.add(ans);
            for(int j=1;j<i;j++){
                ans=ans*(i-j);
                ans=ans/j;
                temp.add(ans);
            }
            res.add(temp);
        }
        return res;
    }
}

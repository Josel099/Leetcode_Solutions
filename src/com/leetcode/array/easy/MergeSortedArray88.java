package com.leetcode.array.easy;

public class MergeSortedArray88 {
    public static void main(String[] args) {

        int m = 3;
        int n = 3;

        int[] nums1={1,2,3,0,0,0};
        int [] nums2={2,5,6};

        merge88 res = new merge88();
        res.merge(nums1,m,nums2,n);
        for(int i =0 ; i<m+n;i++){
            System.out.println(nums1[i]);
        }
    }
}
//  OPTIMIZED SOLUTION ::::
class merge88{
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int i = m-1;
        int j = n-1;
        int k = m+n-1;

        while(i >= 0 && j >= 0){

            if(nums1[i] < nums2[j]){

                nums1[k]=nums2[j];
                j--;
            }else {

                nums1[k] = nums1[i];
                i--;
            }
            k--;
        }
        while(j >= 0 ){
            nums1[k--] = nums2[j--]; // postfix expression .

        }


    }

}


//SOLUTION:1
// class merge88{
//    public void merge(int[] nums1, int m, int[] nums2, int n) {
//        int j=0;
//        for(int i =m;i<m+n;i++){
//            nums1[i]=nums2[j];
//            j++;
//        }
//        for(int k=0;k<m+n-1;k++){
//            for(int i=0;i<m+n-1-k;i++){
//                if(nums1[i]>nums1[i+1]){
//                    int temp=nums1[i];
//                    nums1[i]=nums1[i+1];
//                    nums1[i+1] = temp;
//                }
//            }
//
//        }
//    }
//}
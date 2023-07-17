package com.brototype.datastruchurechallenge;

import java.util.Scanner;

public class ArrayArrangeToLast {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int target= sc.nextInt();
        int[] ar= new int[n];
        for(int i=0;i<n;i++){
            ar[i] = sc.nextInt();
        }

        ResultArray re= new ResultArray();
        int [] result=re.arrange(ar,n,target);
        for(int i=0;i<n;i++){
            System.out.println(result[i]);
        }

    }
}
class ResultArray{

    public int[]  arrange(int ar[],int n,int target){

        int first =0;    int last=n-1;

        while(first<last){
            if(ar[last]==target){
                last--;
            }
            else if ( ar[first] ==target) {
                ar[first]=ar[last];
                ar[last]=target;
                first++;
                last--;
            }else{
                first++;
            }


        }
        return ar;

    }
}

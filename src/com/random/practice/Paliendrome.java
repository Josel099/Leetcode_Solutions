package com.random.practice;

public class Paliendrome {

    public static void main(String[] args) {

        String str = "josel";

        char[] strCharArray = str.trim().toCharArray();
        int j = strCharArray.length - 1;
        for (int i = 0; i <= j; i++) {
            if (strCharArray[i] != strCharArray[j]) {
                System.out.println(str + " : The given String is not a paliendrome");
                return;
            }
            j--;
        }

        System.out.println(str + " :The given String is  Paliendrome");
    }

}

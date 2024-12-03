package com.leetcode.array.easy;

public class LongestCommonPrefix {

    public static void main(String[] args) {
        System.out.println(longestCommonPrefix(new String[] { "flower", "flow", "flight" }));

    }

    public static String longestCommonPrefix(String[] strs) {

        String prefix = strs[0];
        for (int i = 1; i <= strs.length-1; i++) {
            if(prefix.isEmpty()) return "";
            while (!strs[i].startsWith(prefix)) {
               prefix = prefix.substring(0,prefix.length()-1);
            }
        }

        return prefix;

    }

}

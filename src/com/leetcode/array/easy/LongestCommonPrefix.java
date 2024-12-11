package com.leetcode.array.easy;

import java.util.Arrays;

public class LongestCommonPrefix {

    public static void main(String[] args) {
//        System.out.println(longestCommonPrefix(new String[] { "flower", "flow", "flight" }));
        System.out.println(longestCommonPrefix(new String[] {"flight","flr", "flow", "flower", "flue","kwa"}





));

    }

    public static String longestCommonPrefix(String[] strs) {

        String prefix = strs[0];
        for (int i = 1; i <= strs.length - 1; i++) {
            if (prefix.isEmpty())
                return "";
            while (!strs[i].startsWith(prefix)) {
                prefix = prefix.substring(0, prefix.length() - 1);
            }
        }

        return prefix;

    }

    public static String longestCommonPrefixSecondSolution(String[] strs) {
        if (strs.length == 0)
            return "";
        if (strs.length == 1)
            return strs[0];

        Arrays.sort(strs);
        int end = Math.min(strs[0].length(), strs[strs.length - 1].length());
        int i = 0;
        while (i < end && strs[0].charAt(i) == strs[strs.length - 1].charAt(i))
            i++;

        return strs[0].substring(0, i);
    }

}

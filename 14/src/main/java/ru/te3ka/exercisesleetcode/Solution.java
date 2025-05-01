package ru.te3ka.exercisesleetcode;

public class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder lcp = new StringBuilder();

        int minLen = Integer.MAX_VALUE;
        for (String str : strs) {
            if (minLen > str.length())
                minLen = str.length();
        }

        for (int i = 0; i < minLen; i++) {
            char _char = strs[0].charAt(i);
            for (String str : strs) {
                if (str.charAt(i) != _char) {
                    return lcp.toString();
                }
            }
            lcp.append(_char);
        }

        return lcp.toString();
    }
}

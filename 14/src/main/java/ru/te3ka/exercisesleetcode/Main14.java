package ru.te3ka.exercisesleetcode;

import java.util.Arrays;

public class Main14 {
    public static void main(String[] args) {
        Solution solution = new Solution();
//        String[] strs = {"flower", "flow", "flight"};
//        String[] strs = {"flower", "flow", "flowwow"};
        String[] strs = {"bands", "bandana", "banana", "bang"};

        System.out.println(Arrays.toString(strs));
        System.out.println(solution.longestCommonPrefix(strs));
    }
}
package ru.te3ka.exercisesleetcode;

import java.util.Arrays;

public class Solution {
    public int heightChecker(int[] heights) {
        int[] expected = Arrays.stream(heights).sorted().toArray();
        System.out.println(Arrays.toString(expected));

        int errors = 0;
        for (int i = 0; i < heights.length; i++) {
            if (heights[i] != expected[i])
                errors++;
        }

        return errors;
    }
}

package ru.te3ka.exercisesleetcode;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> returns = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            returns.add(i + 1);
        }

        for (int num : nums) {
            if (returns.contains(num)) {
                returns.remove(returns.indexOf(num));
            }
        }
        return returns;
    }
}

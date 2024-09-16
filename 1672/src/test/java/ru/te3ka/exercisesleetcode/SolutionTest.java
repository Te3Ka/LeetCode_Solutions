package ru.te3ka.exercisesleetcode;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {
    Solution solution = new Solution();

    @Test
    public void maximumWealth01() {
        int[][] input = {
                {2, 8, 7}, // 17
                {7, 1, 3}, // 11
                {1, 9, 10}, // 20
                {3, 2, 1}  // 6
        };
        Assert.assertEquals(20, solution.maximumWealth(input));
    }

    @Test
    public void maximumWealth02() {
        int[][] input = {
                {2, 8, 7},
                {7, 1, 3},
                {1, 9, 10},
                {7, 7, 5, 0, 6},
                {8, 5, 6, 3, 9, 9},
                {3, 2, 1},
                {3, 2, 1}
        };
        Assert.assertEquals(40, solution.maximumWealth(input));
    }
}
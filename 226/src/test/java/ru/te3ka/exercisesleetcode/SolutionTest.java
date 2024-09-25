package ru.te3ka.exercisesleetcode;

import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

public class SolutionTest {
    Solution solution = new Solution();
    @Test
    public void invertTree() {
        Assert.assertEquals(
                "[ 4 7 2 9 6 3 1 ]",
                solution.invertTree(
                        new TreeNode(4,
                                new TreeNode(2,
                                        new TreeNode(1),
                                        new TreeNode(3)
                                ),
                                new TreeNode(7,
                                        new TreeNode(6),
                                        new TreeNode(9)
                                )
                        )
                )
        );
    }
}
package ru.te3ka.exercisesleetcode;

public class Solution {
    public TreeNode invertTree(TreeNode root) {
        if (root == null)
            return null;
        else {
            TreeNode res;
            res = root.left;
            root.left = root.right;
            root.right = res;

            invertTree(root.left);
            invertTree(root.right);

            return root;
        }
    }
}
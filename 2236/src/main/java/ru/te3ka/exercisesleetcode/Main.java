package ru.te3ka.exercisesleetcode;

public class Main {
    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(10,
                new TreeNode(4),
                new TreeNode(6)
        );

        TreeNode treeNode2 = new TreeNode(5,
                new TreeNode(1),
                new TreeNode(2)
        );

        Solution solution = new Solution();
        System.out.println(solution.checkTree(treeNode2));
    }
}
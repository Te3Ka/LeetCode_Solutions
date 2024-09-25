package ru.te3ka.exercisesleetcode;

public class Main {
    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(
                4,
                new TreeNode(2,
                        new TreeNode(1),
                        new TreeNode(3)
                ),
                new TreeNode(7,
                        new TreeNode(6),
                        new TreeNode(9)
                )
        );

        System.out.println("input:  [ " + treeNode.val + " "
                + treeNode.left.val + " "
                + treeNode.right.val + " "
                + treeNode.left.left.val + " "
                + treeNode.left.right.val + " "
                + treeNode.right.left.val + " "
                + treeNode.right.right.val + " ]"
        );

        Solution solution = new Solution();

        TreeNode invertTree = solution.invertTree(treeNode);

        System.out.println("output: [ " + invertTree.val + " "
                + invertTree.left.val + " "
                + invertTree.right.val + " "
                + invertTree.left.left.val + " "
                + invertTree.left.right.val + " "
                + invertTree.right.left.val + " "
                + invertTree.right.right.val + " ]"
        );

        System.out.println(treeNode);
    }
}
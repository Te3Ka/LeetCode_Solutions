package ru.te3ka.exercisesleetcode;

public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    //TODO: Сделать toString
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[ ");
        sb.append(val).append(" ");
        if (left != null) {
            sb.append(left.toString()).append(" ");
        }
        if (right != null) {
            sb.append(right.toString()).append(" ");
        }
        sb.append("]");
        return sb.toString();
    }
}

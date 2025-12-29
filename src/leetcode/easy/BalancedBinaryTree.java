package leetcode.easy;


public class BalancedBinaryTree {
    public static void main(String[] args) {

    }

    public boolean isBalanced(TreeNode root) {
        if (root == null) return true;

        if (Heigh(root) == -1) return false;
        return true;
    }

    public int Heigh(TreeNode root) {
        if (root == null) return 0;

        int leftHeight = Heigh(root.left);

        int rightHeight = Heigh(root.right);

        if (leftHeight == -1 || rightHeight == -1) return -1;

        if (Math.abs(leftHeight - rightHeight) > 1) return -1;

        return Math.max(leftHeight, rightHeight) + 1;

    }


}

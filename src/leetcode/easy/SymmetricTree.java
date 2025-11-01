package leetcode.easy;

public class SymmetricTree {
    public boolean isSymmetric(TreeNode root) {
        return rec(root.left, root.right);
    }

    public boolean rec(TreeNode leftSide, TreeNode rightSide) {

        if (leftSide == null && rightSide == null) return true;

        if (leftSide == null || rightSide == null) return false;

        return (leftSide.val == rightSide.val) && rec(leftSide.left, rightSide.right) && rec(leftSide.right, rightSide.left);

    }
}

package leetcode.medium;

public class LongestZigZagPathInABinaryTree {
    public static void main(String[] args) {

    }

    int max = 0;

    public int longestZigZag(TreeNode root) {

        if (root == null) return 0;

        helper(root.left, false, true, 1);
        helper(root.right, true, false, 1);

        return max;
    }

    public void helper(TreeNode root, boolean isRightDone, boolean isLeftDone, int counter) {

        if (root == null) return;
        max = Math.max(counter, max);

        if (isRightDone) {
            helper(root.left, false, true, counter + 1);
            helper(root.right, true, false, 1);
        } else if (isLeftDone) {
            helper(root.right, true, false, counter + 1);
            helper(root.left, false, true, 1);
        }
    }
}

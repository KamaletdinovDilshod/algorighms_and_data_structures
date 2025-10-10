package leetcode.easy;

public class MaximumDepthOfBinaryTree {
    public static void main(String[] args) {
        TreeNode n = new TreeNode(0);
        ListNode ln = new ListNode();
    }

    public int maxDepth(TreeNode root) {

        if (root == null) return -1;

        int lHeight = maxDepth(root.left);
        int rHeight = maxDepth(root.right);

        return Math.max(lHeight, rHeight) + 1;
    }
}

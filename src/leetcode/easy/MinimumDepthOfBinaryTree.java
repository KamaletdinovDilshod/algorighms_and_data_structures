package leetcode.easy;

public class MinimumDepthOfBinaryTree {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(12);
        root.right = new TreeNode(13);

        root.left.left = new TreeNode(7);
        root.left.right = new TreeNode(14);

        root.right.right = new TreeNode(2);

        root.left.left.left = new TreeNode(17);
        root.left.left.right = new TreeNode(23);

        root.left.right.left = new TreeNode(27);
        root.left.right.right = new TreeNode(3);

        root.right.right.left = new TreeNode(8);
        root.right.right.right = new TreeNode(11);

        minDepth(root);
    }

    public static int minDepth(TreeNode root) {

        return rec(root);
    }

    public static int rec(TreeNode root) {

        if (root == null) return 0;

        if (root.left == null && root.right == null) return 1;

        if (root.left == null) return rec(root.right) + 1;

        if (root.right == null) return rec(root.left) + 1;

        return Math.min(rec(root.left), minDepth(root.right)) + 1;
    }

}

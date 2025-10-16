package leetcode.medium;

public class LowestCommonAncestorOfABinaryTree {

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == p || root == q || root == null)
            return root;
        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);

        System.out.println("THIS IS LEFT: " + left.val);
        System.out.println("THIS IS RIGHT: " + right.val);
        if (left == null)
            return right;
        else if (right == null)
            return left;
        else
            return root;
    }
}

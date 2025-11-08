package leetcode.medium;

import com.sun.source.tree.Tree;

public class KthSmallestElementInABST {

    int count = 0;
    TreeNode res = null;


    public int kthSmallest(TreeNode root, int k) {
        helper(root, k);
        return res.val;
    }


    public void helper(TreeNode node, int k) {

        if (node == null) return;

        helper(node.left, k);
        count++;

        if (count == k) {
            res = node;
            return;
        }

        helper(node.right, k);
    }
}

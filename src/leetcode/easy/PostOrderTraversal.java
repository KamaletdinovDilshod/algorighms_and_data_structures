package leetcode.easy;

import java.util.ArrayList;
import java.util.List;

public class PostOrderTraversal {
    public static void main(String[] args) {

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.right = new TreeNode(6);

        postorderTraversal(root);
    }

    public static List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        helper(root, ans);
        return ans;
    }

    public static void helper(TreeNode node, List<Integer> l) {

        if (node == null) return;
        helper(node.left, l);
        helper(node.right, l);

        l.add(node.val);
    }
}

package leetcode.medium;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreeLevelOrderTraversal {
    public static void main(String[] args) {

    }

    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();

        rec(root, res, 0);
        return res;
    }

    public void rec(TreeNode root, List<List<Integer>> res, int level) {

        if (root == null) return;

        if (level >= res.size()) {
            res.add(new ArrayList<>());
        }

        res.get(level).add(root.val);

        System.out.println("THIS IS LEVEL: " + level);
        rec(root.left, res, level + 1);
        rec(root.right, res, level + 1);
    }
}

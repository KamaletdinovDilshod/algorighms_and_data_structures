package leetcode.medium;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreeRightSideView {
    public static void main(String[] args) {

    }

    public List<Integer> rightSideView(TreeNode root) {
        ArrayList<Integer> res = new ArrayList<>();
        rec(root, 0, res);
        return res;
    }

    public void rec(TreeNode root, int level, ArrayList<Integer> res) {
        if (root == null) return;
        if (res.size() <= level) res.add(root.val);
        rec(root.right, level + 1, res);
        rec(root.left, level + 1, res);
    }
}

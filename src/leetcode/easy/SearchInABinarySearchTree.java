package leetcode.easy;

public class SearchInABinarySearchTree {
    public static void main(String[] args) {

    }

    public TreeNode searchBST(TreeNode root, int val) {

        while (root != null) {
            if (root.val > val) root = root.left;
            else if (root.val < val) {
                root = root.right;
            } else return root;
        }

        return root;
    }
}

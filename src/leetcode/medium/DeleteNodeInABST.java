package leetcode.medium;

public class DeleteNodeInABST {
    public TreeNode deleteNode(TreeNode root, int key) {

        if (root == null) return root;

        if (root.val > key) {
            root.left = deleteNode(root.left, key);
        } else if (root.val < key) {
            root.right = deleteNode(root.right, key);
        } else {
            if (root.left == null) return root.right;
            if (root.right == null) return root.left;

            TreeNode succ = getSuccessor(root);
            root.val = succ.val;
            root.right = deleteNode(root.right, succ.val);
        }

        return root;
    }

    public TreeNode getSuccessor(TreeNode curr) {
        curr = curr.right;

        while (curr != null && curr.left != null) {
            curr = curr.left;
        }

        return curr;
    }

}

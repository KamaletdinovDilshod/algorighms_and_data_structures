package leetcode.easy;

import com.sun.source.tree.Tree;

public class SameTree {
    public static void main(String[] args) {

    }

    boolean ans = true;
    public boolean isSameTree(TreeNode p, TreeNode q) {
        helper(p,q);
        return ans;
    }

    public void helper(TreeNode p, TreeNode q) {
        if(p == null && q==null) return;

        if(p == null || q== null){
            ans = false;
            return;
        }

        if(p.val != q.val ){
            ans = false;
            return;
        }

        isSameTree( p.left,q.left);
        isSameTree( p.right,q.right);

    }
}

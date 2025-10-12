package cracking_the_coding_interview.treesandgraphs;

import java.util.ArrayList;
import java.util.LinkedList;

public class ListOfDepths {
    public static void main(String[] args) {

    }

    void createLevelLinkedList(
            TreeNode root,
            ArrayList<LinkedList<TreeNode>> lists,
            int level
    ) {
        if (root == null) return;
        LinkedList<TreeNode> list = null;

        if (lists.size() == level) {
            list = new LinkedList<TreeNode>();
            lists.add(list);
        } else {
            list = lists.get(level);
        }
        list.add(root);
        createLevelLinkedList(root.left, lists, level + 1);
        createLevelLinkedList(root.right, lists, level + 1);
    }
}

package leetcode.medium;

import java.util.ArrayList;

public class MaximumLevelSumOfABinaryTree {


    public static void main(String[] args) {


    }


    public int maxLevelSum(TreeNode root) {
        ArrayList<Integer> levelCounter = new ArrayList<>();
        int max = Integer.MIN_VALUE;
        int largestLevel = 0;

        rec(root, 0, levelCounter);

        System.out.println("THIS IS LEVEL COUNTER: " + levelCounter);
        for (int i = 0; i < levelCounter.size(); i++) {
            if (max < levelCounter.get(i)) {
                max = levelCounter.get(i);
                largestLevel = i + 1;
            }
        }

        return largestLevel;
    }

    public void rec(TreeNode root, int level, ArrayList<Integer> levelCounter) {
        if (root == null) return;

        if (levelCounter.size() <= level) levelCounter.add(0);

        levelCounter.set(level, levelCounter.get(level) + root.val);

        rec(root.left, level + 1, levelCounter);
        rec(root.right, level + 1, levelCounter);
    }
}

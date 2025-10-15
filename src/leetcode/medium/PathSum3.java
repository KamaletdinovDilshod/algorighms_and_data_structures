package leetcode.medium;

import com.sun.source.tree.Tree;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class PathSum3 {

    int counter = 0;

    public int pathSum(TreeNode root, int targetSum) {
        if (root == null) return 0;
        helper(root, 0L, targetSum);

        pathSum(root.left, targetSum);
        pathSum(root.right, targetSum);
        return counter;
    }

    private void helper(TreeNode root, long sum, int targetSum) {
        if (root == null) {
            return;
        }

        sum += root.val;
        if (sum == targetSum) counter++;
        helper(root.left, sum, targetSum);
        helper(root.right, sum, targetSum);
    }


    // solution 2

    private Map<Long, Integer> hmap;
    private int count;

    public int pathSum2(TreeNode root, int targetSum) {
        hmap = new HashMap<>();
        count = 0;

        dfs(root, 0, targetSum);
        return count;

    }

    private void dfs(TreeNode root, long prefixSum, int targetSum) {
        if (root == null) return;
        prefixSum += root.val;

        if (hmap.containsKey(prefixSum - targetSum)) count += hmap.get(prefixSum - targetSum);
        if (targetSum == prefixSum) count++;

        hmap.put(prefixSum, hmap.getOrDefault(prefixSum, 0) + 1);

        dfs(root.left, prefixSum, targetSum);
        dfs(root.right, prefixSum, targetSum);

        hmap.put(prefixSum, hmap.get(prefixSum) - 1);
    }
}

package leetcode.medium;

import java.util.ArrayList;
import java.util.List;

public class Subsets {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        System.out.println(subsets(nums));
    }

    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        bactracking(0, nums, new ArrayList<>(), ans);
        return ans;
    }

    public static void bactracking(int ind, int[] nums, List<Integer> list,
                                   List<List<Integer>> ans) {
        ans.add(new ArrayList<>(list));
        for (int i = ind; i < nums.length; i++) {
            list.add(nums[i]);
            bactracking(i + 1, nums, list, ans);
            list.remove(list.size() - 1);
        }
    }
}

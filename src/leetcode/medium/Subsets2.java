package leetcode.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Subsets2 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 2};
        System.out.println(subsetsWithDup(nums));
    }

    public static List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        bactracking(0, nums, new ArrayList<>(), ans);
        return ans;
    }

    public static void bactracking(int ind, int[] nums, List<Integer> list,
                                   List<List<Integer>> ans) {

        Arrays.sort(nums);
        ans.add(new ArrayList<>(list));
        for (int i = ind; i < nums.length; i++) {
            if (i > ind && nums[i] == nums[i - 1]) continue;
            list.add(nums[i]);
            bactracking(i + 1, nums, list, ans);
            list.remove(list.size() - 1);
        }
    }
}

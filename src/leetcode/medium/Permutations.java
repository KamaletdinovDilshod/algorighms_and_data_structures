package leetcode.medium;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Permutations {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        System.out.println(permute(nums));

    }

    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        bactracking(ans, new ArrayList<>(), nums, new HashSet<>());
        return ans;
    }

    private static void bactracking(List<List<Integer>> ans, ArrayList<Integer> temp,
                                    int[] nums, HashSet<Integer> seen) {
        if (temp.size() == nums.length) {
            ans.add(new ArrayList<>(temp));
        } else {
            for (int num : nums) {
                System.out.println(temp);
                if (!seen.contains(num)) {
                    seen.add(num);
                    temp.add(num);
                    bactracking(ans, temp, nums, seen);
                    seen.remove(num);
                    temp.remove(temp.size() - 1);
                }
            }
        }
    }
}
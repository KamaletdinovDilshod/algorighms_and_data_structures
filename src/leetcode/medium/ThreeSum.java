package leetcode.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    public static void main(String[] args) {
        int[] nums = {0, 0, 0, 0, 0, 0, 0, 0};
        System.out.println(threeSum(nums));
    }

    public static List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        for (int i = 0; i < nums.length - 2; i++) {
            int start = i + 1;
            int end = nums.length - 1;
            int currSum;
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            while (start < end) {
                currSum = nums[i] + nums[start] + nums[end];
                if (currSum > 0) {
                    end--;
                } else if (currSum < 0) {
                    start++;
                } else {
                    ans.add(List.of(nums[i], nums[start++], nums[end--]));
                    while (start < end && nums[end] == nums[end + 1]) {
                        end--;
                    }
                }
            }

        }
        return ans;
    }

//            Arrays.sort(nums);
//    HashSet<ArrayList<Integer>> res = new HashSet<>();
//        for (int i = 0; i < nums.length; i++) {
//        int target = 0 - nums[i];
//        int j = i + 1;
//        int k = nums.length - 1;
//        while (j < k)
//        {
//            if (nums[j] + nums[k] == target)
//            {
//                ArrayList<Integer> list = new ArrayList<>();
//                list.add(nums[i]);
//                list.add(nums[j]);
//                list.add(nums[k]);
//                res.add(list);
//                j++;
//                k--;
//            } else if (nums[j] + nums[k] > target)
//            {
//                k--;
//            } else {
//                j++;
//            }
//        }
//    }
//        return new ArrayList<>(res);
}

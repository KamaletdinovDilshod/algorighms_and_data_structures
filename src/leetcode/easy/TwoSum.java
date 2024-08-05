package leetcode.easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class TwoSum {
    public static void main(String[] args) {
//        int[] input = {3, 2, 4};
//        int[] input2 = {2, 7, 11, 15};
        int[] input3 = {3, 3};
//        System.out.println(Arrays.toString(twoSum(input2, 9)));
//        System.out.println(Arrays.toString(twoSum(input, 6)));
        System.out.println(Arrays.toString(twoSum(input3, 6)));

    }

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> Map = new HashMap<>();
        int[] Arr = new int[2];
        for (int i = 0; i < nums.length; i++) {
            if (Map.containsKey(target - nums[i])) {
                Arr[0] = i;
                Arr[1] = Map.get(target - nums[i]);
                return Arr;
            }
            Map.put(nums[i], i);

            }
            return Arr;
        }
    }



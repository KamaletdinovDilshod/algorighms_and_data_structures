package leetcode.medium;

import java.util.Arrays;
import java.util.HashMap;

public class MaxNumberOfKSumPairs {
    public static void main(String[] args) {
        int[] a = {3, 1, 3, 4, 3};
        System.out.println(maxOperations(a, 6));
    }

    public static int maxOperations(int[] nums, int k) {
        Arrays.sort(nums);

        int i = 0;
        int j = nums.length - 1;
        int counter = 0;

        while (i < j) {
            if (nums[i] + nums[j] == k) {
                counter++;
                i++;
                j--;
            } else if (nums[i] + nums[j] < k) i++;
            else j--;
        }

        return counter;
    }

    // Solution 2
    public static int maxOperations2(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();

        int count = 0;
        //to check if that k-nums[i] present and had some value left or already paired

        for (int num : nums) {
            if (map.containsKey(k - num) && map.get(k - num) > 0) {
                count++;
                map.put(k - num, map.get(k - num) - 1);
            } else {
                //getOrDefault is easy way it directly checks if value is 0 returns 0 where I added 1
                //and if some value is present then it return that value "similar to map.get(i)" and I added 1 on it
                map.put(num, map.getOrDefault(num, 0) + 1);
            }
        }
        return count;
    }
}

package neetcode;

import java.util.*;

public class TopKElementsInList {
    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 2, 3, 3, 3};
        int[] nums2 = new int[]{1, 2, 2, 3, 3, 3, 4, 4};
        int k = 2;
        System.out.println(Arrays.toString(topKFrequent(nums, k)));
        System.out.println(Arrays.toString(topKFrequent(nums2, k)));
        System.out.println(Arrays.toString(topKFrequent2(nums, k)));
        System.out.println(Arrays.toString(topKFrequent2(nums2, k)));
    }


    // Solution 1 using bucket sort
    public static int[] topKFrequent(int[] nums, int k) {

        HashMap<Integer, Integer> count = new HashMap<>();
        List<Integer>[] freq = new List[nums.length + 1];

        for (int i = 0; i < nums.length + 1; i++) {
            freq[i] = new ArrayList<>();
        }
        for (int num : nums) {
            count.put(num, count.getOrDefault(num, 0) + 1);
        }

        for (int key : count.keySet()) {
            freq[count.get(key)].add(key);
        }

        int[] res = new int[k];
        int index = 0;
        for (int i = freq.length - 1; i >= 0; i--) {
            for (int num : freq[i]) {
                res[index++] = num;
                if (index == k) return res;
            }
        }
        return res;
    }

    // Solution 2 using heap (time Complexity (O(n) + O(klogn) + O(klogn))

    public static int[] topKFrequent2(int[] nums, int k) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int num : nums) {
            hm.put(num, hm.getOrDefault(num, 0) + 1);
        }

        Queue<Integer> heap = new PriorityQueue<>((a, b) -> hm.get(b) - hm.get(a));
        for (int key : hm.keySet()) {
            heap.add(key);
        }

        int[] ans = new int[k];
        for (int i = 0; i < k; i++) {
            ans[i] = heap.poll();
        }
        return ans;
    }
}

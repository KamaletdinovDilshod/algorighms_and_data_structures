package leetcode.easy;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class MergeSortedArray {
    public static void main(String[] args) {
        int[] nums1 = {2, 0};
        int[] nums2 = {1};
        int m = 1;
        int n = 1;
        System.out.println(Arrays.toString(merge(nums1, m, nums2, n)));
    }

    public static int[] merge(int[] nums1, int m, int[] nums2, int n) {
//       int i = m + n - 1;
//       m--;
//       n--;
//       while(i >= 0) {
//           if (m >= 0 && n >=0) nums1[i--] = (nums1[m] >= nums2[n]) ? nums1[m--] : nums2[n--];
//           else if (m >= 0) nums1[i--] = nums1[m--];
//           else if (n >= 0) nums1[i--] = nums2[n--];
//       }
        if (n == 0) return nums1;
        Queue<Integer> queue = new LinkedList<>();
        int i = 0;
        int j = 0;
        for (int q = 0; q < m; q++) {
            queue.add(nums1[q]);
        }
        while (i < nums1.length) {
            if ( !queue.isEmpty() && j < n && queue.peek() <= nums2[j]) {
                nums1[i] = queue.poll();
            } else if (j < n){
                nums1[i] = nums2[j];
                j++;
            } else if (!queue.isEmpty()){
                nums1[i] = queue.poll();
            }
            i++;
        }
        return nums1;
    }
}

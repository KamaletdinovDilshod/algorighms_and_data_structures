package neetcode.linkedlist;

public class FindDuplicateInteger {
    public static void main(String[] args) {
        System.out.println(findDuplicate(new int[]{1, 2, 3, 2, 2}));
    }

    // Solution 1 time O(n ^ 2)
    public static int findDuplicate(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) return nums[i];
            }
        }
        return -1;
    }

    // Solution 2 time (On) Floyd's algorithm
    public static int findDuplicate2(int[] nums) {
        int slow = 0;
        int fast = 0;

        do {
            slow = nums[slow];
            fast = nums[nums[fast]];
        } while (slow != fast);

        int slow2 = 0;
        while (true) {
            slow = nums[slow];
            slow2 = nums[slow2];
            if (slow == slow2) {
                return slow;
            }
        }
    }
}

package leetcode.easy;



class MajorityElement {
    public static void main(String[] args) {
        int[] nums = {3, 2, 3};
        int[] nums2 = {2, 2, 1, 1, 1, 2, 2};
        System.out.println(majorityElement(nums));
        System.out.println(majorityElement(nums2));
    }
    public static int majorityElement(int[] nums) {
//        HashMap<Integer, Integer> map = new HashMap<>();
//        for (int i = 0; i < nums.length; i++) {
//            if (map.containsKey(nums[i])) {
//                map.put(nums[i], map.get(nums[i]) + 1);
//            } else {
//                map.put(nums[i], 1);
//            }
//            if (map.get(nums[i]) > nums.length / 2) return nums[i];
//        }
//        return 0;
        int elem = 0;
        int cnt = 0;
        for (int num : nums) {
            if (cnt == 0) {
                elem = num;
            }
            if (elem == num) {
                cnt++;
            } else {
                cnt--;
            }
        }
        return elem;
    }
}

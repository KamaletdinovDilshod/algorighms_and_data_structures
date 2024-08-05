package leetcode.easy;



public class SingleNumber {
    public static void main(String[] args) {
        int[] arr = {2, 2, 1};
        int[] arr2 = {4, 1, 2, 1, 2};
        int[] arr3 = {2, 4, 7, 9, 2, 4};
        System.out.println(singleNumber(arr));
        System.out.println(singleNumber(arr2));
        System.out.println(singleNumber(arr3));


    }

    public static int singleNumber(int[] nums) {
        int result = 0;
        for (int i : nums) {
            result ^= i;
        }
        return result;
    }

}

//        TreeMap<Integer, Integer> map = new TreeMap<>();
//        int n = nums.length;
//        for (int i = 0; i < n; i++) {
//            if (map.containsKey(nums[i]))
//                map.remove(nums[i]);
//            else
//                map.put(nums[i], 1);
//        }
//        return map.firstKey();



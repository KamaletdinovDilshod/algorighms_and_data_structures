package leetcode.easy;

import java.util.HashMap;
import java.util.HashSet;

public class UniqueNumberOfOccurences {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 1, 1, 3};
        System.out.println(uniqueOccurrences(arr));
    }

    public static boolean uniqueOccurrences(int[] arr) {

        HashMap<Integer, Integer> hm = new HashMap<>();
        HashSet<Integer> hs = new HashSet<>();

        for (int num : arr) {
            hm.put(num, hm.getOrDefault(num, 0) + 1);
        }

        for (int num : hm.values()) {
            if (hs.contains(num)) {
                return false;
            } else {
                hs.add(num);
            }
        }
        return true;
    }

}

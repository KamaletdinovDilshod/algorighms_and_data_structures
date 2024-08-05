package leetcode.medium;

import java.util.HashSet;
import java.util.Set;
public class LongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {
        String s = " ";
        System.out.println(lengthOfLongestSubstring(s));
    }
    public static int lengthOfLongestSubstring(String s) {
        Set<Character> seen = new HashSet<>();
        int start = 0, end = 0;
        int maXLength = 0;
        while (start < s.length() && end < s.length()) {
            if (!seen.contains(s.charAt(end))) {
                seen.add(s.charAt(end));
                end++;
                maXLength = Math.max(maXLength, end - start);
            } else {
                seen.remove(s.charAt(start));
                start++;
            }
        }
        return maXLength;


//        Set<Character> set = new HashSet<>();
//        int counter = 0;
//        int maincount = 0;
//        if (s.length() == 1) return 1;
//        for (int k = 0; k < s.length(); k++) {
//            for (int i = k; i < s.length(); i++) {
//                if (set.contains(s.charAt(i))) {
//                    if (maincount < counter) maincount = counter;
//                    counter = 0;
//                    set.clear();
//                    break;
//                } else {
//                    set.add(s.charAt(i));
//                    counter++;
//                }
//            }
//        }
//        return maincount;
    }
}

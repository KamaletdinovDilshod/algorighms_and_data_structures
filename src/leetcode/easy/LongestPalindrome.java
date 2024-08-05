package leetcode.easy;


public class LongestPalindrome {
    public static void main(String[] args) {
        System.out.println(longestPalindrome("bananas"));
//        System.out.println(longestPalindrome("bananas".toUpperCase()));
    }

    public static int longestPalindrome(String s) {
//        if (s.length() == 1) return 1;
//        HashMap<Character, Integer> map = new HashMap<>();
//        for (int i = 0; i < s.length(); i++) {
//            if (map.containsKey(s.charAt(i))) {
//                map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
//            } else {
//                map.put(s.charAt(i), 1);
//            }
//        }
//        int length = 0;
//        int oneodd = 0;
//        HashSet<Character> set = new HashSet<>(map.keySet());
//        for (char ch : set){
//            if (map.get(ch) % 2 == 0){
//                length += map.get(ch);
//                map.remove(ch);
//            } else if (oneodd == 0 && map.get(ch) %2 != 0){
//                length += map.get(ch);
//                oneodd = 1;
//            } else {
//                length += map.get(ch) - 1;
//            }
//        }
//        return length;
        int[] count = new int[128];
        for (char c: s.toCharArray())
            count[c]++;

        int ans = 0;
        for (int v: count) {
            ans += v / 2 * 2;
            if (ans % 2 == 0 && v % 2 == 1)
                ans++;
        }
        return ans;
    }
}
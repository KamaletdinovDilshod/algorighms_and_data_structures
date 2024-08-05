package leetcode.easy;

public class FindTheDifference {
    public static void main(String[] args) {
        String s = "abcd", t = "abcde";
        System.out.println(findTheDifference(s, t));
        findTheDifference(s, t);
    }

    public static char findTheDifference(String s, String t) {
//        HashMap<Character, Integer> hm = new HashMap<>();
//        for (char ch : t.toCharArray()){
//            hm.put(ch, hm.getOrDefault(ch, 0) + 1);
//        }
//        for (char ch2 : s.toCharArray()){
//            hm.put(ch2, hm.getOrDefault(ch2, 0) - 1);
//        }
//        for (char ch3 : hm.keySet()){
//            if (hm.get(ch3) != 0) return ch3;
//        }
//        return ' ';

        // using Bit manipulation
        char c = 0;
        for (char ch : s.toCharArray()) {
            c ^= ch;
        }
        for (char ch2 : t.toCharArray()) {
            c ^= ch2;
        }
        return c;
    }
}

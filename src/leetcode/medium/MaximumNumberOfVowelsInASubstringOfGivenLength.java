package leetcode.medium;

import java.util.HashSet;

public class MaximumNumberOfVowelsInASubstringOfGivenLength {
    public static void main(String[] args) {

        String s = "weallloveyou";
        System.out.println(maxVowels(s, 7));

    }

    public static int maxVowels(String s, int k) {

        int ans = 0;
        int vowels = 0;

        HashSet<Character> hs = new HashSet<>();
        hs.add('a');
        hs.add('e');
        hs.add('i');
        hs.add('o');
        hs.add('u');

        for (int i = 0; i < s.length(); i++) {
            if (i >= k) {
                if (hs.contains(s.charAt(i - k))) vowels--;
            }
            if (hs.contains(s.charAt(i))) vowels++;
            ans = Math.max(vowels, ans);
        }

        return ans;
    }
}

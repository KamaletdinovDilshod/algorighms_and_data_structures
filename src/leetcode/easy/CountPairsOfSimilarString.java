package leetcode.easy;

import java.util.HashSet;

public class CountPairsOfSimilarString {
    public static int similarPairs(String[] words) {
        int count = 0;
        for (int i = 0; i < words.length-1; i++){
            for (int j = i+1; j < words.length; j++){
                count += check(words[i], words[j]);
            }
        }
        return count;
    }
    public static int check(String word1, String word2){
        HashSet<Character> s1 = new HashSet<>();
        for (char c1: word1.toCharArray()) s1.add(c1);
        HashSet<Character> s2 = new HashSet<>();
        for (char c: word2.toCharArray()) s2.add(c);
        return s1.equals(s2) ? 1 : 0;
    }
    public static void main(String[] args) {
        String[] words = {"aba","aabb","abcd","bac","aabc"};
        System.out.println((similarPairs(words)));
    }
}

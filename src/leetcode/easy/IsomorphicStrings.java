package leetcode.easy;

import java.util.HashMap;
import java.util.Map;

public class IsomorphicStrings {
    public static void main(String[] args) {
        String s = "paper";
        String t = "title";
        String s2 = "badc";
        String t2 = "baba";
        System.out.println(isIsomorphic(s, t));
        System.out.println(isIsomorphic(s2, t2));
    }

    private static String transformString(String s) {
        Map<Character, Integer> indexMapping = new HashMap<>();
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < s.length(); i++){
            char c = s.charAt(i);

            if (!indexMapping.containsKey(c)){
                indexMapping.put(c, i);
            }
            builder.append(indexMapping.get(c));
            builder.append(" ");
        }
        return builder.toString();
    }

    public static boolean isIsomorphic(String s, String t) {
        return transformString(s).equals(transformString(t));
    }
}


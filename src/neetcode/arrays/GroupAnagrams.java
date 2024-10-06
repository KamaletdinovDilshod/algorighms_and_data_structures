package neetcode.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAnagrams {
    public static void main(String[] args) {
        System.out.println(groupAnagrams(new String[]{"act", "pots", "tops", "cat", "stop", "hat"}));
    }

    // Solution 1
    public static List<List<String>> groupAnagrams(String[] strs) {
        // Create a HashMap to store the anagram groups
        HashMap<String, List<String>> hm = new HashMap<>();

        // Iterate over each string in the input array
        for (String str : strs) {
            // Convert the string to a char array, sort it, and convert back to string
            char[] charArray = str.toCharArray();
            Arrays.sort(charArray);
            String sortedStr = new String(charArray);  // The key for anagrams
            if (hm.containsKey(sortedStr)) {
                hm.get(sortedStr).add(str);
            } else {
                hm.put(sortedStr, new ArrayList<>(List.of(str)));
            }
        }

        return new ArrayList<>(hm.values());
    }
}

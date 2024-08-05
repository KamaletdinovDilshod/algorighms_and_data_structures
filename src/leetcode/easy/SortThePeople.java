package leetcode.easy;

import java.util.Arrays;
import java.util.HashMap;

public class SortThePeople {
    public static String[] sortPeople(String[] names, int[] heights) {
        HashMap <Integer, String> hm = new HashMap<>();
        for (int i = 0; i< names.length; i++) {
            hm.put(heights[i], names[i]);
        }
        Arrays.sort(heights);
        int j = 0;
        for (int i = names.length-1; i >= 0; i--){
            names[j] = hm.get(heights[i]);
            j++;
        }
        return names;
    }
    public static void main(String[] args) {
        String[] names = {"Mary", "John", "Emma"};
        int[] heights = {180, 165, 170};
        System.out.println(Arrays.toString(sortPeople(names, heights)));
    }
}

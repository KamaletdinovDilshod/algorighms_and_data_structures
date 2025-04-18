package leetcode.easy;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] str = {"flower", "flow", "flight"};
        System.out.println(longestCommonPrefix(str));
    }

    public static String longestCommonPrefix(String[] strs) {
if (strs.length == 0) return "";
String prefix = strs[0];
        for (String str : strs)
            while (str.indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) return "";
            }
return prefix;
    }
}
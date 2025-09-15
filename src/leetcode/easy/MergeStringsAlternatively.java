package leetcode.easy;

public class MergeStringsAlternatively {
    public static void main(String[] args) {
        System.out.println(mergeAlternately("abc", "pqr"));
    }

    public static String mergeAlternately(String word1, String word2) {

        int w1 = 0;
        int w2 = 0;
        StringBuilder sb = new StringBuilder();

        while (w1 < word1.length() || w2 < word2.length()) {
            if (w1 < word1.length()) {
                sb.append(word1.charAt(w1));
                w1++;
            }

            if (w2 < word2.length()) {
                sb.append(word2.charAt(w2));
                w2++;
            }
        }
        return sb.toString();
    }


}

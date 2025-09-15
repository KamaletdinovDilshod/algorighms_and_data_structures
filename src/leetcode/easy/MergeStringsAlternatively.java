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


    // Solution 3

    public String mergeAlternately2(String word1, String word2) {
        StringBuilder sb = new StringBuilder(word1.length() + word2.length());
        int n = Math.max(word1.length(), word2.length());

        for (int i = 0; i < n; i++) {
            if (i < word1.length()) {
                sb.append(word1.charAt(i));
            }
            if (i < word2.length()) {
                sb.append(word2.charAt(i));
            }
        }

        return sb.toString();
    }

}

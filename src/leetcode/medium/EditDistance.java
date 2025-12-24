package leetcode.medium;

public class EditDistance {
    public static void main(String[] args) {
        System.out.println(minDistance("horse", "rose"));
    }

    public static int minDistance(String word1, String word2) {

        int[][] dpt = new int[word2.length() + 1][word1.length() + 1];

        for (int i = 0; i <= word2.length(); i++) {
            dpt[i][0] = i;
        }

        for (int i = 0; i <= word1.length(); i++) {
            dpt[0][i] = i;
        }

        for (int i = 0; i < word2.length(); i++) {
            for (int j = 0; j < word1.length(); j++) {
                if (word2.charAt(i) == word1.charAt(j)) {
                    dpt[i + 1][j + 1] = dpt[i][j];
                } else {
                    dpt[i + 1][j + 1] = 1 + Math.min(dpt[i][j], Math.min(dpt[i + 1][j], dpt[i][j + 1]));
                }
            }
        }

        return dpt[word2.length()][word1.length()];
    }
}

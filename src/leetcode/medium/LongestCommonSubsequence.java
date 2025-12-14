package leetcode.medium;

public class LongestCommonSubsequence {
    public static void main(String[] args) {
        String text1 = "pmjghexybyrgzczy";
        String text2 = "hafcdqbgncrcbihkd";
//        System.out.println(longestCommonSubsequence(text1, text2));
        System.out.println(longestCommonSubsequence2(text1, text2));
    }

//    public static int longestCommonSubsequence(String text1, String text2) {
//        return LCS(0, 0, text1, text2);
//    }
//
//    public static int LCS(int text1Index, int text2Index, String text1, String text2) {
//        if (text1Index >= text1.length() || text2Index >= text2.length()) {
//            return 0;
//        } else if (text1.charAt(text1Index) == text2.charAt(text2Index)) {
//            return 1 + LCS(text1Index + 1, text2Index + 1, text1, text2);
//        } else {
//            return Math.max(LCS(text1Index + 1, text2Index, text1, text2), LCS(text1Index, text2Index + 1, text1, text2));
//        }
//    }

    public static int longestCommonSubsequence2(String text1, String text2) {
        int[][] dp = new int[text1.length() + 1][text2.length() + 1];
        for (int i = 0; i < text1.length(); i++) {
            for (int j = 0; j < text2.length(); j++) {
                if (text1.charAt(i) == text2.charAt(j)) dp[i + 1][j + 1] = 1 + dp[i][j];
                else dp[i + 1][j + 1] = Math.max(dp[i][j + 1], dp[i + 1][j]);
            }
        }

        return dp[text1.length()][text2.length()];
    }
}

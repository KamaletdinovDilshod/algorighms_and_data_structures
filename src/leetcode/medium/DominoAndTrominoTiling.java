package leetcode.medium;

public class DominoAndTrominoTiling {
    public static void main(String[] args) {

        System.out.println(numTilings(3));
        System.out.println(numTilings(4));
        System.out.println(numTilings(5));

    }

    public static int numTilings(int n) {

        long[] dp = new long[n + 3];
        dp[0] = 1;
        dp[1] = 2;
        dp[2] = 5;

        for (int i = 3; i < n; i++) {
            dp[i] = (2 * dp[i - 1] + dp[i - 3]) % 1000000007;
        }

        return (int) dp[n - 1];
    }

    /*
    dp[i] denotes the number of ways to tile an 2 * (i + 1) board, note that dp is 0-indexed.
    Intuitively, dp[0] = 1 and dp[1] = 2
    dpa[i] denotes the number of ways to tile an 2 * i board and 1 more square left below(or above symmetrically).
    Intuitively, dpa[0] = 0 and dpa[1] = 1
    I just explained the case where in i-th column, 2nd row is filled.
    But it should be noted that the two cases(the other is in i-th column, 1st row is filled)
    are symmetric and the numbers are both dpa[i], you may imagine dpb[i] = dpa[i] for the second case where i-th column 1st row is filled.


    dp[i] = dp[i - 1] + dp[i - 2] + 2dpa[i-1]
    dp[i - 1] = dp[i - 2] + dp[i - 3] + 2dpa[i - 2]


    dp[i] - dp[i - 1] = dp[i - 1] - dp[i - 3] + 2(dpa[i - 1] - dpa[i - 2])

    dp[i] - dp[i - 1] = dp[i - 1] - dp[i - 3] + 2 * dp[i - 3]


    dp[i] = 2 * dp[i - 1] + dp[i - 3]

    dpa[i] - dpa[i - 1] = dp[i - 2]
    dp[i - 1] - dpa[i - 2] = dp[i - 3]
     */
}

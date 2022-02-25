import java.util.*;

public class LCS {

    // RECURSIVE

    public static int LCS_rec_helper(String x, String y, int m, int n) {
        if (n == 0 || m == 0) {
            return 0;
        }
        if (x.charAt(m - 1) == y.charAt(n - 1)) {
            return 1 + LCS_rec_helper(x, y, m - 1, n - 1);
        } else {
            return Math.max(LCS_rec_helper(x, y, m, n - 1), LCS_rec_helper(x, y, m - 1, n));
        }
    }

    public static int LCS_rec(String x, String y) {
        return LCS_rec_helper(x, y, x.length(), y.length());
    }

    // MEMOIZATION

    public static int[][] t = new int[1001][1001];

    public static int LCS_memo_helper(String x, String y, int m, int n) {
        if (m == 0 || n == 0) {
            return 0;
        }

        if (t[m][n] != -1) {
            return t[m][n];
        }

        if (x.charAt(m - 1) == y.charAt(n - 1)) {
            return t[m][n] = 1 + LCS_memo_helper(x, y, m - 1, n - 1);
        } else {
            return t[m][n] = Math.max(LCS_memo_helper(x, y, m, n - 1), LCS_memo_helper(x, y, m - 1, n));
        }

    }

    public static int LCS_memo(String x, String y) {
        for (int i = 0; i < t.length; i++) {
            Arrays.fill(t[i], -1);
        }
        return LCS_memo_helper(x, y, x.length(), y.length());
    }

    public static int LCS_tab(String x, String y) {
        int m = x.length();
        int n = y.length();
        int[][] dp = new int[m + 1][n + 1];

        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                if (i == 0 || j == 0) {
                    dp[i][j] = 0;
                }
            }
        }

        for (int i = 1; i < dp.length; i++) {
            for (int j = 1; j < dp[0].length; j++) {
                if (x.charAt(i - 1) == y.charAt(j - 1)) {
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }

            }
        }
        return dp[m][n];
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String x = scn.next();
        String y = scn.next();
        int res = LCS_rec(x, y);
        System.out.println(res);
        int res2 = LCS_memo(x, y);
        System.out.println(res2);
        int res3 = LCS_tab(x, y);
        System.out.println(res3);
    }
}

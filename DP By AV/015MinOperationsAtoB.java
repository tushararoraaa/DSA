import java.util.*;

public class MinOperationsAtoB {

    public static int operations(String a, String b) {
        int m = a.length();
        int n = b.length();

        int[][] dp = new int[m + 1][n + 1];
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                if (i == 0 || j == 0) {
                    dp[i][j] = 0;
                } else {
                    if (a.charAt(i - 1) == b.charAt(j - 1)) {
                        dp[i][j] = 1 + dp[i - 1][j - 1];
                    } else {
                        dp[i][j] = Math.max(dp[i][j - 1], dp[i - 1][j]);
                    }
                }
            }
        }

        int LCS_len = dp[m][n];

        int insertions = a.length() - LCS_len;
        int deletions = b.length() - LCS_len;

        return insertions + deletions;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String a = scn.next();
        String b = scn.next();

        int res = operations(a, b);
        System.out.println(res);
    }
}

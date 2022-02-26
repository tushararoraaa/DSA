import java.util.*;

public class MinDeletionInsertionForPalindrome {

    public static int operations(String a) {
        String b = "";
        for (int i = a.length() - 1; i >= 0; i--) {
            b += a.charAt(i);
        }
        if (a.equals(b)) {
            return 0;
        }

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
        int lcs = dp[m][n];

        return m - lcs;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String a = scn.next();

        int res = operations(a);
        System.out.println(res);
    }
}

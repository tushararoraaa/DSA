import java.util.*;

public class Solution {

    public static int longestCommonSubstr(String a, String b, int n, int m) {
        int[][] dp = new int[n + 1][m + 1];
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                if (i == 0 || j == 0) {
                    dp[i][j] = 0;
                }
            }
        }

        for (int i = 1; i < dp.length; i++) {
            for (int j = 1; j < dp[0].length; j++) {
                if (a.charAt(i - 1) == b.charAt(j - 1)) {
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                } else {
                    dp[i][j] = 0;
                }
            }
        }

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                max = Math.max(max, dp[i][j]);
            }
        }
        return max;

    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String x = scn.next();
        String y = scn.next();
        int res = longestCommonSubstr(x, y, x.length(), y.length());
        System.out.println(res);
    }
}
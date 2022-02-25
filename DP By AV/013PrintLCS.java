import java.util.*;

public class Main {

    public static ArrayList<String> res = new ArrayList<>();

    public static void LCS_rec_helper(String x, String y, int m, int n, String ans) {
        if (n == 0 || m == 0) {
            res.add(ans);
            return;
        }
        if (x.charAt(m - 1) == y.charAt(n - 1)) {
            LCS_rec_helper(x, y, m - 1, n - 1, x.charAt(m - 1) + ans);
        } else {
            LCS_rec_helper(x, y, m, n - 1, ans);
            LCS_rec_helper(x, y, m - 1, n, ans);
        }
    }

    public static String LCS_tab(String x, String y) {
        int m = x.length();
        int n = y.length();
        String[][] dp = new String[m + 1][n + 1];

        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                if (i == 0 || j == 0) {
                    dp[i][j] = "";
                }
            }
        }

        for (int i = 1; i < dp.length; i++) {
            for (int j = 1; j < dp[0].length; j++) {
                if (x.charAt(i - 1) == y.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + x.charAt(i - 1);
                } else {
                    String a = dp[i - 1][j];
                    String b = dp[i][j - 1];
                    if (a.length() >= b.length()) {
                        dp[i][j] = a;
                    } else {
                        dp[i][j] = b;
                    }
                }

            }
        }
        return dp[m][n];
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String x = scn.next();
        String y = scn.next();
        LCS_rec_helper(x, y, x.length(), y.length(), "");
        int max = Integer.MIN_VALUE;
        int maxIdx = -1;
        for (int i = 0; i < res.size(); i++) {
            if (res.get(i).length() > max) {
                max = res.get(i).length();
                maxIdx = i;
            }
        }
        System.out.println(res.get(maxIdx));

        String ans = LCS_tab(x, y);
        System.out.println(ans);

    }
}

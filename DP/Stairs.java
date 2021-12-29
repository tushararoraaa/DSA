import java.util.Scanner;

public class Stairs {

    public static int climb(int n, int count) { // BASIC RECURSION
        if (n == 0) {
            return count + 1;
        }

        if (n - 1 >= 0) {
            count = climb(n - 1, count);

        }
        if (n - 2 >= 0) {
            count = climb(n - 2, count);

        }
        if (n - 3 >= 0) {
            count = climb(n - 3, count);

        }

        return count;
    }

    public static int climb_memoized(int n, int[] qb) { // MEMOIZATION

        if (n == 0) {
            return 1;
        } else if (n < 0) {
            return 0;
        }

        if (qb[n] != 0) {
            return qb[n];
        }

        int cnt1 = climb_memoized(n - 1, qb);
        int cnt2 = climb_memoized(n - 2, qb);
        int cnt3 = climb_memoized(n - 3, qb);
        int cntFinal = cnt1 + cnt2 + cnt3;

        qb[n] = cntFinal;

        return cntFinal;

    }

    public static int climb_tabular(int n) { // DP
        int[] dp = new int[n + 1];
        dp[0] = 1;

        for (int i = 1; i <= n; i++) {
            if (i == 1) {
                dp[i] = dp[i - 1];
            } else if (i == 2) {
                dp[i] = dp[i - 1] + dp[i - 2];
            } else {
                dp[i] = dp[i - 1] + dp[i - 2] + dp[i - 3];
            }
        }
        return dp[n];
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int time1i = (int) System.currentTimeMillis();
        int res = climb(n, 0);
        int time1f = (int) System.currentTimeMillis();
        System.out.println(res);
        System.out.println("Time of recursion = " + (time1f - time1i));

        int time2i = (int) System.currentTimeMillis();
        int res1 = climb_memoized(n, new int[n + 1]);
        int time2f = (int) System.currentTimeMillis();
        System.out.println(res1);
        System.out.println("Time of memoization = " + (time2f - time2i));

        int time3i = (int) System.currentTimeMillis();
        int resDP = climb_tabular(n);
        int time3f = (int) System.currentTimeMillis();
        System.out.println(resDP);
        System.out.println("Time of DP = " + (time3f - time3i));
    }
}

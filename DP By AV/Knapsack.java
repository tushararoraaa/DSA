import java.util.Scanner;

public class Knapsack {

    public static int knapsack(int[] wt, int[] val, int W, int n) {
        if (n == 0 || W == 0) {
            return 0;
        }
        if (wt[n - 1] <= W) {
            return Math.max(val[n - 1] + knapsack(wt, val, W - wt[n - 1], n - 1), knapsack(wt, val, W, n - 1));
        } else if (wt[n - 1] > W) {
            return knapsack(wt, val, W, n - 1);
        }
        return 0;
    }

    static int[][] t = new int[102][1002];

    public static int knapsack_memoized(int[] wt, int[] val, int W, int n) {
        if (n == 0 || W == 0) {
            return 0;
        }
        if (t[n][W] != 0) {
            return t[n][W];
        }
        if (wt[n - 1] <= W) {
            t[n][W] = Math.max(val[n - 1] + knapsack_memoized(wt, val, W - wt[n - 1], n - 1),
                    knapsack_memoized(wt, val, W, n - 1));
            return t[n][W];
        } else if (wt[n - 1] > W) {

            return t[n][W] = knapsack_memoized(wt, val, W, n - 1);
        }
        return 0;
    }

    public static int knapsack_bottomup(int[] wt, int[] val, int W, int n) {
        int[][] t1 = new int[n + 1][W + 1];
        for (int i = 0; i < n + 1; i++) {
            for (int j = 0; j < W + 1; j++) {
                if (i == 0 || j == 0) {
                    t1[i][j] = 0;
                } else if (wt[i - 1] <= j) {
                    t1[i][j] = Math.max(val[i - 1] + t1[i - 1][j - wt[i - 1]], t1[i - 1][j]);
                } else {
                    t1[i][j] = t1[i - 1][j];
                }
            }
        }
        return t1[n][W];
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter no. of items");
        int n = scn.nextInt();
        int[] wt = new int[n];
        System.out.println("Enter weight of items");

        for (int i = 0; i < wt.length; i++) {
            wt[i] = scn.nextInt();
        }
        int[] val = new int[n];
        System.out.println("Enter profit of items");
        for (int i = 0; i < val.length; i++) {
            val[i] = scn.nextInt();
        }
        System.out.println("Enter Capacity(W) of Knapsack");
        int W = scn.nextInt();
        System.out.print("Max Profit = ");
        System.out.println(knapsack(wt, val, W, n));
        System.out.print("Max Profit = ");
        System.out.println(knapsack_memoized(wt, val, W, n));
        System.out.print("Max Profit = ");
        System.out.println(knapsack_bottomup(wt, val, W, n));
    }
}

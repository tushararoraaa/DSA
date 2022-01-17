import java.util.Scanner;

public class UnboundedKnapsack {

    public static int Knapsack(int[] wt, int[] val, int W) {
        int[][] t = new int[wt.length + 1][W + 1];
        for (int i = 0; i < t.length; i++) {
            for (int j = 0; j < t[0].length; j++) {
                if (i == 0 || j == 0) {
                    t[i][j] = 0;
                } else if (wt[i - 1] <= j) {
                    t[i][j] = Math.max(val[i - 1] + t[i][j - wt[i - 1]], t[i - 1][j]);
                } else {
                    t[i][j] = t[i - 1][j];
                }
            }
        }
        return t[wt.length][W];
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] wt = new int[n];
        for (int i = 0; i < wt.length; i++) {
            wt[i] = scn.nextInt();
        }
        int[] val = new int[n];
        for (int i = 0; i < val.length; i++) {
            val[i] = scn.nextInt();
        }
        int W = scn.nextInt();
        System.out.println(Knapsack(wt, val, W));
    }
}

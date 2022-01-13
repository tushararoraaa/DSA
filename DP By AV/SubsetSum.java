import java.util.Scanner;

public class SubsetSum {

    public static boolean subsetSum(int[] arr, int sum, int n) {
        if (sum == 0) {
            return true;
        }
        if (n == 0) {
            return false;
        }
        if (arr[n - 1] <= sum) {
            return subsetSum(arr, sum - arr[n - 1], n - 1) || subsetSum(arr, sum, n - 1);
        } else {
            return subsetSum(arr, sum, n - 1);
        }

    }

    public static boolean subsetSum_DP(int[] arr, int sum, int n) {
        boolean[][] t = new boolean[n + 1][sum + 1];
        for (int i = 0; i < t.length; i++) {
            t[i][0] = true;
        }
        for (int j = 0; j < t[0].length; j++) {
            t[0][j] = false;
        }
        for (int i = 1; i < t.length; i++) {
            for (int j = 1; j < t[0].length; j++) {
                if (arr[i - 1] <= j) {
                    t[i][j] = t[i - 1][j - arr[i - 1]] || t[i - 1][j];
                } else if (arr[i - 1] > j) {
                    t[i][j] = t[i - 1][j];
                }
            }
        }
        return t[n][sum];

    }

    // TO PRINT ALL SUBSETS = TARGET
    public static void printTargetSumSubsets(int[] arr, int idx, String set, int sos, int tar) {
        if (sos > tar) {
            return;
        }
        if (idx == arr.length) {
            if (sos == tar) {
                System.out.println(set + ".");
            }
            return;
        }
        printTargetSumSubsets(arr, idx + 1, set + arr[idx] + " ,", sos + arr[idx], tar);
        printTargetSumSubsets(arr, idx + 1, set, sos, tar);

    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }
        int sum = scn.nextInt();
        System.out.println(subsetSum(arr, sum, n));
        System.out.println(subsetSum_DP(arr, sum, n));
    }
}

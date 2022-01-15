import java.util.Scanner;

public class EqualSumPartitition {

    public static boolean isPossible(int[] arr, int n) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        if (sum % 2 != 0) {
            return false;
        } else {
            return subsetSum_DP(arr, sum / 2, arr.length);
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

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }
        System.out.println(isPossible(arr, n));
    }
}

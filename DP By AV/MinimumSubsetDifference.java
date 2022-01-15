import java.util.ArrayList;
import java.util.Scanner;

public class MinimumSubsetDifference {

    public static boolean[][] subsetSum(int[] arr, int n, int sum) {
        boolean[][] t = new boolean[n + 1][sum + 1];
        for (int j = 0; j < t[0].length; j++) {
            t[0][j] = false;
        }
        for (int i = 0; i < t.length; i++) {
            t[i][0] = true;
        }

        for (int i = 1; i < t.length; i++) {
            for (int j = 1; j < t[0].length; j++) {
                if (arr[i - 1] <= j) {
                    t[i][j] = t[i - 1][j] || t[i - 1][j - arr[i - 1]];
                } else {
                    t[i][j] = t[i - 1][j];
                }
            }
        }
        return t;
    }

    public static int min(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        boolean[][] t = subsetSum(arr, arr.length, sum);
        ArrayList<Integer> aL = new ArrayList<>();
        for (int j = 0; j <= t[0].length / 2; j++) {
            if (t[arr.length][j]) {
                aL.add(j);
            }
        }
        int min = Integer.MAX_VALUE;
        for (int i : aL) {
            min = Math.min(min, sum - (2 * i));
        }
        return min;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }
        System.out.println(min(arr));
    }
}

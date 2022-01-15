import java.util.Scanner;

public class CountOfSubsetSum {

    public static int countSubsets(int[] arr, int sum) {
        int[][] t = new int[arr.length + 1][sum + 1];
        for (int j = 0; j < t[0].length; j++) {
            t[0][j] = 0;
        }
        for (int i = 0; i < t.length; i++) {
            t[i][0] = 1;
        }

        for (int i = 1; i < t.length; i++) {
            for (int j = 1; j < t[0].length; j++) {
                if (arr[i - 1] <= j) {
                    t[i][j] = t[i - 1][j - arr[i - 1]] + t[i - 1][j];
                } else if (arr[i - 1] > j) {
                    t[i][j] = t[i - 1][j];
                }
            }
        }
        return t[arr.length][sum];
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }
        int sum = scn.nextInt();
        System.out.println(countSubsets(arr, sum));
    }
}

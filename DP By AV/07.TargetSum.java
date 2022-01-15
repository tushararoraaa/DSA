import java.util.Scanner;

public class TargetSum {

    public static int countSubsets(int[] arr, int target) { // WE CHANGED IT INTO SUBSET SUM PROBLEM USING SIMPLE MATHS
        int sumOfArray = 0;
        for (int i = 0; i < arr.length; i++) {
            sumOfArray += arr[i];
        }
        int s1 = (target + sumOfArray) / 2;

        return countSubsetSum(arr, s1);
    }

    public static int countSubsetSum(int[] arr, int sum) { // SUBSET SUM PROBLEM WE SOLVED IT EARLIER
        int n = arr.length;
        int[][] t = new int[n + 1][sum + 1];
        for (int j = 0; j < t[0].length; j++) {
            t[0][j] = 0;
        }
        for (int i = 0; i < t.length; i++) {
            t[i][0] = 1;
        }
        for (int i = 1; i < t.length; i++) {
            for (int j = 1; j < t[0].length; j++) {
                if (arr[i - 1] <= j) {
                    t[i][j] = t[i - 1][j] + t[i - 1][j - arr[i - 1]];
                } else {
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
        int target = scn.nextInt();
        System.out.println(countSubsets(arr, target));
    }
}

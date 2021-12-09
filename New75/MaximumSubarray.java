import java.util.Scanner;

public class MaximumSubarray {

    public static void maxSubarray(int[] arr) { // PRODUCES TLE
        int n = arr.length;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int sum = 0;
                for (int k = i; k <= j; k++) {
                    sum += arr[k];
                }
                max = Math.max(max, sum);
            }
        }
        System.out.println(max);
    }

    public static void maxSubarray_improved(int[] arr) {
        int n = arr.length;
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
            max = Math.max(max, sum);
            if (sum < 0) {
                sum = 0;
            }
        }
        System.out.println(max);
    }

    // -2 1 -3 4 -1 2 1 -5 4
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        maxSubarray_improved(arr);
    }
}

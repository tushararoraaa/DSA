import java.util.Scanner;

public class RunningSum {

    public static int[] runningSum(int[] arr) {
        int[] res = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = 0; j <= i; j++) {
                sum += arr[j];
            }
            res[i] = sum;
        }
        return res;
    }

    public static int[] runningSum_improved(int[] arr) {
        int[] res = new int[arr.length];
        res[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            res[i] = res[i - 1] + arr[i];
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }
        int[] res = runningSum(arr);
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i] + " ");
        }
        System.out.println();
        int[] res2 = runningSum_improved(arr);
        for (int i = 0; i < res2.length; i++) {
            System.out.print(res2[i] + " ");
        }
    }
}

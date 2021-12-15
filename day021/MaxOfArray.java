import java.util.Scanner;

public class MaxOfArray {

    public static int max(int[] arr, int idx) {
        if (idx == arr.length) {
            return 0;
        }
        int m = arr[idx];
        int res = Math.max(m, max(arr, idx + 1));
        return res;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        int m = max(arr, 0);
        System.out.println(m);
    }
}

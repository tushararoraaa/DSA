import java.util.Scanner;

public class AllindicesOfArray {

    public static int[] printIndices(int[] arr, int idx, int x, int count) {
        if (idx == arr.length) {
            return new int[count];
        }
        if (arr[idx] == x) {
            count++;
        }
        int[] res2 = printIndices(arr, idx + 1, x, count);

        if (arr[idx] == x) {
            res2[count - 1] = idx;
            count--;
        }
        return res2;

    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        int x = scn.nextInt();
        // System.out.println(printIndices(arr, 0, x, 0));
        int[] res = printIndices(arr, 0, x, 0);
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i] + " ");
        }
    }
}

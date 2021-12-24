import java.util.Scanner;

public class ConcatenationOfTwoArrays {

    public static int[] concat(int[] arr) {
        int[] res = new int[2 * arr.length];
        int i = 0;
        int j = 0;
        while (j < res.length) {
            i %= arr.length;
            res[j] = arr[i];
            i++;
            j++;
        }
        return res;
    }

    public static int[] concat_improved(int[] arr) {
        int[] res = new int[2 * arr.length];
        int i = 0;
        while (i < arr.length) {
            res[i] = arr[i];
            res[i + arr.length] = arr[i];
            i++;
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
        int[] res = concat(arr);
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i] + " ");
        }
        System.out.println();

        int[] res2 = concat_improved(arr);
        for (int i = 0; i < res2.length; i++) {
            System.out.print(res2[i] + " ");
        }
    }
}

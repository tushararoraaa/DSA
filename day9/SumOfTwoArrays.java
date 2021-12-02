import java.util.Scanner;

public class SumOfTwoArrays {

    public static void sum(int[] arr, int[] arr2) {
        int i = 0, j = 0;
        while (i <= arr.length || j <= arr.length || carry != 0) {
            int sum = carry + arr[i] + arr[j];
            carry = sum / 10;
            sum %= 10;

            i++;
            j++;
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int m = scn.nextInt();
        int n = scn.nextInt();
        int[] arr = new int[m];
        int[] arr2 = new int[n];

        for (int i = 0; i <= m; i++) {
            arr[i] = scn.nextInt();
        }
        for (int i = 0; i <= n; i++) {
            arr2[i] = scn.nextInt();
        }
        sum(arr, arr2);

    }

}

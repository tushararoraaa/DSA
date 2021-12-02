
import java.util.Scanner;

public class BarChart {
    // public static void Bar_chart(int[] arr, int n) {
    // for (int i = 0; i < n; i++) {
    // for (int j = 0; j < arr[i]; j++) {
    // System.out.println("*");
    // }

    // }

    // }
    public static void Bar_chart(int[] arr, int n) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            max = Math.max(max, arr[i]);
        }
        for (int i = max; i >= 1; i--) {
            for (int j = 0; j < n; j++) {
                if (arr[j] >= i) {
                    System.out.print("*\t");
                } else {
                    System.out.print("\t");
                }
            }
            System.out.println();

        }

    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        Bar_chart(arr, n);
    }

}

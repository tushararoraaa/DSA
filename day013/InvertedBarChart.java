import java.util.Scanner;

public class InvertedBarChart {

    public static void invertedBarChart(int[] arr) {
        int n = arr.length;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            max = Math.max(max, arr[i]);
        }

        for (int i = 0; i < max; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[j] > i && arr[j] != 0) {
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
        invertedBarChart(arr);
    }
}

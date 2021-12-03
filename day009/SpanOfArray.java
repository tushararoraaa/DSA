import java.util.Arrays;
import java.util.Scanner;

public class SpanOfArray {

    public static int Span_Array(int[] arr, int n) {
        // int max = arr[0], min = arr[0];
        // for (int i = 1; i < n; i++) {
        // if (arr[i] >= max) {
        // max = arr[i];
        // }
        // if (arr[i] < min) {
        // min = arr[i];
        // }
        // }
        // return max - min;
        Arrays.sort(arr);
        return arr[n - 1] - arr[0];
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        int span = Span_Array(arr, n);
        System.out.println(span);

    }
}
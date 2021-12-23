import java.util.Scanner;

public class RotateArray {

    public static int[] reverse(int[] arr, int start, int end) {
        while (start <= end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        return arr;

    }

    public static void rotate(int[] arr, int k) {
        int n = arr.length;
        k = k % n;
        arr = reverse(arr, 0, n - k - 1);
        arr = reverse(arr, n - k, n - 1);
        arr = reverse(arr, 0, n - 1);

    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }
        int k = scn.nextInt();
        rotate(arr, k);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

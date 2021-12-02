import java.util.Scanner;

public class RotateArray {

    public static void rotateArray(int[] arr, int k) {
        if (k < 0) {
            k += arr.length;
        }
        k %= arr.length;
        for (int i = 0; i < k; i++) {
            int x = arr[arr.length - 1];
            for (int j = arr.length - 2; j >= 0; j--) {
                arr[j + 1] = arr[j];
            }
            arr[0] = x;

        }
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void reverse(int[] arr, int i, int j) {
        while (i <= j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }

    public static void rotateArray_improved(int[] arr, int k) {
        k %= arr.length;
        if (k < 0) {
            k += arr.length;
        }
        reverse(arr, 0, arr.length - k - 1);
        reverse(arr, arr.length - k, arr.length - 1);
        reverse(arr, 0, arr.length - 1);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        System.out.println("Enter value of k ");
        int k = scn.nextInt();
        // rotateArray(arr, k);
        rotateArray_improved(arr, k);
    }

}

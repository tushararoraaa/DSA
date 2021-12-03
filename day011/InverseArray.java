import java.util.Scanner;

public class InverseArray {
    public static void inverseArray(int[] arr) {
        int[] c = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            int x = arr[i];
            c[x] = i;
        }
        for (int i : c) {
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
        inverseArray(arr);
    }

}

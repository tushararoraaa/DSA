import java.util.Scanner;

public class DiagonalTraversal {

    public static void diagonalTraversal(int[][] arr) {
        // int count = 0;
        // int n = arr.length;
        // while (count <= n) {
        // for (int i = 0; i < n; i++) {
        // for (int j = i + count; j < n; j++) {
        // System.out.print(arr[i][j] + "->");
        // break;
        // }
        // }
        // count++;
        // }
        int gap = 0;
        while (gap < arr.length) {
            for (int i = 0, j = gap; j < arr.length; i++, j++) {
                System.out.println(arr[i][j]);
            }
            gap++;
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[][] arr = new int[n][n];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = scn.nextInt();
            }
        }
        diagonalTraversal(arr);
    }
}

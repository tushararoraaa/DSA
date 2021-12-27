import java.util.Scanner;

public class SumOfDiagonals {

    public static int diagonalSum(int[][] arr) {
        // int sum = 0;
        // for (int i = 0; i < arr.length; i++) {
        // for (int j = 0; j < arr[0].length; j++) {
        // if (i == j || i + j == arr.length - 1) {
        // sum += arr[i][j];
        // }
        // }
        // }
        // return sum;
        int sum = 0;
        int s = 0;
        int t = arr.length - 1;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[s][s] + arr[t][t];
            s++;
            t--;
        }
        if (arr.length % 2 != 0) {
            sum -= arr[arr.length / 2][arr.length / 2];
        }
        return sum;

    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[][] arr = new int[n][n];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = scn.nextInt();
            }
        }
        System.out.println(diagonalSum(arr));
    }
}

import java.util.Scanner;

public class RotateArray {

    // public static void rotateArray(int[][] arr) {
    // int minr = 0;
    // int maxr = arr.length - 1;
    // int minc = 0;
    // int maxc = arr.length - 1;
    // int count = 0;
    // while (count < (arr.length * arr.length)) {
    // if (count < (arr.length * arr.length) && minc <= maxc) {
    // minc++;
    // }
    // int temp1 = arr[minr][minc];
    // if (count < (arr.length * arr.length) && minr <= maxr) {
    // minr++;
    // }
    // int temp2 = arr[minr][maxc];
    // if (count < (arr.length * arr.length) && maxc >= minc) {
    // maxc--;
    // }
    // int temp3 = arr[maxr][maxc];
    // if (count < (arr.length * arr.length) && maxr >= minr) {
    // maxr--;
    // }
    // int temp4 = arr[maxr][minc];

    // arr[minr][maxc] = temp1;
    // arr[maxr][maxc] = temp2;
    // arr[maxr][minc] = temp3;
    // arr[minr][minc] = temp4;

    // count += 4;

    // }

    // }

    public static void rotateArray(int[][] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) { // TRANSPOSE
            for (int j = i + 1; j < n; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }

        for (int i = 0; i < n; i++) { // REVERSE THE TRANSPOSE
            int s = 0;
            int t = arr.length - 1;
            while (s <= t) {
                int temp = arr[i][s];
                arr[i][s] = arr[i][t];
                arr[i][t] = temp;
                s++;
                t--;
            }
        }

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
        rotateArray(arr);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

}

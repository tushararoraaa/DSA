import java.util.Scanner;

public class SpiralTransversal {

    public static void spiralTransversal(int[][] arr) {
        int minr = 0;
        int maxr = arr.length - 1;
        int minc = 0;
        int maxc = arr[0].length - 1;
        int count = 0;
        int numOfElements = arr.length * arr[0].length;
        while (count < numOfElements) {
            for (int i = minr, j = minc; i <= maxr && count < numOfElements; i++) {
                System.out.print(arr[i][j] + "->");
                count++;
            }
            minc++;
            for (int j = minc, i = maxr; j <= maxc && count < numOfElements; j++) {
                System.out.print(arr[i][j] + "->");
                count++;
            }
            maxr--;
            for (int i = maxr, j = maxc; i >= minr && count < numOfElements; i--) {
                System.out.print(arr[i][j] + "->");
                count++;
            }
            maxc--;
            for (int j = maxc, i = minr; j >= minc && count < numOfElements; j--) {
                System.out.print(arr[i][j] + "->");
                count++;
            }
            minr++;

        }

    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = scn.nextInt();
            }
        }
        spiralTransversal(arr);
    }
}

import java.util.Scanner;

public class RingRotate {

    public static void reverse(int[] arr, int i, int j) {
        while (i <= j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }

    public static void rotateArr(int[] arr, int k) {
        k %= arr.length;
        if (k < 0) {
            k += arr.length;
        }
        reverse(arr, 0, arr.length - k - 1);
        reverse(arr, arr.length - k, arr.length - 1);
        reverse(arr, 0, arr.length - 1);
    }

    public static void ringRotate(int[][] arr, int s, int r) {

        // 1) 2-D to 1-D Array
        // 2) Rotate 1-D by 'r' times
        // 3) Put Elements of 1-D into 2-D at their place
        int n = arr.length;
        int m = arr[0].length;

        int minr = s - 1;
        int maxr = n - s;
        int minc = s - 1;
        int maxc = m - s;

        int sizeOfArray = 2 * (maxr + maxc - minr - minc); // 2-D to 1-D Array
        int[] ans = new int[sizeOfArray];
        int k = 0;

        for (int i = minr, j = minc; i <= maxr; i++) {
            ans[k] = arr[i][j];
            k++;
        }
        minc++;

        for (int j = minc, i = maxr; j <= maxc; j++) {
            ans[k] = arr[i][j];
            k++;
        }
        maxr--;

        for (int i = maxr, j = maxc; i >= minr; i--) {
            ans[k] = arr[i][j];
            k++;
        }
        maxc--;

        for (int j = maxc, i = minr; j >= minc; j--) {
            ans[k] = arr[i][j];
            k++;
        }
        minr++;

        rotateArr(ans, r); // Rotate 1-D by 'r' times

        int minr2 = s - 1;
        int maxr2 = n - s;
        int minc2 = s - 1;
        int maxc2 = m - s;
        // Put Elements of 1-D into 2-D at their place
        int t = 0;
        for (int i = minr2, j = minc2; i <= maxr2; i++) {
            arr[i][j] = ans[t];
            t++;
        }
        minc2++;

        for (int j = minc2, i = maxr2; j <= maxc2; j++) {
            arr[i][j] = ans[t];
            t++;
        }
        maxr2--;

        for (int i = maxr2, j = maxc2; i >= minr2; i--) {
            arr[i][j] = ans[t];
            t++;
        }
        maxc2--;

        for (int j = maxc2, i = minr2; j >= minc2; j--) {
            arr[i][j] = ans[t];
            t++;
        }
        minr2++;

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
        System.out.println("Enter value of S");
        int s = scn.nextInt();
        System.out.println("Enter value of No. of Rotations r");
        int r = scn.nextInt();
        ringRotate(arr, s, r);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}

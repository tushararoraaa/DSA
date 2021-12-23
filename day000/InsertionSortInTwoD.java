import java.util.Arrays;
import java.util.Scanner;

public class InsertionSortInTwoD {

    public static void InsertionSort(int[][] arr, int s) {
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

        // for (int i = 0; i < ans.length; i++) {
        // System.out.print(ans[i] + " ");
        // }

        Arrays.sort(ans);

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
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = scn.nextInt();
            }
        }

        
        int s = n - 2;
        for (int i = 1; i <= s; i++) {
            InsertionSort(arr, i);
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}

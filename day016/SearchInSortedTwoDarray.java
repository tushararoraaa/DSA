import java.util.Scanner;

public class SearchInSortedTwoDarray {

    public static void search(int[][] arr, int x) {
        int i = 0;
        int j = arr.length - 1;
        int n = arr.length;
        while (true) {
            if (x == arr[i][j]) {
                System.out.println(i);
                System.out.println(j);
                break;
            } else if (x > arr[i][j]) {
                i++;
            } else {
                j--;
            }
            if (i < 0 || i >= n || j < 0 || j >= n) {
                System.out.println("Not found");
                break;
            }
        }

    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = scn.nextInt();
            }
        }
        int x = scn.nextInt();
        search(arr, x);
    }
}
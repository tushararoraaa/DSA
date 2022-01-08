import java.util.Scanner;

public class FloodFill1 {

    // HERE WE ARE USING DIRECTION ARRAY

    // asf -> answer so far

    static int[][] dir = { { -1, 0 }, { 0, -1 }, { 1, 0 }, { 0, 1 } };
    static String[] dirN = { "t", "l", "d", "r" };

    public static void floodfill(int[][] arr, int sr, int sc, String asf) {

        if (sr < 0 || sc < 0 || sr >= arr.length || sc >= arr[0].length || arr[sr][sc] == 1) {
            return;
        }

        if (sr == arr.length - 1 && sc == arr[0].length - 1) {
            System.out.println(asf);
            return;
        }
        arr[sr][sc] = 1;

        for (int i = 0; i < 4; i++) {
            int r = sr + dir[i][0];
            int c = sc + dir[i][1];
            floodfill(arr, r, c, asf + dirN[i]);
        }
        arr[sr][sc] = 0;

    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        int[][] arr = new int[n][m];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = scn.nextInt();
            }
        }
        floodfill(arr, 0, 0, "");

    }
}

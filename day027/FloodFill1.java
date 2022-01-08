import java.util.Scanner;

public class FloodFill1 {
    // USING EXTRA SPACE FOR BOOLEAN MATRIX OF SAME SIZE

    // asf -> answer so far
    public static void floodfill(int[][] arr, int sr, int sc, String asf, boolean[][] vis) {

        if (sr < 0 || sc < 0 || sr >= arr.length || sc >= arr[0].length || arr[sr][sc] == 1 || vis[sr][sc] == true) {
            return;
        }

        if (sr == arr.length - 1 && sc == arr[0].length - 1) {
            System.out.println(asf);
            return;
        }
        vis[sr][sc] = true;

        floodfill(arr, sr - 1, sc, asf + "t", vis);
        floodfill(arr, sr, sc - 1, asf + "l", vis);
        floodfill(arr, sr + 1, sc, asf + "d", vis);
        floodfill(arr, sr, sc + 1, asf + "r", vis);

        vis[sr][sc] = false;

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

        boolean[][] vis = new boolean[n][m];

        floodfill(arr, 0, 0, "", vis);

    }
}

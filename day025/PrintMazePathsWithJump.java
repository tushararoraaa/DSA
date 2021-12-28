import java.util.Scanner;

public class PrintMazePathsWithJump {

    public static void printMazePaths(int sr, int sc, int dr, int dc, String psf) {
        if (sr == dr && sc == dc) {
            System.out.println(psf);
            return;
        }
        for (int i = 1; sc + i <= dc; i++) {
            printMazePaths(sr, sc + i, dr, dc, psf + "h" + i);
        }
        for (int i = 1; sr + i <= dr; i++) {
            printMazePaths(sr + i, sc, dr, dc, psf + "v" + i);
        }
        for (int i = 1; sr + i <= dr && sc + i <= dc; i++) {
            printMazePaths(sr + i, sc + i, dr, dc, psf + "d" + i);
        }

    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        printMazePaths(0, 0, n - 1, m - 1, "");
    }
}

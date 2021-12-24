import java.util.ArrayList;
import java.util.Scanner;

public class GetMazePathsWithJump {

    public static ArrayList<String> getMazePaths(int sr, int sc, int dr, int dc) {
        if (sr == dr && sc == dc) {
            ArrayList<String> baseP = new ArrayList<>();
            baseP.add("");
            return baseP;
        }

        ArrayList<String> path = new ArrayList<>();

        for (int i = 1; i <= dc - sc; i++) {
            ArrayList<String> pathH = getMazePaths(sr, sc + i, dr, dc);
            for (String ele : pathH) {
                path.add("h" + i + ele);
            }
        }

        for (int i = 1; i <= dr - sr; i++) {
            ArrayList<String> pathV = getMazePaths(sr + i, sc, dr, dc);
            for (String ele : pathV) {
                path.add("v" + i + ele);
            }
        }

        for (int i = 1; i <= dc - sc && i <= dr - sr; i++) {
            ArrayList<String> pathD = getMazePaths(sr + i, sc + i, dr, dc);
            for (String ele : pathD) {
                path.add("d" + i + ele);
            }
        }
        return path;

    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        ArrayList<String> path = getMazePaths(1, 1, n, m);
        System.out.println(path);
    }
}

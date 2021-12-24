import java.util.Scanner;
import java.util.*;

public class GetMazePaths {

    public static ArrayList<String> getMazePaths(int sr, int sc, int dr, int dc) {
        if (sr == dr && sc == dc) {
            ArrayList<String> baseP = new ArrayList<>();
            baseP.add("");
            return baseP;
        }
        if (sr == dr + 1 || sc == dc + 1) {
            ArrayList<String> baseN = new ArrayList<>();
            return baseN;
        }

        ArrayList<String> pathsH = getMazePaths(sr, sc + 1, dr, dc);
        ArrayList<String> pathsV = getMazePaths(sr + 1, sc, dr, dc);

        ArrayList<String> path = new ArrayList<>();

        for (String ele : pathsH) {
            path.add('h' + ele);
        }
        for (String ele : pathsV) {
            path.add('v' + ele);
        }

        return path;

    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();

        ArrayList<String> paths = getMazePaths(0, 0, n - 1, m - 1);
        System.out.println(paths);
    }

}

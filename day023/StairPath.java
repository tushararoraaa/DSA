import java.util.ArrayList;
import java.util.Scanner;

public class StairPath {

    public static ArrayList<String> getStairPaths(int n) {
        if (n == 0) {
            ArrayList<String> Pbase = new ArrayList<>();
            Pbase.add("");
            return Pbase;
        }
        if (n < 0) {
            ArrayList<String> Nbase = new ArrayList<>();
            return Nbase;
        }

        ArrayList<String> paths1 = getStairPaths(n - 1);
        ArrayList<String> paths2 = getStairPaths(n - 2);
        ArrayList<String> paths3 = getStairPaths(n - 3);

        ArrayList<String> path = new ArrayList<>();

        for (String ele : paths1) {
            path.add(1 + ele);
        }
        for (String ele : paths2) {
            path.add(2 + ele);
        }
        for (String ele : paths3) {
            path.add(3 + ele);
        }

        return path;

    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        ArrayList<String> path = getStairPaths(n);
        System.out.println(path);
    }
}

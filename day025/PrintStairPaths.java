import java.util.Scanner;

public class PrintStairPaths {

    public static void printStairPaths(int n, String path) {
        if (n == 0) {
            System.out.println(path);
            return;
        }
        if (n - 1 >= 0) {
            printStairPaths(n - 1, path + "1");
        }
        if (n - 2 >= 0) {
            printStairPaths(n - 2, path + "2");
        }
        if (n - 3 >= 0) {
            printStairPaths(n - 3, path + "3");
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        printStairPaths(n, "");
    }
}

import java.util.Scanner;

public class Pattern28 {

    public static void Pattern(int n) {
        int x = (n / 2) + 1;
        int y = (n / 2) + 1;
        int z = (n / 2) + 1;
        for (int r = 1; r <= n; r++) {
            if (r > (n / 2) + 1) {
                x++;
                y++;
                z--;
            }
            for (int c = 1; c <= n; c++) {
                if (c == 1 || c == n || (r == x && c == y) || (r == x && c == z)) {
                    System.out.print("*\t");
                } else {
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        Pattern(n);
    }
}
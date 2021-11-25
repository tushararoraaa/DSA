import java.util.Scanner;

public class Pattern17 {

    public static void Pattern(int n) {
        int nst = 1;
        int x = 0;
        int y = 1;

        for (int r = 1; r <= n; r++) {
            if (r == 1) {
                System.out.print(x);
            } else {
                for (int cst = 1; cst <= nst; cst++) {
                    System.out.print(y + "\t");
                    int next = x + y;
                    x = y;
                    y = next;

                }
            }
            nst++;
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        Pattern(n);
    }

}

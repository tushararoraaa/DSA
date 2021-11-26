import java.util.Scanner;

public class Pattern26 {

    public static void Pattern(int n) {
        int nst = 1;
        int nsp = -1;
        int nsp2 = n - 2;
        int nsp3 = -1;
        for (int r = 1; r <= n; r++) {
            for (int cst = 1; cst <= nst; cst++) {
                System.out.print("*\t");
            }
            for (int csp = 1; csp <= nsp; csp++) {
                System.out.print("\t");
            }
            for (int cst = 1; cst <= nst; cst++) {
                if (r <= (n / 2) + 1 && r != 1) {
                    System.out.print("*\t");
                }
            }
            for (int csp = 1; csp <= nsp2; csp++) {
                System.out.print("\t");
            }
            for (int cst = 1; cst <= nst; cst++) {
                if (r <= (n / 2)) {
                    System.out.print("*\t");
                }
            }
            for (int csp = 1; csp <= nsp3; csp++) {
                if (r <= (n / 2) + 1) {
                    System.out.print("\t");
                }

            }
            for (int cst = 1; cst <= nst; cst++) {
                if (r == 1) {
                    continue;
                } else {
                    System.out.print("*\t");
                }

            }
            if (r <= n / 2) {
                nsp++;
                nsp2 -= 2;
                nsp3++;
            } else {
                nsp = n - 2;
                nsp2 -= 2;
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

import java.util.Scanner;

public class Pattern21 {

    public static void Pattern(int n) {
        int nst = 1;
        int nst2 = 1;
        int nsp = (2 * n) - 3;
        for (int r = 1; r <= n; r++) {
            for (int cst = 1; cst <= nst; cst++) {
                System.out.print(cst + "\t");

            }
            for (int csp = 1; csp <= nsp; csp++) {
                System.out.print("\t");
            }
            for (int cst = nst2; cst >= 1; cst--) {
                System.out.print(cst + "\t");
            }
            if (r == (n - 1)) {
                nst++;
                nsp -= 2;
            } else {
                nsp -= 2;
                nst++;
                nst2++;
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

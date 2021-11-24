import java.util.Scanner;

public class Pattern15 {

    public static void Pattern(int n) {
        int nsp = n / 2;
        int nst = 1;
        int nsp2 = -1;
        int nst2 = 1;
        for (int r = 1; r <= n; r++) {
            for (int csp = 1; csp <= nsp; csp++) {
                System.out.print("\t");
            }
            for (int cst = 1; cst <= nst; cst++) {
                System.out.print("*\t");
            }
            for (int csp = 1; csp <= nsp2; csp++) {
                if (r == 1) {
                    continue;
                } else {
                    System.out.print("\t");
                }

            }
            for (int cst = 1; cst <= nst2; cst++) {
                if (r == 1 || r == n) {
                    continue;
                } else {
                    System.out.print("*\t");
                }

            }
            if (r <= n / 2) {
                nsp--;
                nsp2 += 2;
            } else {
                nsp++;
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

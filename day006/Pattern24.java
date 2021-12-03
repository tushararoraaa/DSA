import java.util.Scanner;

public class Pattern24 {

    public static void Pattern(int n) {
        int nsp = 1;
        int nst = n - 2;
        int nsp2 = -1;
        int nst2 = 1;
        for (int i = 1; i <= n; i++) {
            System.out.print("*\t");
        }
        System.out.println();
        for (int r = 2; r < n; r++) {

            for (int csp = 1; csp <= nsp; csp++) {
                System.out.print("\t");
            }
            for (int cst = 1; cst <= nst; cst++) {
                System.out.print("*\t");
            }
            for (int csp = 1; csp <= nsp2; csp++) {
                System.out.print("\t");
            }
            for (int cst = 1; cst <= nst2; cst++) {
                if (r <= (n / 2) + 1) {
                    continue;
                }
                System.out.print("*\t");
            }

            if (r <= n / 2) {
                nsp++;
                nst -= 2;
            } else {
                nsp--;
                nsp2 += 2;

            }
            System.out.println();

        }
        for (int i = 1; i <= n; i++) {
            System.out.print("*\t");
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        Pattern(n);
    }

}

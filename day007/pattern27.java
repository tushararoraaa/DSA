import java.util.Scanner;

public class pattern27 {

    public static void Pattern(int n) {
        int nst = (n / 2) + 1;
        int nst2 = 1;
        int nsp = n / 2;
        int nsp2 = (n / 2) - 1;

        for (int r = 1; r <= n; r++) {
            if (r == (n / 2) + 1) {
                for (int i = 1; i <= n; i++) {
                    System.out.print("*\t");
                }
                System.out.println();
            } else {
                if (r >= (n / 2) + 1) {
                    System.out.print("*");
                    nsp = (n / 2);
                }
                for (int csp = 1; csp <= nsp; csp++) {
                    if (r == 1) {
                        continue;
                    } else {
                        System.out.print("\t");
                    }
                }
                for (int cst = 1; cst <= nst; cst++) {
                    if (r != 1) {
                        if (r == n) {
                            nst = (n / 2) + 1;
                        } else {
                            nst = 1;
                        }
                    }
                    System.out.print("*\t");
                }
                for (int csp = 1; csp <= nsp2; csp++) {
                    System.out.print("\t");
                }
                for (int cst = 1; cst <= nst2; cst++) {
                    if (r >= (n / 2)) {
                        nst2 = 0;
                    }
                    System.out.print("*\t");
                }
                System.out.println();
            }

        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        Pattern(n);
    }

}

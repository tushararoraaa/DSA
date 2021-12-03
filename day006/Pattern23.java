import java.util.Scanner;

public class Pattern23 {

    public static void Pattern(int n) {
        int nst = 1;
        int nsp = 1;
        int nsp2 = n - 4;
        for (int i = 1; i <= n; i++) {
            System.out.print("*\t");
        }
        System.out.println();
        for (int r = 2; r <= n; r++) {
            for (int csp = 1; csp <= nsp; csp++) {
                System.out.print("\t");
            }
            for (int cst = 1; cst <= nst; cst++) {
                System.out.print("*\t");
            }
            for (int csp = 1; csp <= nsp2; csp++) {
                System.out.print("\t");
            }
            for (int cst = 1; cst <= nst; cst++) {
                if (r >= (n / 2) + 1) {
                    continue;
                } else {
                    System.out.print("*\t");
                }

            }
            if (r <= n / 2) {
                nsp++;
                nsp2 -= 2;
            } else {
                nsp--;
                nst += 2;
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

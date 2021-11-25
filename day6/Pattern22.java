import java.util.Scanner;

public class Pattern22 {

    public static void Pattern_0(int n) {
        int nst = 1;
        int nsp = n / 2;
        for (int r = 1; r <= n; r++) {
            for (int csp = 1; csp <= nsp; csp++) {
                if (r == (n / 2) + 1) {
                    System.out.print("*\t");

                } else {
                    System.out.print("\t");
                }

            }
            for (int cst = 1; cst <= nst; cst++) {
                System.out.print("*\t");
            }
            if (r <= n / 2) {
                nst++;
            } else {
                nst--;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        Pattern_0(n);
    }

}

package day5;

import java.util.Scanner;

public class PatternW {

    public static void Pattern(int n) {
        int nsp = 0;
        int nst = 1;
        for (int r = 1; r <= n; r++) {
            for (int csp = 1; csp <= nsp; csp++) {
                System.out.print("\t");
            }
            for (int cst = 1; cst <= nst; cst++) {
                System.out.print("*\t");
            }
            if (r == n / 2) {
                nst++;
            }
            if (r == n - 1) {
                nst--;
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

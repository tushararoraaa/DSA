import java.util.Scanner;

public class Pattern16 {

    public static void Pattern(int n) {
        int nst = 1;
        for (int r = 1; r <= n; r++) {
            for (int cst = 1; cst <= nst; cst++) {
                System.out.print(cst + "\t");
            }
            nst++;
            System.out.println();
        }
    }

    public static void Pattern_1(int n) {
        int nst = 1;
        int count = 1;
        for (int r = 1; r <= n; r++) {
            for (int cst = 1; cst <= nst; cst++) {
                System.out.print(count + "\t");
                count++;
            }
            nst++;
            System.out.println();
        }
    }

    public static void Pattern_2(int n) {
        int nsp = (n / 2) + 1;
        int nst = 1;

        for (int r = 1; r <= n; r++) {
            for (int csp = 1; csp <= nsp; csp++) {
                System.out.print("\t");
            }
            int count = (r <= (n / 2) + 1 ? r : n - r + 1);
            for (int cst = 1; cst <= nst; cst++) {
                System.out.print(count + "\t");

            }

            if (r <= n / 2) {
                nsp--;
                nst += 2;

            } else {
                nsp++;
                nst -= 2;

            }
            System.out.println();
        }
    }

    public static void Pattern_3(int n) {
        int nst = 1;
        for (int r = 1; r <= n; r++) {
            for (int cst = 1; cst <= nst; cst++) {
                System.out.print(r + "\t");
            }
            nst++;
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        Pattern(n);
        System.out.println();
        Pattern_1(n);
        System.out.println();
        Pattern_2(n);
        System.out.println();
        Pattern_3(n);
    }

}

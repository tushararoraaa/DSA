import java.util.Scanner;

public class Pattern5 {

    public static void Pattern(int n) {
        int nsp = n - 1;
        int nst = 1;
        for (int r = 1; r <= 5; r++) {
            for (int csp = 1; csp <= nsp; csp++) {
                System.out.print("\t");
            }

            for (int cst = 1; cst <= nst; cst++) {
                System.out.print("*\t");
            }
            nsp--;
            nst = nst + 2;
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        Pattern(n);
    }

}

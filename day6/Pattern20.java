import java.util.Scanner;

public class Pattern20 {

    public static void Pattern(int n) {
        int nsp = n / 2;
        int nst = 1;
        int count = 1;
        for (int r = 1; r <= n; r++) {
            for (int csp = 1; csp <= nsp; csp++) {
                System.out.print("\t");
            }
            count = (nst / 2) + 1;
            for (int cst = 1; cst <= nst; cst++) {
                if (cst < (nst / 2) + 1) {
                    System.out.print(count++ + "\t");
                } else {
                    System.out.print(count-- + "\t");
                }
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

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        Pattern(n);
    }

}

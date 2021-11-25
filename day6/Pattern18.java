import java.util.Scanner;

public class Pattern18 {

    public static void Pattern(int n) {

        for (int r = 0; r < n; r++) {
            int x = 1;
            for (int c = 0; c <= r; c++) {
                System.out.print(x + "\t");
                int y = (x * (r - c)) / (c + 1);
                x = y;
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

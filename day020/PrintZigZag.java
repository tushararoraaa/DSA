import java.util.Scanner;

public class PrintZigZag {

    public static void zigzag(int n) {
        if (n == 0) {
            return;
        }

        System.out.println(n);
        zigzag(n - 1);
        System.out.println(n);
        zigzag(n - 1);
        System.out.println(n);
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        zigzag(n);
    }
}

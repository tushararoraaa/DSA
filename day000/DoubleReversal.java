import java.util.Scanner;

public class DoubleReversal {

    public static boolean isSameAfterReversals(int n) {
        if (n == 0) {
            return true;
        }
        if (n % 10 == 0) {
            return false;
        } else {
            return true;
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        System.out.println(isSameAfterReversals(n));
    }
}

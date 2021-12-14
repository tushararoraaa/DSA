import java.util.Scanner;

public class PowerOfThree {

    public static boolean power(int n) {
        if (n == 1) {
            return true;
        }
        if (n % 3 == 0 && n > 0) {
            return power(n / 3);
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        System.out.println(power(n));
    }
}

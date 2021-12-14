import java.util.Scanner;

public class Power {
    // 50
    public static double power(double x, int n) {
        if (n == 0) {
            return 1;
        }
        if (n < 0) {
            return (1 / x) * power(1 / x, -(n + 1));
        }
        return (n % 2 == 0) ? power(x * x, n / 2) : x * power(x * x, n / 2);
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        double x = scn.nextDouble();
        int n = scn.nextInt();
        double ans = power(x, n);
        System.out.println(ans);
    }

}

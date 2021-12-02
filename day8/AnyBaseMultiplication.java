import java.util.Scanner;

public class AnyBaseMultiplication {

    public static int Product(int m, int n) {
        int ans = 0;
        int power = 1;
        while (n != 0) {
            int prod = m * (n % 10);
            n /= 10;
            ans += prod * power;
            power *= 10;
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int m = scn.nextInt(), n = scn.nextInt();
        int res = Product(m, n);
        System.out.println(res);
    }

}

import java.util.Scanner;

public class DecimalToAnyBase {

    public static int decimalToAnyBase(int n, int b) {
        int ans = 0;
        int count = 0;
        while (n != 0) {
            int digit = n % b;
            n /= b;
            ans += digit * (int) (Math.pow(10, count));
            count++;
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt(), b = scn.nextInt();
        int res = decimalToAnyBase(n, b);
        System.out.println(res);
    }
}

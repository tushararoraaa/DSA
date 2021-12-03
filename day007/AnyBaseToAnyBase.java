import java.util.Scanner;

public class AnyBaseToAnyBase {
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

    public static int anyBaseToDecimal(int n, int b) {
        int ans = 0;
        int count = 0;
        while (n != 0) {
            int digit = n % 10;
            n /= 10;
            ans += digit * (int) (Math.pow(b, count));
            count++;
        }
        return ans;
    }

    public static int anyBaseToAnyBase(int n1, int b1, int b2) {
        int x = anyBaseToDecimal(n1, b1);
        int y = decimalToAnyBase(x, b2);
        return y;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n1 = scn.nextInt(), b1 = scn.nextInt(), b2 = scn.nextInt();
        int n2 = anyBaseToAnyBase(n1, b1, b2);
        System.out.println(n2);
    }

}

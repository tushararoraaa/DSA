import java.util.Scanner;

public class DecimalSubtraction {
    public static int decimalSubtraction(int n, int m) {
        int ans = 0;
        int power = 1;
        while (n != 0 || m != 0) {
            int x = m % 10;
            m /= 10;
            int y = n % 10;
            n /= 10;
            if (x < y) {
                x += 10;
                m -= 1;
            }
            int sub = x - y;
            ans += sub * power;
            power *= 10;
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println(decimalSubtraction(scn.nextInt(), scn.nextInt()));
    }

}

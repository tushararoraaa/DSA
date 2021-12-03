import java.util.Scanner;

public class AnyBaseSubtraction {

    public static int anyBaseSubtraction(int n, int m, int b) {
        int ans = 0;
        int power = 1;
        boolean a = false;
        while (n != 0 || m != 0) {
            int x = m % 10;
            if (a == true) {
                x--;
                a = false;
            }
            m /= 10;
            int y = n % 10;
            n /= 10;
            if (x < y) {
                x += b;
                if (m % 10 == 0) {
                    a = true;
                } else {
                    m--;
                }
            }
            int sub = x - y;
            ans += sub * power;
            power *= 10;
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println(anyBaseSubtraction(scn.nextInt(), scn.nextInt(), scn.nextInt()));
    }

}

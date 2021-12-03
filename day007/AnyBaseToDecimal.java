import java.util.Scanner;

class AnyBaseToDecimal {

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

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt(), b = scn.nextInt();
        int res = anyBaseToDecimal(n, b);
        System.out.println(res);
    }

}

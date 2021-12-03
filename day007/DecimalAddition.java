import java.util.Scanner;

public class DecimalAddition {

    public static int decimalAddition(int n1, int n2) {
        int ans = 0;
        int carry = 0;
        int power = 1;
        while (n1 != 0 || n2 != 0 || carry != 0) {
            int sum = carry + (n1 != 0 ? n1 % 10 : 0) + (n2 != 0 ? n2 % 10 : 0);
            n1 /= 10;
            n2 /= 10;
            carry = sum / 10;
            sum %= 10;
            ans += sum * power;
            power *= 10;

            // int d1 = n1 % 10;
            // n1 /= 10;
            // int d2 = n2 % 10;
            // n2 /= 10;
            // sum = d1 + d2;
            // fans = (sum + carry) % 10;
            // carry = sum / 10;
            // ans += fans * (int) (Math.pow(10, count));
            // count++;
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n1 = scn.nextInt(), n2 = scn.nextInt();
        int res = decimalAddition(n1, n2);
        System.out.println(res);
    }

}

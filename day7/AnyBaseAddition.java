import java.util.Scanner;

public class AnyBaseAddition {
    public static int anyBaseAddition(int n1, int n2, int b) {
        int ans = 0;
        int carry = 0;
        int power = 1;
        while (n1 != 0 || n2 != 0 || carry != 0) {
            int sum = carry + n1 % 10 + n2 % 10;
            n1 /= 10;
            n2 /= 10;
            carry = sum / b;
            sum %= b;
            ans += sum * power;
            power *= 10;
        }
        return ans;

    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println(anyBaseAddition(scn.nextInt(), scn.nextInt(), scn.nextInt()));
    }

}

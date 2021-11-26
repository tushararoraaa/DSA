import java.util.Scanner;

class decimalToBinary {

    public static int DecimalToBinary(int n) {
        int ans = 0;
        int count = 0;
        while (n != 0) {
            int digit = n % 2;
            n /= 2;
            ans = ans + digit * (int) (Math.pow(10, count));
            count++;
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int res = DecimalToBinary(n);
        System.out.println(res);
    }
}
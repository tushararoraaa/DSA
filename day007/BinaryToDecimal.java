import java.util.Scanner;

class BinaryToDecimal {

    public static int binaryToDecimal(int n) {
        int ans = 0;
        int count = 0;
        while (n != 0) {
            int digit = n % 10;
            n /= 10;
            ans = ans + digit * (int) (Math.pow(2, count));
            count++;
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int res = binaryToDecimal(n);
        System.out.println(res);
    }

}

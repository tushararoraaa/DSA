import java.util.Scanner;

public class PowerLog {

    public static int power(int x, int n) {
        if (n == 0) {
            return 1;
        }

        if (n % 2 == 0) {
            int recAns = power(x, n / 2);
            int myAns = recAns * recAns;
            return myAns;
        } else {
            int recAns = power(x, n / 2);
            int myAns = recAns * recAns * x;
            return myAns;
        }

    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int x = scn.nextInt();
        int n = scn.nextInt();
        int ans = power(x, n);
        System.out.println(ans);
    }
}

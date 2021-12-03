import java.util.Scanner;

public class GCD {

    public static int find_GCD(int num1, int num2) {
        int min = Math.min(num1, num2);
        if (num1 % min == 0 && num2 % min == 0) {
            return min;
        }
        min /= 2;
        while (min >= 2) {
            if (num1 % min == 0 && num2 % min == 0) {
                return min;
            }
            min--;
        }
        return 1;
    }

    public static int GCD_recursion(int num1, int num2) {
        if (num1 == 0) {
            return num2;
        }
        if (num2 == 0) {
            return num1;
        }

        if (num1 > num2)
            return GCD_recursion(num1 - num2, num2);
        return GCD_recursion(num1, num2 - num1);
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num1 = scn.nextInt(), num2 = scn.nextInt();
        int gcd = find_GCD(num1, num2);
        System.out.println(gcd);
        int gcdr = GCD_recursion(num1, num2);
        System.out.println(gcdr);
    }

}

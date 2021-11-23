import java.util.Scanner;

public class LCM {

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

    public static int Lcm(int num1, int num2) {
        int result = (num1 * num2) / find_GCD(num1, num2);
        return result;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num1 = scn.nextInt(), num2 = scn.nextInt();
        int lcm = Lcm(num1, num2);
        System.out.println(lcm);
    }

}

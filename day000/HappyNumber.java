import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class HappyNumber {

    public static int replace(int n) {
        int res = 0;

        while (n != 0) {
            int digit = n % 10;
            n /= 10;
            res += digit * digit;
        }
        return res;
    }

    public static int countDigits(int n) {
        int count = 0;
        while (n != 0) {
            n /= 10;
            count++;
        }
        return count;
    }

    public static boolean isHappy(int n) {
        while (n != 1) {
            n = replace(n);
            if (countDigits(n) == 1 && n != 1 && n != 7) {
                return false;
            }
        }

        return true;
    }

    public static boolean isHappy_set(int n) {
        HashSet<Integer> set = new HashSet<>();
        while (true) {
            n = replace(n);
            if (n == 1) {
                return true;
            }
            if (set.contains(n)) {
                return false;
            }
            set.add(n);
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        System.out.println(isHappy(n));
        System.out.println(isHappy_set(n));
        scn.close();
    }
}

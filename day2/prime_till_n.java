import java.util.*;
import java.util.Scanner;

public class prime_till_n {

    public static boolean isPrime(int n) {
        if (n <= 2) {
            return true;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter low");
        int low = scn.nextInt();
        System.out.println("Enter high");
        int high = scn.nextInt();
        for (int i = low; i <= high; i++) {
            if (isPrime(i)) {
                System.out.println(i);
            }
        }
    }
}

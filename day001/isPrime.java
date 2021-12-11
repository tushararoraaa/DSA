
import java.util.Scanner;

public class isPrime {

    public static boolean isprime(int num) {
        boolean isprime = true;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                isprime = false;
                break;
            }
        }
        return isprime;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();

        if (isprime(n)) {
            System.out.println("It is prime number");
        } else {
            System.out.println("OOPS! Not Prime");
        }
    }
}

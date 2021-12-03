import java.util.Scanner;

public class lecture {

    public static void printTable() {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " X " + i + " = " + (n * i));
        }
    }

    public static void isPrime() {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        boolean prime = true;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                prime = false;
                break;
            }
        }
        if (prime) {
            System.out.println("Prime Number Woohoo");
        } else {
            System.out.println("OOPS! Not a prime number");
        }
    }

    public static int max(int a, int b) {
        if (a >= b) {
            return a;
        } else {
            return b;
        }
    }

    public static void main(String[] args) {
        printTable();
        isPrime();
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt(), b = scn.nextInt();
        int result = max(a, b);
        System.out.println(result);
    }

}

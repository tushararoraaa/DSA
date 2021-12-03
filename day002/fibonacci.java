package day2;

import java.util.Scanner;

public class fibonacci {

    public static int nth_fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return nth_fibonacci(n - 1) + nth_fibonacci(n - 2);
    }

    public static int nth_fibonacci_DP(int n) {
        if (n <= 1) {
            return n;
        }
        int[] arr = new int[n + 1];
        arr[0] = 0;
        arr[1] = 1;
        for (int i = 2; i <= n; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }
        return arr[n];
    }

    public static void print_fibonacci(int n) {

        // using 3 variables

        int x = 0;
        int y = 1;
        if (n < 1) {
            return;
        }
        System.out.println(x);
        for (int i = 1; i < n; i++) {
            System.out.println(y);
            int next = x + y;
            x = y;
            y = next;
        }
    }

    public static void print_fibonacci_improved(int n) {

        // using 2 variables only

        int x = 0;
        int y = 1;
        if (n >= 0) {
            System.out.println(x);
        }
        if (n >= 1) {
            System.out.println(y);
        }
        for (int i = 2; i < n; i++) {
            System.out.println(x + y);
            y = x + y;
            x = y - x;
        }
    }

    public static void print_fibonacci_reverse(int n) {
        int[] arr = new int[n + 1];
        arr[0] = 0;
        arr[1] = 1;
        for (int i = 2; i <= n; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }
        for (int i = n - 1; i >= 0; i--) {
            System.out.println(arr[i]);
        }

    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter N");
        int n = scn.nextInt();
        System.out.println("Recursive:-");
        System.out.println(nth_fibonacci(n));
        System.out.println("DP:-");
        System.out.println(nth_fibonacci_DP(n));
        System.out.println("Using three variables");
        print_fibonacci(n);
        System.out.println("Using two variables");
        print_fibonacci_improved(n);
        System.out.println("Reverse Order");
        print_fibonacci_reverse(n);
    }
}

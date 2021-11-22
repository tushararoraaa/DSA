package day3;

import java.util.Scanner;

public class inverseNumber {

    public static int countDigits(int n) {
        int count = 0;
        while (n != 0) {
            n /= 10;
            count++;
        }
        return count;
    }

    public static void InverseNumber(int n) {
        int x = countDigits(n);
        int[] arr = new int[x + 1];
        int[] arr2 = new int[x + 1];
        for (int i = 1; i <= x; i++) {
            arr[i] = n % 10;
            n = n / 10;

        }

        for (int i = x; i >= 1; i--) {
            int y = arr[i];
            arr2[y] = i;
        }
        for (int i = x; i >= 1; i--) {
            System.out.print(arr2[i]);
        }
    }

    public static void InverseNumberImproved(int n) {
        int lastIndex = 1;
        int result = 0;
        while (n != 0) {
            int lastDigit = n % 10;
            n /= 10;
            result += lastIndex * (Math.pow(10, (lastDigit - 1)));
            lastIndex++;
        }
        System.out.println(result);
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        InverseNumber(n);
        System.out.println("Using improved version");
        InverseNumberImproved(n);

    }

}

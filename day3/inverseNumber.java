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

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
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

}

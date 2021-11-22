package day3;

import java.util.Scanner;

public class rotateNumber {

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
        int n = scn.nextInt(), k = scn.nextInt();
        int x = countDigits(n);
        int[] arr = new int[x];
        for (int i = 0; i < x; i++) {
            arr[i] = n % 10;
            n /= 10;
        }

        for (int i = 0; i < k; i++) {
            int y = arr[0];
            for (int j = 0; j < x; j++) {

                if (j == (x - 1)) {
                    arr[j] = y;
                } else {
                    arr[j] = arr[j + 1];
                }
            }
        }
        for (int i = x - 1; i >= 0; i--) {
            System.out.print(arr[i]);
        }
    }

}

package day2;

import java.util.Scanner;

public class printDigits {

    public static int count_digits(int n) {
        int count = 0;
        for (int i = 1; i < Integer.MAX_VALUE; i = i * 10) {
            if ((n / i) > 0) {
                count++;
            } else {
                break;
            }
        }
        return count;
    }

    public static void print_digits(int n) {
        if (n == 0) {
            return;
        }
        int r = n % 10;
        System.out.println(r);
        print_digits(n / 10);
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        // int j = 10;
        // int counts = count_digits(n);
        // int []arr = new int[counts];
        // for(int i = 0; i<counts; i++){
        // arr[i] = n%j;
        // n = n/j;
        // }
        // for (int i = counts-1; i>=0; i--){
        // System.out.println(arr[i]);
        // }
        int counts = count_digits(n);
        int[] arr = new int[counts];
        int i = 0;
        int r;
        while (n != 0) {
            r = n % 10;
            arr[i] = r;
            i++;
            n = n / 10;

        }
        for (int j = i - 1; j >= 0; j--) {
            System.out.println(arr[j]);
        }

    }
}

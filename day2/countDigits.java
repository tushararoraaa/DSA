package day2;

import java.util.Scanner;

public class countDigits {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int count = 0;
        for (int i = 1; i < Integer.MAX_VALUE; i = i * 10) {
            if ((n / i) > 0) {
                count++;
            } else {
                break;
            }
        }
        System.out.println(count);
    }
}

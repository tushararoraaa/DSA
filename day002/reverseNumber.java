package day2;

import java.util.Scanner;

public class reverseNumber {

    public static int reverse(int n) {
        int answer = 0;
        while (n != 0) {
            int digit = n % 10;
            n /= 10;
            answer = (answer * 10) + digit;
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int result = reverse(n);
        System.out.println(result);
    }

}

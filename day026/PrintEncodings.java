import java.util.Scanner;

public class PrintEncodings {

    public static void printEncodings(String s, String ans) {
        if (s.length() == 0) {
            System.out.println(ans);
            return;
        }

        if (s.charAt(0) == '0') {
            return;
        }

        char ch = s.charAt(0);
        int val = ch - '0';
        printEncodings(s.substring(1), (ans + (char) (val + 'a' - 1))); // FOR ONE DIGIT AT A TIME

        if (s.length() > 1) {
            char ch2 = s.charAt(1);
            int val2 = ch2 - '0';
            int res = val * 10 + val2;
            if (res < 26) {
                printEncodings(s.substring(2), (ans + (char) (res + 'a' - 1))); // FOR TWO DIGITS AT A TIME
            }
        }

    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String s = scn.next();
        printEncodings(s, "");
    }
}

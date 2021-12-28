import java.util.Scanner;

public class PrintSubsequence {

    public static void printSS(String s, String ans) {
        if (s.length() == 0) {
            System.out.println(ans);
            return;
        }
        char ch = s.charAt(0);
        String rest = s.substring(1);
        printSS(rest, ans + ch);
        printSS(rest, ans);
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String s = scn.next();
        printSS(s, "");
    }
}

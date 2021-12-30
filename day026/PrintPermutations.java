import java.util.Scanner;

public class PrintPermutations {

    public static void printPermutations(String s, String ans) {
        if (s.length() == 0) {
            System.out.println(ans);
            return;
        }
        for (int i = 0; i < s.length(); i++) {
            printPermutations(s.substring(0, i) + s.substring(i + 1), ans + s.charAt(i));
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String s = scn.next();
        printPermutations(s, "");
    }
}

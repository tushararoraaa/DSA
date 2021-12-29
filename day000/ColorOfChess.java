import java.util.Scanner;

public class ColorOfChess {

    public static boolean squareIsWhite(String s) {
        char ch1 = s.charAt(0);
        char ch2 = s.charAt(1);
        if ((ch1 % 2 == 0 && ch2 % 2 != 0) || (ch1 % 2 != 0 && ch2 % 2 == 0)) {
            return true;
        } else {
            return false;
        }

    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String s = scn.next();
        System.out.println(squareIsWhite(s));
    }
}

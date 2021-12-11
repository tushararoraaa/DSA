import java.util.Scanner;

public class DifferenceOfASCII {

    public static void difference(String s) {
        String res = "";
        for (int i = 0; i < s.length() - 1; i++) {
            res += s.charAt(i);
            int diff = (int) s.charAt(i + 1) - (int) s.charAt(i);
            res += diff;
        }
        res += s.charAt(s.length() - 1);
        System.out.println(res);
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String s = new String(scn.nextLine());
        difference(s);

    }
}

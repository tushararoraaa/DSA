import java.util.Scanner;

public class ToggleCase {

    public static void toggle(String s) {
        String res = "";
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (Character.isUpperCase(ch)) {
                res += s.toLowerCase().charAt(i);
            } else {
                res += s.toUpperCase().charAt(i);
            }

        }
        System.out.println(res);
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String s = scn.nextLine();
        toggle(s);
    }
}

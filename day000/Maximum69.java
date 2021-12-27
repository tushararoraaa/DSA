import java.util.Scanner;

public class Maximum69 {

    public static int maximum69Number(int n) {
        String s = Integer.toString(n);
        StringBuilder sb = new StringBuilder(s);
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '6') {
                sb.setCharAt(i, '9');
                break;
            }
        }
        String res = sb.toString();
        int resFinal = Integer.parseInt(res);

        // return Integer.parseInt(("" + num).replaceFirst("6", "9")); ONE-LINER
        // SOLUTION
        return resFinal;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        System.out.println(maximum69Number(n));

    }
}

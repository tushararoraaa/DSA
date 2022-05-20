import java.util.*;

public class DuplicateParen {

    public static boolean isDuplicate(String s) {
        Stack<Character> st = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch != ')') {
                st.push(ch);
            } else {
                while (st.peek() != '(') {
                    st.pop();
                }
                st.pop();
            }
        }
        if (!st.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String s = scn.next();
        System.out.println(isDuplicate(s));
    }
}

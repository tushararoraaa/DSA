import java.util.Scanner;
import java.util.Stack;

public class ValidParenthesis {

    public static boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{') {
                st.push(s.charAt(i));
            }
            if (st.isEmpty()) {
                return false;
            }

            if (s.charAt(i) == ')') {
                char ch = st.pop();
                if (ch != '(') {
                    return false;
                }
            }
            if (s.charAt(i) == ']') {
                char ch = st.pop();
                if (ch != '[') {
                    return false;
                }
            }
            if (s.charAt(i) == '}') {
                char ch = st.pop();
                if (ch != '{') {
                    return false;
                }
            }
        }
        if (st.size() == 0) {
            return true;
        } else {
            return false;
        }

    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String s = scn.next();

        System.out.println(isValid(s));
    }
}

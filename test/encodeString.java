import java.util.*;

public class encodeString {

    public static String encode(String s) {
        String res = "";
        String temp = "";
        int x = 0;
        s = s.replace("[", "").replace("]", "");
        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i))) {
                for (int j = 0; j < x; j++) {
                    res += temp;
                }
                temp = "";
                x = Integer.parseInt(String.valueOf(s.charAt(i)));
            } else {
                temp += s.charAt(i);
            }
        }
        for(int i = 0; i<x; i++){
            res += temp;
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String s = scn.next();
        System.out.println(encode(s));
    }
}
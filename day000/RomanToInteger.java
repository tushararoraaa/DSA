import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RomanToInteger {

    public static int convert(String s) {
        if (s == null || s.length() == 0) {
            return -1;
        }

        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        int res = 0;
        for (int i = 1; i < s.length(); i++) {
            char x = s.charAt(i - 1);
            char y = s.charAt(i);
            if (map.get(x) >= map.get(y)) {
                res += map.get(x);
            } else {
                res -= map.get(x);
            }
        }
        res += map.get(s.charAt(s.length() - 1));
        return res;

    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String s = scn.next();
        System.out.println(convert(s));

    }
}

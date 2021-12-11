import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StringCompression {

    public static void compress_1(String s) {
        String res = "";
        res += s.charAt(0);
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                continue;
            } else {
                res += s.charAt(i);
            }
        }
        System.out.println(res);
    }

    public static void compress_2(String s) {
        String res = "";
        res += s.charAt(0);
        res += compress_frequency2(s, s.charAt(0)) > 1 ? compress_frequency2(s, s.charAt(0)) : "";
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                continue;
            } else {
                res += s.charAt(i);
                int dig = compress_frequency2(s, s.charAt(i));
                if (dig != 1) {
                    res += dig;
                }
            }
        }
        System.out.println(res);
    }

    public static int compress_frequency2(String s, char c) {
        Map<Character, Integer> map = new HashMap<>();
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                count = map.get(s.charAt(i));
                map.put(s.charAt(i), count + 1);
            } else {
                map.put(s.charAt(i), 1);
            }
        }
        int result = 0;
        for (Map.Entry<Character, Integer> entry : map.entrySet()) { // To Traverse Hashmap
            if (c == entry.getKey()) {
                result = entry.getValue();
                break;
            }
        }
        return result;

    }

    public static void compress_2_basic(String s) {
        int count = 1;
        String res = "";
        res += s.charAt(0);
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                count++;
            } else {
                res += count > 1 ? count : "";
                res += s.charAt(i);
                count = 1;
            }
        }
        if (count > 1) {
            res += count;
        }
        System.out.println(res);
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String s = new String(scn.nextLine());
        compress_1(s);
        compress_2(s);
        compress_2_basic(s);
    }
}

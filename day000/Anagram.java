import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Anagram {

    public static boolean anagram(String s, String t) {
        HashMap<Character, Integer> map = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();

        if (s.length() != t.length()) {
            return false;
        }
        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                int count = map.get(s.charAt(i));
                map.put(s.charAt(i), count + 1);
            } else {
                map.put(s.charAt(i), 1);
            }

            if (map2.containsKey(t.charAt(i))) {
                int count2 = map2.get(t.charAt(i));
                map2.put(t.charAt(i), count2 + 1);
            } else {
                map2.put(t.charAt(i), 1);
            }
        }
        // System.out.println(map);
        if (map.equals(map2)) {
            return true;
        } else {
            return false;
        }

    }

    public static boolean anagram_improved(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        char temps[] = s.toCharArray();
        char tempt[] = t.toCharArray();
        Arrays.sort(temps);
        Arrays.sort(tempt);
        return Arrays.equals(temps, tempt);
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String s = scn.next();
        String t = scn.next();
        System.out.println(anagram(s, t));
        System.out.println(anagram_improved(s, t));

    }
}

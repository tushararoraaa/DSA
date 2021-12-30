import java.util.HashMap;
import java.util.Scanner;

public class Pangram {

    public static boolean checkIfPangram(String s) {
        if (s.length() < 26) {
            return false;
        } else {
            HashMap<Character, Integer> map = new HashMap<>();
            int count = 0;
            for (int i = 0; i < s.length(); i++) {
                if (!map.containsKey(s.charAt(i))) {
                    map.put(s.charAt(i), 1);
                    count++;
                } 
            }
            return count == 26 ? true : false;
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String s = scn.next();
        System.out.println(checkIfPangram(s));
    }
}

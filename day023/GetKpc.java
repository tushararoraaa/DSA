import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class GetKpc {

    public static ArrayList<String> getKPC(String s, Map<Character, String> map) {

        if (s.length() == 0) {
            ArrayList<String> base = new ArrayList<>();
            base.add("");
            return base;
        }
        char ch = s.charAt(0);
        String rest = s.substring(1);

        ArrayList<String> recAns = getKPC(rest, map);
        ArrayList<String> result = new ArrayList<>();

        int t = recAns.size();
        String from = map.get(ch);

        for (int i = 0; i < from.length(); i++) {
            for (int j = 0; j < t; j++) {
                result.add(from.charAt(i) + recAns.get(j));
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String s = scn.next();
        Map<Character, String> map = new HashMap<>();
        map.put('0', ".;");
        map.put('1', "abc");
        map.put('2', "def");
        map.put('3', "ghi");
        map.put('4', "jkl");
        map.put('5', "mno");
        map.put('6', "pqrs");
        map.put('7', "tu");
        map.put('8', "vwx");
        map.put('9', "yz");
        ArrayList<String> res = getKPC(s, map);
        System.out.println(res);

    }
}

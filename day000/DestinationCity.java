import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class DestinationCity {

    public static String destCity(List<List<String>> paths) {
        String res = "";
        HashMap<String, String> map = new HashMap<>();
        for (List<String> ele : paths) {
            map.put(ele.get(0), ele.get(1));
        }

        for (String s : map.keySet()) {
            if (map.containsKey(map.get(s))) {
                continue;
            } else {
                res += map.get(s);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        List<List<String>> li = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String s1 = scn.next();
            String s2 = scn.next();
            List<String> temp = new ArrayList<>();
            temp.add(s1);
            temp.add(s2);
            li.add(temp);
        }
        String res = destCity(li);
        System.out.println("Ans" + res);
    }
}

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class ContainsDuplicate {

    public static boolean containsDuplicate(int[] arr) {

        boolean dup = false;
        int count = 0;
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])) {
                count = map.get(arr[i]);
                map.put(arr[i], count + 1);
                dup = true;
                // break; //if you just want to check it contains duplicate
            } else {
                map.put(arr[i], 1);
            }
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) { // To Traverse Hashmap
            System.out.println(entry.getKey() + "->" + entry.getValue());
        }
        return dup;
    }

    public static boolean containsDuplicate_Hashset(int[] arr) { // Using Hashset

        final Set<Integer> distinct = new HashSet<Integer>();
        for (int num : arr) {
            if (distinct.contains(num)) {
                return true;
            }
            distinct.add(num);
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }
        System.out.println(containsDuplicate(arr));
        System.out.println(containsDuplicate_Hashset(arr));

    }
}

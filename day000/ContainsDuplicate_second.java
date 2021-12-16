import java.util.HashMap;
import java.util.Scanner;

public class ContainsDuplicate_second {

    public static boolean duplicate(int[] arr, int k) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j] && (((i - j) < 0) ? -(i - j) : (i - j)) <= k) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean duplicate_map(int[] arr, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])) {
                int r = (map.get(arr[i]) - i) < 0 ? -(map.get(arr[i]) - i) : (map.get(arr[i]) - i);
                if (r <= k) {
                    return true;
                } else {
                    map.put(arr[i], i);
                }
            } else {
                map.put(arr[i], i);
            }
        }

        return false;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        int k = scn.nextInt();
        System.out.println(duplicate(arr, k));
        System.out.println(duplicate_map(arr, k));
    }
}

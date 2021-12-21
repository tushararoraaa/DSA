import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MajorityElement {

    public static int majority(int[] arr) {
        int n = arr.length;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])) {
                int count = map.get(arr[i]);
                map.put(arr[i], count + 1);
            } else {
                map.put(arr[i], 1);
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (map.get(arr[i]) > n / 2) {
                return arr[i];
            }
        }
        return -1;
    }

    public static int majority_sorting(int[] arr) { // NICE LOGIC 🙌 iF a nUMBER is in array for n/2 times for sure than
                                                    // it'll be at n/2 position for sure 🙏
        Arrays.sort(arr);
        return arr[arr.length / 2];

    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }
        System.out.println(majority(arr));
        System.out.println(majority_sorting(arr));
    }
}

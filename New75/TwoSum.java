import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TwoSum {

    // 1 Arrays

    public static void two_Sum(int[] arr, int target) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j <= arr.length - 1; j++) {
                if (arr[i] + arr[j] == target) {
                    System.out.println(i);
                    System.out.println(j);
                }
            }
        }
    }

    public static int[] twoSum_optimized(int[] arr, int target) {
        int[] C = new int[2];
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();

        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(target - arr[i])) {
                C[0] = map.get(target - arr[i]);
                C[1] = i;
                break;
            }
            map.put(arr[i], i);
        }
        return C;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        System.out.println("Enter target");
        int target = scn.nextInt();
        // two_Sum(arr, target);
        int[] result = twoSum_optimized(arr, target);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }

}

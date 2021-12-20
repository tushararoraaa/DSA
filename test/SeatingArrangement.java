import java.util.*;

public class Main {

    public static int searchInsert(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;
        int result = 0;

        if (target > arr[arr.length - 1] && target > 0) {
            return arr.length;
        } else if (target < arr[0] && target > 0) {
            return 0;
        } else {
            while (low <= high) {
                int mid = (low + high) / 2;
                if (target == arr[mid]) {
                    return mid;
                } else if (target > arr[mid]) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
            return high + 1;

        }
    }

    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }

        int target = scn.nextInt();
        System.out.println(searchInsert(arr, target));
    }
}
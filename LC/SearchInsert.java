import java.util.Scanner;

public class SearchInsert {

    // 35 Array
    public static int searchInsert(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;
        int result = 0;
        if (target > arr[high]) {
            return high + 1;
        } else if (target <= arr[low]) {
            return low;
        } else {
            while (low <= high) {
                int mid = (low + high) / 2;
                if (target == arr[mid]) {
                    result = mid;
                    return result;
                } else if (target > arr[mid]) {
                    low = mid + 1;
                    result = mid + 1;

                } else {
                    high = mid - 1;
                    result = mid;
                }
            }
            return result;
        }

    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        System.out.println("Enter target Value");
        int target = scn.nextInt();
        System.out.println(searchInsert(arr, target));
    }

}

import java.util.Scanner;

public class BinarySearch {
    public static int binarySearch_helper(int[] arr, int x, int low, int high) {
        if (high >= 1 && low < arr.length - 1) {
            int mid = (low + high) / 2;
            if (x == arr[mid]) {
                return mid;
            }
            if (x > arr[mid]) {
                return binarySearch_helper(arr, x, mid, arr.length);
            } else {
                return binarySearch_helper(arr, x, low, mid - 1);
            }
        }

        return -1;

    }

    public static int binarySearch_Recursive(int[] arr, int x) {
        return binarySearch_helper(arr, x, 0, arr.length);
    }

    public static int binarySearch_Iterative(int[] arr, int x) {
        int low = 0, high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (x == arr[mid]) {
                return mid;
            }
            if (x > arr[mid]) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }
        System.out.println("Enter element to search");
        int x = scn.nextInt();
        System.out.println(binarySearch_Recursive(arr, x));
        System.out.println(binarySearch_Iterative(arr, x));
    }

}

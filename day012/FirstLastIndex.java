import java.util.Scanner;

public class FirstLastIndex {

    public static int firstIndex(int[] arr, int x) {
        int low = 0, high = arr.length - 1;
        int FI = 0;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == x) {
                FI = mid;
                high = mid - 1;
            } else if (x > arr[mid]) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return FI;
    }

    public static int lastIndex(int[] arr, int x) {
        int low = 0, high = arr.length - 1;
        int FI = 0;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == x) {
                FI = mid;
                low = mid + 1;
            } else if (x > arr[mid]) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return FI;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        int x = scn.nextInt();
        System.out.println(firstIndex(arr, x));
        System.out.println(lastIndex(arr, x));
    }

}

import java.util.Scanner;

public class CeilAndFloor {

    public static void ceilAndFloor(int[] arr, int x) {
        int low = 0, high = arr.length - 1;
        int result = 0;
        boolean f = false;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (x == arr[mid]) {
                f = true;
                result = mid;
                break;
            } else {
                if (x > arr[mid]) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
            result = mid;
        }
        if (f) {
            System.out.println(arr[result]);
        } else {
            System.out.println(arr[result]);
            System.out.println(arr[result - 1]);
        }

    }

    public static void ceilAndFloor_improved(int[] arr, int x) {
        int low = 0, high = arr.length - 1;
        int ceil = 0, floor = 0;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (x > arr[mid]) {
                low = mid + 1;
                floor = arr[mid];
            } else if (x < arr[mid]) {
                high = mid - 1;
                ceil = arr[mid];
            } else {
                floor = arr[mid];
                ceil = arr[mid];
                break;
            }
        }
        System.out.println(ceil);
        System.out.println(floor);
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        System.out.println("Enter Denomination");
        int x = scn.nextInt();
        // ceilAndFloor(arr, x);
        // System.out.println(arr[res]);
        // System.out.println(arr[res + 1]);
        ceilAndFloor_improved(arr, x);
    }

}

import java.util.Scanner;

public class StrictlyIncreasing {

    public static int minOperations(int[] arr) {
        int count = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] <= arr[i - 1]) {
                count = count + arr[i - 1] - arr[i] + 1;
                arr[i] = arr[i - 1] + 1;

            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }
        System.out.println(minOperations(arr));
    }
}

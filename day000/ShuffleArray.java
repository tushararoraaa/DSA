import java.util.Scanner;

public class ShuffleArray {

    public static void shuffleArray(int[] arr, int n) {

        int[] C = new int[arr.length];
        for (int i = 0, j = 0; i < arr.length; i += 2, j++) {
            C[i] = arr[j];
        }
        for (int i = 1, j = arr.length / 2; i < arr.length; i += 2, j++) {
            C[i] = arr[j];
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(C[i] + " ");
        }

    }

    public static void main(String[] args) {
        // 1470
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] nums = new int[2 * n];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = scn.nextInt();
        }
        shuffleArray(nums, n);
    }

}

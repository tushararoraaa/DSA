import java.util.*;

public class SumsOfAllSubsets {

    public static void printSums(int[] arr, int idx, int sum) {
        if (idx == arr.length) {
            System.out.print(sum + " ");
            return;
        }
        printSums(arr, idx + 1, sum + arr[idx]); // INCKUDED
        printSums(arr, idx + 1, sum); // EXCLUDED

    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }
        printSums(arr, 0, 0);
    }
}

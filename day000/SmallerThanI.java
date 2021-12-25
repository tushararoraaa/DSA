import java.util.Arrays;
import java.util.Scanner;

public class SmallerThanI {

    public static int[] smallerNumbersThanCurrent(int[] arr) {
        int[] res = new int[arr.length];
        for (int i = 0; i < res.length; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    count++;
                }
            }
            res[i] = count;
        }
        return res;

    }

    public static int[] smallerNumbersThanCurrent_improved(int[] arr) {
        int[] res = new int[arr.length];
        Arrays.sort(arr);
        
        return res;

    }

    // 1365
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }

        int[] res = smallerNumbersThanCurrent(arr);
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i] + " ");
        }
        int[] res2 = smallerNumbersThanCurrent_improved(arr);
        for (int i = 0; i < res2.length; i++) {
            System.out.print(res2[i] + " ");
        }
    }
}

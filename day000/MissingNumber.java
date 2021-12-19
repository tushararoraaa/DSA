import java.util.Arrays;
import java.util.Scanner;

public class MissingNumber {

    public static int missing(int[] arr) {
        int n = arr.length;
        int res = n;
        // if (n == 1) {
        //     if (arr[0] == 0) {
        //         return 1;
        //     } else {
        //         return 0;
        //     }
        // }
        
        
        Arrays.sort(arr);
        for (int i = 0; i < n; i++) {
            if (arr[i] != i) {
                return i;
            }

        }
        return res;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }

        System.out.println(missing(arr));
    }
}

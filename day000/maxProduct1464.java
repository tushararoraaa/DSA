import java.util.Arrays;
import java.util.Scanner;

public class maxProduct1464 {

    public static int maxProduct(int[] arr) {
        Arrays.sort(arr);
        return (arr[arr.length-1] - 1) * (arr[arr.length - 2] - 1);
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }
        System.out.println(maxProduct(arr));
    }
}

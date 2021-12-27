import java.util.ArrayList;
import java.util.Scanner;

public class KidsWithCandies {

    public static ArrayList<Boolean> kidsWithCandies(int[] arr, int extra) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            max = Math.max(arr[i], max);
        }
        ArrayList<Boolean> res = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (extra + arr[i] >= max) {
                res.add(true);
            } else {
                res.add(false);
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
        System.out.println("Enter no of extra candies");
        int extra = scn.nextInt();
        ArrayList<Boolean> res = kidsWithCandies(arr, extra);
        System.out.println(res);
    }
}

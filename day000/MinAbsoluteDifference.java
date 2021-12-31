import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class MinAbsoluteDifference {

    public static ArrayList<ArrayList<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        int diff = Integer.MAX_VALUE;
        for (int i = 1; i < arr.length; i++) {
            diff = Math.min(diff, arr[i] - arr[i - 1]);
        }
        ArrayList<ArrayList<Integer>> aList = new ArrayList<ArrayList<Integer>>();
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] - arr[i - 1] == diff) {
                ArrayList<Integer> a = new ArrayList<>();
                a.add(arr[i - 1]);
                a.add(arr[i]);
                aList.add(a);
            }
        }
        return aList;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }
        ArrayList<ArrayList<Integer>> res = minimumAbsDifference(arr);
        System.out.println(res);

    }
}

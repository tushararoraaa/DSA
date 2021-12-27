import java.util.HashMap;
import java.util.Scanner;

public class DegreeOfArray {

    public static int getDegree(int[] arr, int start, int end) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int degree = 0;
        for (int i = start; i < end; i++) {
            if (map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i]) + 1);
                degree = Math.max(degree, map.get(arr[i]));
            } else {
                map.put(arr[i], 1);
            }
        }
        return degree;
    }

    // public static int findShortestSubArray(int[] arr) {
    // int degreeOfMain = getDegree(arr, 0, arr.length);
    // int length = Integer.MAX_VALUE;

    // for (int i = 0; i < arr.length; i++) {
    // for (int j = i; j < arr.length; j++) {
    // int[] res = new int[j - i + 1];
    // for (int k = i, t = 0; k <= j; k++, t++) {
    // res[t] = arr[k];
    // }
    // if (degreeOfMain == getDegree(res, 0, res.length)) {
    // length = Math.min(length, res.length);
    // }
    // }
    // }

    // return length;

    // }

    public static int findShortestSubArray_improved(int[] arr) { // PRODUCES TLE DUE TO TWO LOOPS HENCE ONE MORE MAP IS
                                                                 // REQUIRED
        int degreeOfMain = getDegree(arr, 0, arr.length);

        int length = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                int deg = getDegree(arr, i, j + 1);
                if (deg == degreeOfMain) {
                    length = Math.min(length, j - i + 1);
                }
            }
        }
        return length;

    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }
        System.out.println(findShortestSubArray_improved(arr));

    }
}

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class BuildArray {

    // 1441

    public static ArrayList<String> buildArray(int[] arr, int n) {
        int[] help = new int[n];
        for (int i = 0; i < help.length; i++) {
            help[i] = i + 1;
        }
        ArrayList<String> res = new ArrayList<>();
        int i = 0;
        int j = 0;
        while (j < arr.length) {
            if (help[i] == arr[j]) {
                res.add("Push");
                j++;
            } else {
                res.add("Push");
                res.add("Pop");
            }
            i++;
        }

        return res;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int s = scn.nextInt();
        int[] arr = new int[s];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }
        System.out.println("Enter N");
        int n = scn.nextInt();
        ArrayList<String> res = buildArray(arr, n);
        System.out.println(res);
    }

}

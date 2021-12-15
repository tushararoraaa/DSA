import java.util.Scanner;

public class StringOperations {
    // 2011

    public static int finalValueAfterOperations(String[] arr) {
        int x = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals("X++") || arr[i].equals("++X")) {
                x++;
            } else {
                x--;
            }
        }
        return x;

    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        String[] arr = new String[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.next();
        }
        // for (int i = 0; i < arr.length; i++) {
        // System.out.println(arr[i]);
        // }
        int res = finalValueAfterOperations(arr);
        System.out.println(res);
    }
}

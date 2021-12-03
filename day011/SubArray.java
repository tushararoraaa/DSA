import java.util.Scanner;

public class SubArray {

    public static void subArray(int[] arr) {

        for (int start = 0; start < arr.length; start++) {
            for (int end = start; end < arr.length; end++) {
                for (int k = start; k <= end; k++) {
                    System.out.print(arr[k] + "\t");
                }
                System.out.println();
            }

        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }
        subArray(arr);
    }

}

import java.util.Scanner;

public class SubsetOfArray {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }

        int numSubsets = (int) Math.pow(2, arr.length);

        for (int i = 0; i < numSubsets; i++) {
            int temp = i;
            String ans = "";

            for (int j = arr.length - 1; j >= 0; j--) {
                int digit = temp % 2;
                temp /= 2;
                if (digit == 0) {
                    ans = "_\t" + ans;
                } else {
                    ans = arr[j] + "\t" + ans;
                }
            }

            System.out.println(ans);
        }
    }

}

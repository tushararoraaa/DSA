import java.util.Scanner;

public class SumOfTwoArrays {

    public static int[] sumOfTwoArrays(int[] arr1, int[] arr2) {
        int i = arr1.length - 1;
        int j = arr2.length - 1;
        int[] c = new int[Math.max(i, j) + 1];
        int k = c.length - 1;
        int carry = 0;
        while (k >= 0) {
            int sum = carry + (i < 0 ? 0 : arr1[i]) + (j < 0 ? 0 : arr2[j]);
            c[k] = sum % 10;
            carry = sum / 10;
            i--;
            j--;
            k--;
        }
        if (carry != 0) {
            System.out.println(carry);
        }
        return c;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n1 = scn.nextInt();
        int[] arr1 = new int[n1];
        for (int i = 0; i < n1; i++) {
            arr1[i] = scn.nextInt();
        }
        int n2 = scn.nextInt();
        int[] arr2 = new int[n2];
        for (int i = 0; i < n2; i++) {
            arr2[i] = scn.nextInt();
        }
        int[] arr3 = sumOfTwoArrays(arr1, arr2);
        for (int i = 0; i < arr3.length; i++) {
            System.out.println(arr3[i]);
        }

    }

}

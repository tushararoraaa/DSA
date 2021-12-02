import java.util.Scanner;

public class DifferenceOfTwoArrays {

    public static int[] differenceOfTwoArrays(int[] arr1, int[] arr2) {
        int i = arr1.length - 1;
        int j = arr2.length - 1;
        // HERE ARR2 IS BIGGER AS ASSUMPTION
        int[] res = new int[arr2.length];
        int k = res.length - 1;
        int borrow = 0;

        while (j >= 0) {
            int diff = borrow + arr2[j] - (i < 0 ? 0 : arr1[i]);
            if (diff < 0) {
                diff += 10;
                borrow = -1;
            } else {
                borrow = 0;
            }
            res[k] = diff;
            i--;
            j--;
            k--;
        }

        return res;
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
        int[] arr3 = differenceOfTwoArrays(arr1, arr2);

        int start = -1;
        for (int i = 0; i < arr3.length; i++) {
            if (arr3[i] != 0) {
                start = i;
                break;
            }
        }
        if (start == -1) {
            System.out.println("0");
        } else {
            for (int i = start; i < arr3.length; i++) {
                System.out.println(arr3[i]);
            }

        }

    }

}

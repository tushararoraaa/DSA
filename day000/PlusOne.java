import java.util.Scanner;

public class PlusOne {

    public static int countDigits(int n) {
        int count = 0;
        while (n != 0) {
            n /= 10;
            count++;
        }
        return count;
    }

    public static int[] plusOne(int[] arr) {
        int n = arr.length;
        if (arr[n - 1] != 9) {
            arr[n - 1] += 1;
            return arr;
        } else {
            int newNum = 0;
            int pow = 1;
            for (int i = arr.length - 1; i >= 0; i--) {
                int digit = arr[i];
                newNum += digit * pow;
                pow *= 10;
            }
            newNum += 1;
            int count = countDigits(newNum);
            int[] res = new int[count];
            for (int i = count - 1; i >= 0; i--) {
                int digit = newNum % 10;
                newNum /= 10;
                res[i] = digit;
            }
            return res;
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        int[] res = plusOne(arr);
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i] + " ");
        }
    }
}

import java.util.Scanner;

public class ReverseString {

    public static void reverseString(char[] arr) {
        String res = "";
        for (int i = arr.length - 1; i >= 0; i--) {
            res += arr[i];
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = res.charAt(i);
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }

    public static void reverseString_improved(char[] arr) {
        int i = 0;
        int j = arr.length - 1;
        while (i <= j) {
            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }

        for (int k = 0; k < arr.length; k++) {
            System.out.println(arr[k]);
        }

    }

    public static void reverseString_recursion(char[] arr) {
        reverseString_helper(arr, 0, arr.length - 1);
    }

    public static void reverseString_helper(char[] arr, int i, int j) {
        if (i >= j) {
            return;
        }
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        reverseString_helper(arr, i + 1, j - 1);
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String s = scn.nextLine();
        char[] arr = new char[s.length()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.charAt(i);
        }
        reverseString_recursion(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }
}

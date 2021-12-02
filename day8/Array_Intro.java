import java.util.*;

public class Array_Intro {
    public static Scanner scn = new Scanner(System.in);

    public static void takeInput(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt(); // GETTERS
        }
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " "); // SETTERS
        }
        System.out.println();
    }

    public static boolean findElement(int[] arr, int x) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                return true;
            }
        }
        return false;
    }

    public static int maximum(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            max = Math.max(max, arr[i]); // Math.max works in O(1)
        }
        // for (int i = 0; i < arr.length; i++) {
        // if (arr[i] > max) {
        // max = arr[i];
        // }
        // }
        return max;
    }

    public static int minimum(int[] arr) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            min = Math.min(min, arr[i]); // Math.min works in O(1)
        }
        // for (int i = 0; i < arr.length; i++) {
        // if (arr[i] < min) {
        // min = arr[i];
        // }
        // }
        return min;
    }

    // 1 2 3 4 5r 5 5 5 5 2 3 4 5 6 find first index of 5
    public static int firstIndex(int[] arr, int x) {
        int index = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                index = i;
                break;
            }
        }
        return index;
    }

    // 1 2 3 4 4 4 4 4 4 5 5 5 6 6 6 6 7 7 7 find last index of 6
    public static int lastIndex(int[] arr, int x) {
        int index = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                index = i;
            }
        }
        return index;
    }

    public static void main(String[] args) {

        int n = scn.nextInt();
        int[] arr = new int[n];
        takeInput(arr);
        printArray(arr);
        System.out.println("Enter element to search in Array");
        int a = scn.nextInt();
        System.out.println(findElement(arr, a));
        System.out.println("maximum value in array = " + maximum(arr));
        System.out.println("minimum value in array = " + minimum(arr));
        System.out.println("Enter element for first Index");
        int x = scn.nextInt();
        System.out.println("First index of " + x + " is " + firstIndex(arr, x));
        System.out.println("Enter element for last Index");
        int y = scn.nextInt();
        System.out.println("Last index of " + y + " is " + lastIndex(arr, y));
    }
}

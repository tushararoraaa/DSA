import java.util.Scanner;

public class LastIndex { // FIRST FIND THEN CALL

    public static int lastIndex(int[] arr, int idx, int x) {
        if (idx < 0) {
            return -1;
        }
        if (arr[idx] == x) {
            return idx;
        } else {
            return lastIndex(arr, idx - 1, x);
        }

    }

    public static int lastIndex_better(int[] arr, int idx, int x) { // FIRST CALL THEN FIND
        if (idx == arr.length) {
            return -1;
        }

        int li = lastIndex_better(arr, idx + 1, x);
        if (li == -1) {
            if (arr[idx] == x) {
                return idx;
            } else {
                return li;
            }
        } else {
            return li;
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }
        int x = scn.nextInt();
        int li = lastIndex(arr, arr.length - 1, x);
        System.out.println(li);
        int li2 = lastIndex_better(arr, 0, x);
        System.out.println(li2);
    }
}

import java.util.*;

public class Main {

    // ~~~~~~~~~~~~~~~User''s Section~~~~~~~~~~~~~~~~~
    public static int firstMissingPositive(int[] arr) {
        // write your code here
        int minPos = 1;
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0 && arr[i] != minPos) {
                return minPos;
            } else if (arr[i] > 0 && arr[i] == minPos) {
                minPos++;
            }
        }
        return minPos;
    }

    // ~~~~~~~~~~~~~Input Management~~~~~~~~~~~~~~~
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }

        int res = firstMissingPositive(arr);
        System.out.println(res);
    }
}
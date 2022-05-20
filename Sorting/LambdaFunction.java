import java.util.*;

public class LambdaFunction {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int[][] arr = { { 1, 2 }, { 8, 10 }, { 5, 6 }, { 12, 15 }, { 4, 9 } };

        Arrays.sort(arr, (a, b) -> {
            return a[0] - b[0];
        });

        // Arrays.sort(arr,(a,b)->{
        // return b[0]-a[0];
        // });

        // Arrays.sort(arr,(a,b)->{
        // return a[1]-b[1];
        // });

        // Arrays.sort(arr,(a,b)->{
        // return b[1]-a[1];
        // });

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}

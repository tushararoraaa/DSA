import java.util.Scanner;

public class Saddle {

    public static void saddlePrice(int[][] arr) {
        boolean found = false;
        for (int i = 0; i < arr.length; i++) {
            int min = Integer.MAX_VALUE;
            int max = Integer.MIN_VALUE;
            int result = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i][j] < min) {
                    min = arr[i][j];
                    result = j;
                }
            }
            for (int j = 0; j < arr.length; j++) {
                if (arr[j][result] > max) {
                    max = arr[j][result];
                }
            }
            if (min == max) {
                found = true;
                System.out.println(max);
            }

        }
        if (!found) {
            System.out.println("Invalid input");
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[][] arr = new int[n][n];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = scn.nextInt();
            }
        }
        saddlePrice(arr);
    }
}

import java.util.Scanner;

public class RodCutting {

    public static int maxProfit(int[] len, int[] price, int n, int lenOfRod) {
        int[][] t = new int[n + 1][lenOfRod + 1];
        for (int i = 0; i < t.length; i++) {
            for (int j = 0; j < t[0].length; j++) {
                if (i == 0 || j == 0) {
                    t[i][j] = 0;
                } else if (len[i - 1] <= j) {
                    t[i][j] = Math.max(price[i - 1] + t[i][j - len[i - 1]], t[i - 1][j]);
                } else {
                    t[i][j] = t[i - 1][j];
                }
            }
        }
        return t[n][lenOfRod];
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int lenOfRod = scn.nextInt();
        int n = scn.nextInt();
        int[] len = new int[n];
        for (int i = 0; i < len.length; i++) {
            len[i] = scn.nextInt();
        }
        int[] price = new int[n];
        for (int i = 0; i < price.length; i++) {
            price[i] = scn.nextInt();
        }

        System.out.println(maxProfit(len, price, n, lenOfRod));
    }
}

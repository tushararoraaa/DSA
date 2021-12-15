import java.util.Scanner;

public class StockPrice {

    public static int stock(int[] arr) {
        int profit = 0;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            } else if (arr[i] > min) {
                profit = Math.max(profit, arr[i] - min);
            }
        }
        return profit;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] prices = new int[n];
        for (int i = 0; i < n; i++) {
            prices[i] = scn.nextInt();
        }
        int res = stock(prices);
        System.out.println(res);
    }
}

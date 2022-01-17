import java.util.Scanner;

public class PowerSum {

    public static int checkRecursive(int x, int n, int start) {
        int num = (int) Math.pow(start, n);
        if(x == num){
            return 1;
        }
        if(x<num){
            return 0;
        }
        int include = checkRecursive(x-num, n, start+1);
        int exclude = checkRecursive(x, n, start+1);
        return include+exclude;
    }

    public static int possibleComb(int x, int n) {
        return checkRecursive(x, n, 1);
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int x = scn.nextInt();
        int n = scn.nextInt();
        System.out.println(possibleComb(x, n));
    }
}

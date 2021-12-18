import java.util.Scanner;

public class hello {

    public static int count(int n) {
        int count = 0;
        while (n > 0) {
            n /= 10;
            count++;
        }
        return count;
    }

    public static void reverse(int n) {
        while (n > 0) {
            System.out.println(n % 10);
            n /= 10;
        }
    }

    public static void rotate(int n, int k) {
        int len = count(n);
        k %= len;
        if(k<0){
            k += len;
        }
        
        int a = n % (int) Math.pow(10, k);
        int b = n / (int) Math.pow(10, k);
        System.out.println(a * (int) Math.pow(10, len - k) + b);
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int k = scn.nextInt();
        rotate(n, k);
    }
}

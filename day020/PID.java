import java.util.Scanner;

public class PID {

    public static void pid(int n) {
        if (n == 0) {
            return;
        }
        System.out.println(n);
        pid(n - 1);
        System.out.println(n);

    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        pid(n);
    }
}

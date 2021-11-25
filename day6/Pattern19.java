import java.util.Scanner;

public class Pattern19 {

    public static void Pattern(int n) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + "*" + i + "=" + n * i);
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        Pattern(n);
    }

}

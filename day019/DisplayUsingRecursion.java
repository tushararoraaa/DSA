import java.util.Scanner;

public class DisplayUsingRecursion {

    public static void display(int n) {
        if (n <= 6) {
            System.out.println(n);
            display(n + 1);
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        display(1);
    }
}

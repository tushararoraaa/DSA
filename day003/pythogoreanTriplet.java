import java.util.Scanner;

public class pythogoreanTriplet {

    public static boolean PythogoreanTriplet(int a, int b, int c) {
        if (a * a == b * b + c * c || b * b == c * c + a * a || c * c == a * a + b * b) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt(), b = scn.nextInt(), c = scn.nextInt();
        boolean n = PythogoreanTriplet(a, b, c);
        System.out.println(n);
    }

}

import java.util.Scanner;

public class DefangingIP {

    public static void defang(String s) {
        System.out.println(s.replace(".", "[.]"));
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String s = scn.nextLine();
        defang(s);
    }
}

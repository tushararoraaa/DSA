import java.util.Scanner;

public class SplitAtSpaces {

    public static void splitAt(String s) {
        String[] splitted = s.split(" ");

        for (int i = 0; i < splitted.length; i++) {
            System.out.println(splitted[i]);
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String s = scn.nextLine();
        // char ch = scn.next().charAt(0); // how to take input ch from user
        splitAt(s, ch);

    }
}

import java.util.Scanner;

public class String_Intro {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String s = scn.nextLine();
        System.out.println(s);
        System.out.println("Hello Tushar" + 10 + 20 + 30); // Left to Right Traversal is done
        System.out.println(10 + 20 + 30 + "Hello Tushar"); // Left to Right Traversal is done

        String s2 = scn.nextLine();
        System.out.println(s2.substring(3, s2.length())); // To find substring NOTE:- LastIndex is not included
        System.out.println(s2.substring(4));

        String s3 = "Hello";
        s3 += " "; // Character can be added using '';
        s3 += 'W';
        s3 += 'o';
        s3 += "r"; // String can be added using " ";
        s3 += "l";
        s3 += "d";
        s3 += 12;
        s3 += 15;
        // char ch = scn.next().charAt(0); // to take input from user of character

        System.out.println(s3);

    }
}

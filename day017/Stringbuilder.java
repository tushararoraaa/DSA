import java.util.Scanner;

public class Stringbuilder {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        StringBuilder sb = new StringBuilder(scn.nextLine());
        sb.append(" boy");
        System.out.println(sb);
        StringBuilder sb2 = new StringBuilder("Hello");
        sb2.deleteCharAt(0); // ello
        sb2.append('i'); // elloi
        sb2.delete(0, 2); // loi
        sb2.reverse(); // iol
        sb2.setCharAt(2, 't'); // iot
        System.out.println(sb2);
    }

}

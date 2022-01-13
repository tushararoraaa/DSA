import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class PermutationsOfString {

    public static void printPermutations(String s, String ans) {
        if (s.length() == 0) {
            System.out.print(ans + " ");
            return;
        }
        for (int i = 0; i < s.length(); i++) {
            printPermutations(s.substring(0, i) + s.substring(i + 1), ans + s.charAt(i));
        }

    }

    static HashSet<String> set = new HashSet<>();

    public static void printPermutations_withoutDuplicates(String s, String ans) { // HERE WE USED HASHSET TO AVOID
                                                                                   // DUPLICATES
        if (s.length() == 0) {
            set.add(ans);
            return;
        }
        for (int i = 0; i < s.length(); i++) {
            printPermutations_withoutDuplicates(s.substring(0, i) + s.substring(i + 1), ans + s.charAt(i));
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String s = scn.next();
        printPermutations(s, "");
        printPermutations_withoutDuplicates(s, "");
        System.out.println();
        System.out.println("Using Set:- ");
        for (String ele : set) {
            System.out.print(ele + " ");
        }

    }
}

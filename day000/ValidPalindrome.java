import java.util.Scanner;

public class ValidPalindrome {

    public static String removeNonAlphanumeric(String str) {

        str = str.replaceAll("[^a-zA-Z0-9]", "");
        return str;
    }

    public static boolean palindrome(String s) {
        s = s.toLowerCase();
        s = removeNonAlphanumeric(s);
        // String t = "";
        // for (int i = s.length() - 1; i >= 0; i--) {
        //     t += s.charAt(i);
        // }
        int i = 0;
        int j = s.length()-1;
        while(i<=j){
            if(s.charAt(i)==s.charAt(j)){
                i++;
                j--;
            }else{
                return false;
            }
        }
        return true;

    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String s = scn.nextLine();
        System.out.println(palindrome(s));
    }
}

import java.util.Scanner;

public class ShuffleString {

    public static String restoreString(String s, int[] arr) {
        StringBuilder sb = new StringBuilder(s);
        for (int i = 0; i < s.length(); i++) {
            sb.setCharAt(arr[i], s.charAt(i));
        }
        String res = sb.toString();
        return res;
    }

   
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String s = scn.next();
        int[] arr = new int[s.length()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }

        String res = restoreString(s, arr);
        System.out.println(res);
        scn.close();

    }
}

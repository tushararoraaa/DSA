import java.util.ArrayList;
import java.util.Scanner;

public class Subsequence_recursion {

    public static ArrayList<String> getSubsequence(String s){
        if(s.length()==0){
            ArrayList<String> base = new ArrayList<>();
            base.add("");
            return base;
        }
        char ch = s.charAt(0);
        String rest = s.substring(1);
        ArrayList<String> res = getSubsequence(rest);
        int t = res.size();
        for(int j = 0; j<t;j++){
            res.add(ch + res.get(j));
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String s = scn.nextLine();
        ArrayList<String> res = getSubsequence(s);
        System.out.println(res);

    }
}
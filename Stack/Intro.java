import java.util.*;

public class Intro {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        Stack<Integer> st = new Stack<Integer>();
        for(int i = 0; i<n; i++){
          int x = scn.nextInt();
          st.push(x);
        }
        System.out.println(st);
    }
}

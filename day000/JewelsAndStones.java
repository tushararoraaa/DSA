import java.util.HashSet;
import java.util.Scanner;

public class JewelsAndStones {

    public static int numJewelsInStones(String jewels, String stones) {
        int count = 0;
        HashSet<Character> s = new HashSet<>();
        for(int i = 0; i<jewels.length(); i++){
            s.add(jewels.charAt(i));
        }
        for(int i = 0; i<stones.length(); i++){
            if(s.contains(stones.charAt(i))){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String jewels = scn.next();
        String stones = scn.next();

        System.out.println(numJewelsInStones(jewels, stones));

    }
}

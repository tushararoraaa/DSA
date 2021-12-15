import java.util.Scanner;

public class TowerOfHanoi {

    public static void TOH(int n, int t1id, int t2id, int t3id) {
        if (n == 0) {
            return;
        }
        TOH(n - 1, t1id, t3id, t2id);
        System.out.print(n + " ");
        System.out.println(t1id + "->" + t2id);
        TOH(n - 1, t3id, t2id, t1id);
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int t1id = scn.nextInt();
        int t2id = scn.nextInt();
        int t3id = scn.nextInt();

        TOH(n, t1id, t2id, t3id);
    }
}

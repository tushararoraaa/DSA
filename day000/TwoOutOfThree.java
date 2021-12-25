import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class TwoOutOfThree {

    public static ArrayList<Integer> twoOutOfThree(int[] arr1, int[] arr2, int[] arr3) {
        HashMap<Integer, Integer> map1 = new HashMap<>();
        HashMap<Integer, Integer> map2 = new HashMap<>();
        HashMap<Integer, Integer> map3 = new HashMap<>();
        for (int i = 0; i < arr1.length; i++) {
            map1.put(arr1[i], 1);
        }
        for (int i = 0; i < arr2.length; i++) {
            map2.put(arr2[i], 1);
        }
        for (int i = 0; i < arr3.length; i++) {
            map3.put(arr3[i], 1);
        }
        ArrayList<Integer> res = new ArrayList<>();

        for (int i = 0; i < arr2.length; i++) {
            if (map1.containsKey(arr2[i]) || map3.containsKey(arr2[i])) {
                if (!res.contains(arr2[i])) {
                    res.add(arr2[i]);
                }

            }
        }

        for (int i = 0; i < arr3.length; i++) {
            if (map1.containsKey(arr3[i]) || map2.containsKey(arr3[i])) {
                if (!res.contains(arr3[i])) {
                    res.add(arr3[i]);
                }

            }
        }
     

        return res;

    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n1 = scn.nextInt();
        int[] arr1 = new int[n1];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = scn.nextInt();
        }
        int n2 = scn.nextInt();
        int[] arr2 = new int[n2];
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = scn.nextInt();
        }
        int n3 = scn.nextInt();
        int[] arr3 = new int[n3];
        for (int i = 0; i < arr3.length; i++) {
            arr3[i] = scn.nextInt();
        }

        ArrayList<Integer> res = twoOutOfThree(arr1, arr2, arr3);
        System.out.println(res);

    }
}

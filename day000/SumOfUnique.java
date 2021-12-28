import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class SumOfUnique {

    public static int sumOfUnique(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i]) + 1);
                
            } else {
                map.put(arr[i], 1);
            }

            if(map.get(arr[i])==1){
                count += arr[i];
            }else if(map.get(arr[i])==2){
                count -= arr[i];
            }
        }
        // for (Integer i : map.keySet()) {
        //     if (map.get(i) == 1) {
        //         count += i;
        //     }
        // }
        return count;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }
        System.out.println(sumOfUnique(arr));

    }
}

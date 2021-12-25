import java.util.HashMap;
import java.util.Scanner;

public class NumberOfGoodPairs {

    public static int numIdenticalPairs(int[] arr) {
        int count = 0;
        for(int i = 0;i<arr.length-1; i++){
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i]==arr[j]){
                    count++;
                }
            }
        }
        return count;
    }

    public static int numIdenticalPairs_improved(int[] arr) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if(map.containsKey(arr[i])){
                map.put(arr[i], map.get(arr[i])+1);
            }else{
                map.put(arr[i], 1);
            }
        }
        int count = 0;
        for(Integer x: map.keySet()){
            Integer val = map.get(x);
            if(val>=2){
                count += (val*(val-1))/2;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int [] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }
        System.out.println(numIdenticalPairs(arr));
        System.out.println(numIdenticalPairs_improved(arr));

    }
}

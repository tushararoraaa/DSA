import java.util.ArrayList;
import java.util.Scanner;

public class LuckyNumbersInMatrix {

  

    public static ArrayList<Integer> luckyNumbers(int[][] arr) {
        ArrayList<Integer> res = new ArrayList<>();
       for(int i = 0; i<arr.length; i++){
           int minEle = arr[i][0];
           int minEleIndex = 0;
           for (int j = 0; j < arr[0].length; j++) {
               if(arr[i][j]<minEle){
                   minEle = arr[i][j];
                   minEleIndex= j;
               }
           }
           int maxEle = minEle;
           for(int k = 0; k<arr.length; k++){
                if(arr[k][minEleIndex]>=maxEle){
                    maxEle = arr[k][minEleIndex];
                }
           }
           if(minEle==maxEle){
               res.add(minEle);
           }
       }
        
        return res;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int m = scn.nextInt();
        int n = scn.nextInt();
        int[][] arr = new int[m][n];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = scn.nextInt();
            }
        }
        ArrayList<Integer> res = luckyNumbers(arr);
        System.out.println(res);
    }
}

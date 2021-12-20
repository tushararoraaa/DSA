import java.util.*;

public class Main{

    public static boolean isSpecial(int [][] arr, int x, int y){
        for(int j = 0; j<arr[0].length; j++){
            if(arr[x][j] != 0){
                if(j==y){
                    continue;
                }else{
                    return false;
                }
            }
        }

        for(int i = 0; i<arr.length; i++){
            if(arr[i][y] != 0){
                if(i==x){
                    continue;
                }else{
                    return false;
                }
            }
        }
        return true;
    }

    public static void special(int [][] arr){
        int n = arr.length;
        int m = arr[0].length;
        int x = -1;
        int y = -1;

        for(int i = 0; i<n; i++){
            for(int j = 0; j<m; j++){
                if(arr[i][j]==1){
                    x = i;
                    y = j;
                    if(isSpecial(arr,x,y)){
                        System.out.println(x+", "+y);
                    }
                }
            }
        }
    }
    
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        //write your code here..
        int n = scn.nextInt();
        int m = scn.nextInt();
        int [][] arr = new int[n][m];
        for(int i = 0; i<n; i++){
            for(int j = 0; j<m; j++){
                arr[i][j] = scn.nextInt();
            }
        }
        special(arr);
    }
}
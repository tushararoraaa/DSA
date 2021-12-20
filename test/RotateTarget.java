import java.util.*;

public class Main{

    public static void transpose(int [][] arr){
        int n = arr.length;
        for(int i = 0; i<n; i++){
            for(int j = i+1; j<n; j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
    }

    public static void reverse(int [][] arr){
        int n = arr.length;
        for(int t = 0; t<n; t++){
            int i = t;
            int k = 0;
            int j = arr.length-1;
            while(k<=j){
                int temp = arr[i][k];
                arr[i][k] = arr[i][j];
                arr[i][j] = temp;
                j--;
                k++;
            }
        }
    }

    public static boolean same(int [][] mat , int [][] target){
        int n = mat.length;
        for(int i = 0; i<n; i++){
            for(int j = 0; j<n; j++){
                if(mat[i][j] != target[i][j]){
                    return false;
                }
            }
        }
        return true;
    }


    public static boolean operation(int [][] mat, int [][] target){
        int k = 1;
        while(k<=4){
            transpose(mat);
            reverse(mat);
            if(same(mat,target)){
                return true;
            }
            k++;
        }

        return false;
    }





    public static void main(String [] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        int [][] mat = new int[n][m];
        for(int i = 0; i<n ; i++){
            for(int j = 0; j<n; j++){
                mat[i][j] = scn.nextInt();
            }
        }
        int s = scn.nextInt();
        int t = scn.nextInt();
        int [][] target = new int[s][t];
        for(int i = 0; i<n ; i++){
            for(int j = 0; j<n; j++){
                target[i][j] = scn.nextInt();
            }
        }
        System.out.println(operation(mat,target));
    }
}
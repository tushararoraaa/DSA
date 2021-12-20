import java.util.*;
public class Main {

  public static int sumOddLengthSubarrays(int[] arr) {
    // write your code here..
    int sum = 0;
    for(int i = 0; i<arr.length; i++){
        for(int j = i; j<arr.length; j++){
            for(int k = i; k<=j; k++){
                if((j-i)%2==0){
                    sum += arr[k];
                }
            }
        }
    }
    return sum;
  }

  public static void main(String [] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int [] arr = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = scn.nextInt();
    }
    System.out.println(sumOddLengthSubarrays(arr));

  }
}
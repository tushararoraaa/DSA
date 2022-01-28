import java.util.*;

public class ClimbStairsWithJumps {

    public static int paths(int[] arr, int src, int dest) {
        if (src == dest) {
            return 1;
        }
        int count = 0;
        for (int jump = 1; jump <= arr[src] && jump + src <= dest; jump++) {
            count += paths(arr, src + jump, dest);
        }
        return count;
    }

    public static int paths_memo(int[] arr, int src, int dest, int[] dp) {
        if (src == dest) {
            return dp[src] = 1;
        }

        if (dp[src] != -1) {
            return dp[src];
        }
        int count = 0;
        for (int jump = 1; jump <= arr[src] && jump + src <= dest; jump++) {
            count += paths(arr, src + jump, dest);
        }
        return dp[src] = count;
    }

    public static int paths_tab(int [] arr, int SRC, int dest){
        int[] dp = new int[arr.length+1];
        for(int src = dp.length-1; src>=SRC; src--){
            if (src == dest) {
                 dp[src] = 1;
                 continue;
            }
            int count = 0;
            for (int jump = 1; jump <= arr[src] && jump + src <= dest; jump++) {
                count += dp[src+jump]; //paths(arr, src + jump, dest);
            }
             dp[src] = count;
        }
        return dp[SRC];
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        int[] dp = new int[n + 1];
        Arrays.fill(dp, -1);
        // int res = paths(arr, 0, n);
        // System.out.println(res);
        // int res = paths_memo(arr, 0, n,dp);
        // System.out.println(res);
        int res = paths_tab(arr, 0, n);
        System.out.println(res);
        scn.close();
    }
}

import java.util.Arrays;

public class minimumJumps {
    public static int jumps(int arr[]) {
        int n = arr.length;
        int dp[] = new int[n];
        Arrays.fill(dp, -1);
        dp[n - 1] = 0;

        for (int i = n - 2; i >= 0; i--) {
            int steps = arr[i];
            int ans = Integer.MAX_VALUE;
            for (int j = i + 1; j < n; j++) {
                if (j <= i + steps && dp[j] != -1) {
                    ans = Math.min(ans, dp[j]);
                }
            }
            if (ans != Integer.MAX_VALUE) {
                dp[i] = ans + 1; // Increment the jumps
            }
        }
        return dp[0];
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 0, 3, 0, 0} ;
        System.out.println(jumps(arr));
    }
}
/*
N = 6
A[] = {1, 2, 0, 3, 0, 0} 
Output:
3
Explanation:
Jump 1 step from first index to
second index. Then jump 2 steps to reach 
4th index, and now jump 2 steps to reach
the end. 
 */
import java.util.Arrays;
public class minimumJumps {
    public static int jumps(int arr[]){
        int n=arr.length;
        int dp[] = new int[n];
        Arrays.fill(dp,-1);
        dp[n-1] =0;

        for(int i=n-2; i>= 0;i--){
            int steps = arr[i];
            int ans = Integer.MAX_VALUE;
            for(int j=i+1;j<=i+steps && j<n;j++){
                if(dp[j] != -1){
                    ans = Math.min(ans,dp[j]+1);
                }
            }
            if(ans != Integer.MAX_VALUE){
                dp[i] = ans;
            }
        }
        return dp[0];
    }
    public static void main(String[] args) {
        int arr[] = {2, 3, 1, 1,4};
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

SHORT SOLUTION
static int canReach(int[] A, int N) {
        // Initialize the last position as unreachable
        int lastReachable = N - 1;

        // Initialize steps required to reach the last position
        int steps = 0;

        // Iterate backward from the second-to-last position to the first position
        for (int i = N - 2; i >= 0; i--) {
            // Check if the current position is reachable from the last reachable position
            if (i + A[i] >= lastReachable) {
                // If reachable, update the last reachable position and increment steps
                lastReachable = i;
                steps++;
            }
        }

        // If the first position is reachable, return the minimum steps; otherwise, return -1
        return (lastReachable == 0) ? steps : -1;
    }
 */

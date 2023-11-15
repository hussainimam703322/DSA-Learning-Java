package partitionDP;
import java.util.*;

public class MCMtabulation {
    public static int mcm(int i, int j, int arr[]) {
        int n = arr.length;
        int dp[][] = new int[n][n];

        // Initialize dp array with -1
        for (int x = 0; x < n; x++) {
            Arrays.fill(dp[x], -1);
        }

        if (i == j) return 0;

        if (dp[i][j] != -1) {
            return dp[i][j];
        }

        int minOperations = Integer.MAX_VALUE;

        // Loop to iterate over all possible split points
        for (int k = i; k < j; k++) {
            int operations = mcm(i, k, arr) + mcm(k + 1, j, arr) + arr[i - 1] * arr[k] * arr[j];

            minOperations = Math.min(minOperations, operations);
        }

        dp[i][j] = minOperations;
        return minOperations;
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int n = arr.length;
        int i = 1;
        int j = n - 1;

        System.out.println("The minimum number of operations are " + mcm(i, j, arr));
    }
}

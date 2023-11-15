package partitionDP;

import java.util.Arrays;

public class MCSMemoization {
    static int matrixMultiplication(int arr[], int i, int j, int[][] dp) {

        // base condition
        if (i == j)
            return 0;

        if (dp[i][j] != -1)
            return dp[i][j];

        int mini = Integer.MAX_VALUE;

        // partioning loop
        for (int k = i; k <= j - 1; k++) {

            int ans = matrixMultiplication(arr, i, k, dp) + matrixMultiplication(arr, k + 1, j, dp)
                    + arr[i - 1] * arr[k] * arr[j];

            mini = Math.min(mini, ans);

        }

        return mini;
    }

    public static void main(String args[]) {

        int arr[] = { 10, 20, 30, 40, 50 };
        int N = arr.length;
        int dp[][] = new int[N][N];

        for (int row[] : dp)
            Arrays.fill(row, -1);

        int i = 1;
        int j = N - 1;

        System.out.println("The minimum number of operations are " +
                matrixMultiplication(arr, i, j, dp));

    }
}

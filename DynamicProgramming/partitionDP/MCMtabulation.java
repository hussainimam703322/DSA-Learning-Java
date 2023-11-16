package partitionDP;
import java.util.*;

class MCMtabulation{
    
    // Function to find the minimum number of operations for matrix multiplication
    static int matrixMultiplication(int[] arr, int N) {
        int[][] dp = new int[N][N];
    
        // Initialize the dp array with -1 
        for (int row[] : dp) {
            Arrays.fill(row, -1);
        }

        // Initialize the diagonal with 0   by default in java only initilised with 0
        for (int i = 1; i < N; i++) {
            dp[i][i] = 0;
        }

        // Fill in the dp array using bottom-up approach
        for (int i = N - 1; i >= 1; i--) { //starting point of array 
            for (int j = i + 1; j < N; j++) { //end point of array
                dp[i][j] = Integer.MAX_VALUE;

                // Partitioning loop to find the optimal split point
                //like below partition will done
                //[10,(i)->20,30 ->(k)], [ (k+1)-> 40,50 -> (j) ]
                //k -> ( i-> j-1) j-1=N-1
                //p(i,k) , p(k+1,j).....
                
                for (int k = i; k <= j - 1; k++) { 
                    int operations = dp[i][k] + dp[k + 1][j] + arr[i - 1] * arr[k] * arr[j];
                    dp[i][j] = Math.min(dp[i][j], operations);
                }
            }
        }
       
        return dp[1][N - 1];
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int n = arr.length;

        System.out.println("The minimum number of operations are " + matrixMultiplication(arr, n));
    }
}
package unboundedknapsacktypes;
//this problem is related with unbounded knapsack
public class coinchangeproblem {

    public static long count(int coins[], int N, int sum) {
        // code here.
        long dp[][] = new long[N+1][sum+1];
        for(int i=0;i<N+1;i++){
            dp[i][0]=1; //atleast we can give null coin
        }
        for(int j=0;j<sum+1;j++){
            dp[0][j] = 0;
        }
        for(int i=1;i<N+1;i++){
            for(int j=1;j<sum+1;j++){
                if(coins[i-1] <=j){
                    dp[i][j] = dp[i][j-coins[i-1]]+dp[i-1][j];
                }
                else{
                    dp[i][j] = dp[i-1][j];
                }
            }
        }
        return dp[N][sum];
    }
    public static void main(String[] args) {
        int coins[] = {1,2,3};
        int sum=4;
        int N=3;
        long dp[][] = new long[coins.length][sum+1];
        for(int i=0;i<dp.length;i++){
            for(int j=0;j<dp[0].length;j++){
                dp[i][j] = -1;
            }
        }
        System.out.println(count(coins, N, sum));
    }
}

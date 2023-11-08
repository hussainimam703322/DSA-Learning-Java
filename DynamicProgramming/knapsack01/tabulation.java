package knapsack01;

class tabulation {
    
    public static int tabulationknapsack(int val[],int wt[],int W){
        int n = val.length;
        int dp[][] = new int[n+1][W+1]; 
        for(int i=0;i<dp.length;i++){
            dp[i][0] = 0;
        }
        for(int j=0;j<dp[0].length;j++){
            dp[0][j] = 0;
        }
        for(int i=1;i<n+1;i++){
            for(int j=1;j<W+1;j++){
                if(wt[i-1] <= j){
                    
                    int includeprofit = val[i-1] + dp[i-1][j-wt[i-1]];
                    int excludeprofit = dp[i-1][j];
                    dp[i][j] = Math.max(includeprofit, excludeprofit);
                }else{
                   //not valid if current weight is more than bag weight
                    dp[i][j] = dp[i-1][j];
               }               
            }       
        }   
        return dp[n][W]; 
    }
    public static void main(String[] args) {
        int val[] = {15,14,10,45,30};
        int wt[] = {2,5,1,3,4};
        int W = 7;
        int dp[][] = new int[val.length+1][W+1];
        for(int i=0;i<dp.length;i++){
            for(int j=0;j<dp[0].length;j++){
                dp[i][j] = -1;
            }
        }
        System.out.println(tabulationknapsack(val, wt, W));       
    }
}

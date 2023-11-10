package unboundedknapsacktypes;
/*
Given a rod of length N inches and an array of prices, price[]. price[i] denotes the value of a piece of length i.
 Determine the maximum value obtainable by cutting up the rod and selling the pieces.
 */
public class Rodcuttingproblem {
    public static int rodcutting(int length[], int price[], int totallength) {
        // code here.
        int n = price.length;
        int dp[][] = new int[n+1][totallength+1];
        for(int i=0;i<n+1;i++){
            dp[i][0]=1;
        }
        for(int j=0;j<totallength+1;j++){
            dp[0][j] = 0;
        }
        for(int i=1;i<n+1;i++){
            for(int j=1;j<totallength+1;j++){
                if(length[i-1] <=j){
                    dp[i][j] = Math.max(dp[i][j-length[i-1]]+dp[i-1][j],dp[i-1][j]);
                }
                else{
                    dp[i][j] = dp[i-1][j];
                }
            }
        }
        return dp[n][totallength];
    }
    public static void main(String[] args) {
        int length[] = {1,2,3,4,5,6,7,8,};
        int price[] = {1, 5, 8, 9, 10, 17, 17, 20};
        int totallength = 8;
        int dp[][] = new int[length.length][totallength+1];
        for(int i=0;i<dp.length;i++){
            for(int j=0;j<dp[0].length;j++){
                dp[i][j] = -1;
            }
        }
        System.out.println(rodcutting(length, price, totallength));
    }
}

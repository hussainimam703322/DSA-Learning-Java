package Climbingstairs;

public class climbingstairstabulation{
    public static int countways(int n){
        int e = 1000000007;
        int dp[] = new int[n+1];
        dp[0] = 1;
        dp[1] = 2;
        for(int i=2;i<=n;i++){
            dp[i] = dp[i-1]%e + dp[i-2];
            
        }
        return dp[n-1]%e;
    }
    public static void main(String[] args) {
        int n=10;
        System.out.println(countways(n));
    }
   

}
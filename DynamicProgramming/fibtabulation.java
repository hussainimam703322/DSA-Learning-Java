public class fibtabulation {
    public static int fibtabulation(int n){
        
        int dp[] = new int[n+1];
        dp[1]=1;
        for(int i=2;i<=n;i++){
           dp[i] = dp[i-2] + dp[i-1];
        }
        return dp[n];
    }
    public static void main(String[] args) {
        int n=10;
        System.out.println(fibtabulation(n));
    }
}

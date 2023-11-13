package CatalanNumber;

public class tabulation {
    public static int findCatalan(int n) {
        // code here
        long mod = 1000000007;
        long[] dp = new long[n + 1];
        dp[0] = dp[1] = 1;

        for (int i = 2; i <= n; i++) { //catlan(nth)
            for (int j = 0; j < i; j++) { //calculate each index value like j=0,1,2,3 for i =4
                dp[i] = (dp[i] + (dp[j] * dp[i - j - 1]) % mod) % mod;
            }
        }
        return (int) dp[n];
    }
    public static void main(String[] args) {
        int n=4;
        System.out.println(findCatalan(n));
        
    }
}

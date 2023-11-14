package CatalanNumber;
public class UniqueBST {
    public static int CountBST(int n){
        int dp[] = new int[n+1];
        dp[0]=dp[1]=1;

        for(int i=2;i<n+1;i++){
            for(int j=0;j<i;j++){
                //int left = dp[j]
                //int right = dp[i-j-1]
                dp[i] += dp[j] * dp[i-j-1];
            }
        }
        return dp[n];
    }
    public static void main(String[] args) {
        System.out.println(CountBST(4));
    }
}

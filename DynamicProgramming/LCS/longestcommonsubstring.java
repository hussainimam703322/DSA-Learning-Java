package LCS;
public class longestcommonsubstring {
    public static int longeststring(String str1,String str2,int n,int m){
        int dp[][] = new int[n+1][m+1];
        int ans=0;
        for(int i=1;i<n+1;i++){
            for(int j=1;j<m+1;j++){
                if(str1.charAt(i-1) == str2.charAt(j-1)){
                    dp[i][j] =dp[i-1][j-1] + 1;
                    ans = Math.max(ans, dp[i][j]);
                }
                else{
                    dp[i][j] = 0;
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        String  str1 = "ABCDGH";
        String str2 = "ACDGHR";
        int n=str1.length();
        int m=str2.length();
        System.out.println(longeststring(str1, str2, n, m));
    }
}

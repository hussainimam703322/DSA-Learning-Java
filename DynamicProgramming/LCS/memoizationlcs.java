package LCS;
/*
 Given two strings, find the length of longest subsequence present in both of them. 
 Both the strings are in uppercase latin alphabets.
 LCS for input strings “ABCDGH” and “AEDFHR” is “ADH” of length 3.
 */
public class memoizationlcs {
    public static int longestsequence(String str1, String str2,int n,int m,int dp[][]){
        
        if(n==0 || m==0){
            return 0;
        }
        if(dp[n][m] != -1){
            return dp[n][m];
        }
        if(str1.charAt(n-1) == str2.charAt(m-1)){
            return dp[n][m] = longestsequence(str1, str2, n-1, m-1, dp)+ 1;
        }
        else{
            int ans1 = longestsequence(str1, str2, n-1, m, dp);
            int ans2 = longestsequence(str1, str2, n, m-1, dp);
            return dp[n][m] = Math.max(ans1, ans2);
        }

    }
    public static void main(String[] args) {
        String  str1 = "ABCDGH";
        String str2 = "AEDFHR";
        int n=str1.length();
        int m=str2.length();
        int dp[][] = new int[n+1][m+1];
        for(int i=0;i<n+1;i++){
            for(int j=0;j<m+1;j++){
                dp[i][j]=-1;
            }
        }
        System.out.println(longestsequence(str1, str2, n, m, dp));
    }
}

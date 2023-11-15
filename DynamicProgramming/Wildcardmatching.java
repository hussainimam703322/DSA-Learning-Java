
/* HARD PROBLEM
Given two strings 'str' and a wildcard pattern 'pattern' of length N and M respectively,
You have to print '1' if the wildcard pattern is matched with str else print '0' .
The wildcard pattern can include the characters ‘?’ and ‘*’
‘?’ – matches any single character
‘*’ – Matches any sequence of characters (including the empty sequence)      
*/
//CODE -1
public class Wildcardmatching {
    public static boolean isMatch(String s , String p){
        int n = s.length();
        int m = p.length();
        boolean dp[][]  = new boolean[n+1][m+1];
        //intialize
        dp[0][0] = true;

        //p is " " then we can't match
        for(int i=1;i<n+1;i++){
            dp[i][0]=false;
        }
        //s is " " then cell fill with true or false based on previous cell value
        for(int j=1;j<m+1;j++){
            if(s.charAt(j-1) == '*'){
                dp[0][j] = dp[0][j-1];
            }
        }
        for(int i=1;i<n+1;i++){
            for(int j=1;j<m+1;j++){
                //case-> ith char == jth char || jth car == '?'
                if(s.charAt(i-1) == p.charAt(j-1) || p.charAt(j-1) == '?'){
                    dp[i][j] = dp[i-1][j-1];
                }
                else if(p.charAt(j-1) == '*'){
                    dp[i][j] = dp[i-1][j] || dp[i][j-1];
                }
                else{
                    dp[i][j] = false;
                }
            }
        }
        return dp[n][m];
    }
    public static void main(String[] args) {
        String s = "aa";
        String p = "*";
        System.out.println(isMatch(s, p));
    }
}
/*CODE-2
class Solution
{
    int wildCard(String pattern, String str)
    {
        // Your code goes here
        int m = str.length(), n = pattern.length();
        boolean[][] dp = new boolean[n + 1][m + 1];
        dp[0][0] = true;
        for (int i = 1; i <= n; i++) {
            boolean flag = true;
            for (int k = 1; k <= i; k++) {
                if (pattern.charAt(k - 1) != '*') {
                    flag = false;
                    break;
                }
            }
            dp[i][0] = flag;
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (pattern.charAt(i - 1) == str.charAt(j - 1) || pattern.charAt(i - 1) == '?')
                    dp[i][j] = dp[i - 1][j - 1];
                else if (pattern.charAt(i - 1) == '*')
                    dp[i][j] = dp[i - 1][j] || dp[i][j - 1];
                else
                    dp[i][j] = false;
            }
        }
        return dp[n][m] ? 1 : 0;
    
    }
}
 */
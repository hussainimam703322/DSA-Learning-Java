
/* HARD PROBLEM
Given two strings 'str' and a wildcard pattern 'pattern' of length N and M respectively,
You have to print '1' if the wildcard pattern is matched with str else print '0' .
The wildcard pattern can include the characters ‘?’ and ‘*’
‘?’ – matches any single character
‘*’ – Matches any sequence of characters (including the empty sequence)      
*/
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
        String s = "baaabab";
        String p = "ba*a?";
        System.out.println(isMatch(s, p));
    }
}
/*
public boolean isMatch(String s, String p) {
	boolean match[][] = new boolean[s.length() + 1][p.length() + 1];
	match[0][0] = true;
	for (int i = 0; i < p.length(); i++) // judge whether the substring of p matchese empty sequence
		if (p.charAt(i) == '*')
			match[0][i + 1] = match[0][i];
	for (int i = 0; i < s.length(); i++)
		for (int j = 0; j < p.length(); j++) {
			if( p.charAt(j) == '*' )
				match[i + 1][j + 1] = (match[i][j + 1] | match[i + 1][j] | match[i][j]);
			else if( s.charAt(i) == p.charAt(j) || p.charAt(j) == '?' )
				match[i + 1][j + 1] = match[i][j];
		}
	return match[s.length()][p.length()];
}
 */
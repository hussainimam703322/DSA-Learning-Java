/*
Given two strings s and t. Return the minimum number of operations required to convert s to t.
The possible operations are permitted:
    1.nsert a character at any position of the string.
    2.Remove any character from the string.
    3.Replace any character from the string with any other character.
 */
public class Editdistancelcs {
    public static int editdistance(String s1, String s2){
        int n =s1.length();
        int m= s2.length();
        int dp[][] = new int[n+1][m+1];

        for(int i=0;i<n+1;i++){
            for(int j=0;j<m+1;j++){
                if(i==0){
                    dp[i][j] = j;
                }
                if(j==0){
                    dp[i][j]=i;
                }
            }
        }
        //bottom up
        for(int i=1;i<n+1;i++){
            for(int j=1;j<m+1;j++){
                if(s1.charAt(i-1) == s2.charAt(j-1)){
                    dp[i][j] = dp[i-1][j-1];
                }
                else{
                    int add = dp[i][j-1]+1;
                    int del = dp[i-1][j] + 1;
                    int Replace = dp[i-1][j-1]+1;
                    dp[i][j] = Math.min(add,Math.min(del, Replace));
                }
            }
        }
        return dp[n][m];
    }
    public static void main(String[] args) {
        String word1= "intention";
        String word2="execution";
        System.out.println(editdistance(word1, word2));
    }
}

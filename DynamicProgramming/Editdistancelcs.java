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
        //intialize the 2D table             
        for(int i=0;i<n+1;i++){
            for(int j=0;j<m+1;j++){
                if(i==0){
                    dp[i][j] = j;//str1 size = str2.length
                }
                if(j==0){
                    dp[i][j]=i; //str2 size = str1.length
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
                    //we add 1 because atleast 1 operation will perform 
                    int add = dp[i][j-1]+1; //add in first string then both string last(character) will same then remove them so str2 size will be m-1
                    int del = dp[i-1][j] + 1; //delete from first string so i-1
                    int Replace = dp[i-1][j-1]+1; //replace with another character then remove them
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

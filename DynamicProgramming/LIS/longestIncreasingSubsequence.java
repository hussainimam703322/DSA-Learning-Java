package LIS;
import java.util.*;

public class longestIncreasingSubsequence {

    public static int lcs(int arr1[],int arr2[]){
        int n = arr1.length;
        int m = arr2.length;
        int dp[][] = new int[n+1][m+1];
        
        for(int i=0;i<n+1;i++){
            dp[i][0] =0;
        }
        for(int j=0;j<m+1;j++){
              dp[0][j]=0;  
        }

        for(int i=1;i<n+1;i++){
            for(int j=1;j<m+1;j++){
                if(arr1[i-1] == arr2[j-1]){
                    dp[i][j] = dp[i-1][j-1]+1;
                }
                else{
                    int ans1 = dp[i-1][j];
                    int ans2 = dp[i][j-1];
                    dp[i][j] = Math.max(ans1,ans2);
                }
            }
        }
        return dp[n][m];
    }
    public static int lis(int arr1[]){
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<arr1.length;i++){
            set.add(arr1[i]);
        }
        int arr2[] = new int[set.size()];
        int i=0;
        for(int num : set){
            arr2[i] = num;
            i++;
        }
        Arrays.sort(arr2);
        return lcs(arr1,arr2);
    }
    public static void main(String[] args) {
        int arr[] = {50,3,10,7,40,80};
        System.out.println(lis(arr));
    }
}
/*
 static int LCIS(int[] arr1, int m, int[] arr2, int n) {
        int[][] dp = new int[n + 1][m + 1];
        int result = 0;
        for (int i = 1; i <= n; i++) {
            int currentMax = 0;
            for (int j = 1; j <= m; j++) {
                if (arr2[i - 1] == arr1[j - 1]) {
                    dp[i][j] = currentMax + 1; //we increase the value at at cell;
                } else {
                    dp[i][j] = dp[i - 1][j]; // if not then take the previous cell value and update 
                }
                if (arr2[i - 1] > arr1[j - 1]) {
                    currentMax = Math.max(currentMax, dp[i - 1][j]); //if second arr have greater value than arr first
                                                                     //then we take recent maximum from max value and cell value
                }
                result = Math.max(result, dp[i][j]);
            }
        }
        return result;
    }

STEPS
LCIS method:

This method takes two arrays (arr1 and arr2) and their sizes (m and n) as input and 
returns the length of the Longest Common Increasing Subsequence (LCIS).

It uses a 2D array dp to store the length of the LCIS up to the current elements 
of arr1 and arr2.

It initializes result to 0, which will store the final result (length of LCIS).
Two nested loops iterate over each element of arr2 and arr1.

The inner loop checks if the current elements of arr2 and arr1 are equal.
 If they are, it updates the dp array with the length of the LCIS ending at 
 the current elements.If the current element of arr2 is greater than 
the current element of arr1,it updates currentMax to the
maximum value encountered so far in the previous  row of the dp array.

The result is updated with the maximum value in the dp array.
The final result is the maximum length of LCIS encountered during the entire process.    
 */
/*
public static int longestSubsequence(int size, int a[]) {
        if (size == 0) {
            return 0;
        }

        int[] tailTable = new int[size];
        int len = 1;
        tailTable[0] = a[0];

        for (int i = 1; i < size; i++) {
            if (a[i] < tailTable[0]) {
                tailTable[0] = a[i];
            } else if (a[i] > tailTable[len - 1]) {
                tailTable[len++] = a[i];
            } else {
                int index = Arrays.binarySearch(tailTable, 0, len, a[i]);
                if (index < 0) {
                    index = -index - 1;
                }
                tailTable[index] = a[i];
            }
        }
        return len;
    }
 */
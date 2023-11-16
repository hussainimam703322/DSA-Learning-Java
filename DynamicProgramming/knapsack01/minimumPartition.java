package knapsack01;
//minimum subset difference
/*
Given an array arr of size n containing non-negative integers,
the task is to divide it into two sets S1 and S2 such that the absolute
difference between their sums is minimum and find the minimum difference
 */
public class minimumPartition {
    public static int minipartition(int arr[]) {
        int n = arr.length;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }
        int W = sum / 2;  //created another bag of capacity w
        int dp[][] = new int[n + 1][W + 1];

        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < W + 1; j++) {
                if (arr[i - 1] <= j) {
                    dp[i][j] = Math.max(arr[i - 1] + dp[i - 1][j - arr[i - 1]], dp[i - 1][j]);
                } else {
                    // exclude
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }
        int sum1 = dp[n][W];
        int sum2 = sum - sum1;
        return Math.abs(sum1 - sum2);

    }

    public static void main(String[] args) {
        int arr[] = { 1, 6, 11, 5 };
        System.out.println(minipartition(arr));
    }
}
/*
In this problem we have calculated total sum and sum/2 added in two subset set1 and set2
such that both have same value....
we do partition in array..

in this only one array so we assume that val[] and wt[] (arr[i-1]) same like in this ways if wt =6 then val=6 if wt = 11 then val =11 so on.....

created two bags one have bag1 capacity sum/2 = w another  bag2 sum2 = sum - sum1(calculated profit) using dp[i][j] (i=n,j=profit or wieght)

if set1 contains {1,11} then set2 must contains{6,5}

if arr contains element less than or = the capacity of bag so that choice in valid 
if arr contains element more than the capacity of bag so that choice in invalid 
so element will come in bag based on choices

the we will find the difference of both sum so that difference is minimum...


 */

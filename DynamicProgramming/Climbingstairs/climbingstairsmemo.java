package Climbingstairs;

/*
There are N stairs, and a person standing at the bottom wants to reach the top. The person can climb either 1 stair or 2 stairs at a time. 
Count the number of ways, the person can reach the top
if steps can be taken 1, 2, 3 then add countways(n-3,ways)
 */

import java.util.*;
//time complexity- O(1)
public class climbingstairsmemo{
    public static int countways(int n,int ways[]){
        if(n == 0){
            return 1;
        }
        else if( n< 0){
            return 0;
        }
        if(ways[n] != 0){
            return ways[n];
        }
        ways[n] = countways(n-1,ways) + countways(n-2, ways);

        return ways[n];
    }
    public static void main(String[] args) {
        int n=6;
        int ways[] = new int[n+1];
        // Arrays.fill(ways,-1);
        System.out.println(countways(n, ways));
    }   
}

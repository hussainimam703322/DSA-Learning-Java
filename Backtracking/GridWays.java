//There is a robot on an m x n grid. The robot is initially located at the top-left 
//corner (i.e., grid[0][0]). The robot tries to move to the bottom-right corner 
//(i.e., grid[m - 1][n - 1]).
// The robot can only move either DOWN OR RIGHT at any point in time.
//leetcode but time limit exceeded this approach ...solve by DP
public class GridWays {
    public static int Allways(int i,int j,int n,int m){
        if(i == n-1 && j == m-1){
            return 1;
        }
        else if(i == n || j == m){
            return 0;
        }
        int w1 = Allways(i+1,j,n,m);
        int w2 = Allways(i,j+1,n,m);
        return w1+w2;
    }
    public static void main(String[] args) {
        int n=3,m=3;
        System.out.print("Total ways to rech the destination" + " "+ Allways(0, 0, n, m));
    }
}

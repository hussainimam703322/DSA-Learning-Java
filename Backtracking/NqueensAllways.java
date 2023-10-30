

public class NqueensAllways {
    public static boolean isSafe(char board[][],int row,int col){
        //vertical up
        for(int i=row-1;i>=0;i--){
            if(board[i][col]=='Q'){ //column same rahega sirf vertically upar check kr rhe hai aur niche
                return false;
            }   
        }
        //up left vertical diagonal
        for(int i=row-1,j=col-1;i>=0 && j>=0;i--,j--){
            if(board[i][j]=='Q'){
                return false;
            }
        }
        //up right left vertical diagonal
        for(int i=row-1,j=col+1;i>=0 && j<board.length;i--,j++){
            if(board[i][j]=='Q'){
                return false;
            }
        }
        return true;
    }
    public static void Nqueens(char board[][], int row){
        if(row == board.length){
            // printboard(board);
            count++;
            return;
        }
        //column loop
        for(int j=0;j<board.length;j++){
            if(isSafe(board,row,j)){
                board[row][j] = 'Q';
                Nqueens(board, row+1);//function call
                board[row][j]='X'; //backtracking steps
            }
        }
    }
    public static void printboard(char board[][]){
        System.out.println("______board________");
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board.length;j++){
               System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
    static int count=0;
    public static void countways(char board[][], int row){
        if(row==board.length){
            count++;
            return;
        }
    }
    public static void main(String[] args) {
        int n=4;
        char board[][] = new char[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                board[i][j]='X';
            }
        }
        Nqueens(board, 0);
        System.out.println("Total ways to solve N queen =" +" "+ count);
    }
    
   
}
//Time complexity O(N!)
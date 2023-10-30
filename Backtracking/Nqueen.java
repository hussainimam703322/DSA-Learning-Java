//N queen problem -place the queens in such a way that now two queens kill each other.
public class Nqueen {

    public static void Nqueens(char board[][],int row){
        //base case
        if(row==board.length){
            printboard(board);
            return;
        }
        //column loop
        for(int j=0;j<board.length;j++){
            board[row][j]='Q'; //pehle ek row me update hoga phir row+1
            Nqueens(board, row+1);
            board[row][j] ='X'; //backtraking steps
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
    public static void main(String[] args) {
        int n=2;
        char board[][] = new char[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                board[i][j]='X';
            }
        }
        Nqueens(board, 0);
    }
}

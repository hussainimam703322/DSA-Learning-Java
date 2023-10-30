package Pattern;

public class pgm1{
    public static void pattern(int row, int col){
        for(int i=1;i<row;i++){
            
            for(int j=1;j<col;j++){
               System.out.println("*");
            }
        }
        
        
    }
    public static void main(String[] args) {
        pattern(4,5);
        
    }
    
}

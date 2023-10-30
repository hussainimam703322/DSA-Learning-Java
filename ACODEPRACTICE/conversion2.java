import java.util.*;

// bytes -> short -> int -> float -> long -> double

    //Note: Java automatically converts bytes, short , char operands into int while evaluating expression 
    //     : if one expression is float , long, double then whole expression will convert into respective expression; 
    

public class conversion2 {
    public static void main(String args[]){
        char ch = 'a';
        char ch2 = 'b';
        // System.out.println((int) ch2- (int) ch);
        
        int a =10;
        float b = 25.10f;
        long c = 20;
        double d = 30;
        double ans = a + b +c +d; 
//among all the variable declared the one who is largest in size then then result will be
      // in that data type only. 
        System.out.println(ans);

        



    }
}

import java.util.*;
public class conversion {
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        // we can only store smaller one into bigger one
         float number = sc.nextInt();
         System.out.println(number);

         //Type casting (converting one data type to another one)

         float a = 25.12f; //f written to convert into float
         int b = (int) a;
         System.out.println(b);

         //conversion of alphabet to number

         char ch = 'a';
         char ch2 = 'b';
         int asci = ch;
         int asci2 = ch2;
         System.out.println(asci);
         System.out.println(asci2);
         //output : 97 98

        


    }
}

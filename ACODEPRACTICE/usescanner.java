
import java.util.Scanner;

public class usescanner {
    public static void main(String args[])
    {
      int a;
      float b;
      String s;
      Scanner in = new Scanner(System.in);
      System.out.println("Enter a string");
      s = in.nextLine();
      System.out.println("You entered string "+s);
      System.out.println("Enter an integer");
       a  = in.nextInt();
      System.out.println("You entered integer "+a);
      System.out.println("Enter a float");
      b = in.nextFloat();
      System.out.println("You entered float "+b); 
    }

}
/*  public boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                sb.append(Character.toLowerCase(c));
            }
        }
        StringBuilder reversed = new StringBuilder(sb).reverse();
        return sb.toString().equals(reversed.toString());
        
    } */


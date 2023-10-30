import java.util.Scanner;

public class UppertoLower {
   public static void convertString(StringBuffer str){

       int n = str.length();

       for(int i=0;i<n;i++){

         Character c = str.charAt(i);

         if(Character.isLowerCase(c)){

            str.setCharAt(i,Character.toUpperCase(c));
         }
         else{
            str.setCharAt(i,Character.toLowerCase(c));
         }
       }
       System.out.println(str);
   }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        StringBuffer str = new StringBuffer(input);
        scanner.close();

        convertString(str);
        // StringBuffer str = new StringBuffer("ImAm HuSsAiN");
        // convertString(str);
        
    }
}

package CoreJava.Array;

import java.util.Scanner;

public class condition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String fruits = sc.next();
        switch (fruits) {
            case "Apple" :
              System.out.println("kings of fruits");
              break;
            
            case "Grapes" :
              System.out.println("Sweet fruits");
              break;
              
            case "Orange" :
              System.out.println("bitter in taste");
              break;
            default:
              System.out.println("Invalid Option");
        } 
    }

}
    
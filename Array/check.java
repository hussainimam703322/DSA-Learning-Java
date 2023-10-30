package CoreJava.Array;
import java.util.Scanner;

class check{
    public static void main(String[] args){
        System.out.println("Enter any number:");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int x = number%2;
        if(x==0){
            System.out.println("The number is even");
        }
        else{
            System.out.println("The number is odd");
        }
        


    }
   

}
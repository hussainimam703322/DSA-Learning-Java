package CoreJava.Array;
import java.util.Scanner;
public class numbercomparison {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num1 number");
        int num1 = sc.nextInt();

        System.out.println("Enter num2 number");
        int num2 = sc.nextInt();

        System.out.println("Enter num3 number");
        int num3 = sc.nextInt();

        int largest = largest(num1, num2, num3); 
        int smallest = smallest(num1, num2, num3);   
        System.out.printf("largest of three numbers %d, %d, and %d is : %d %n", num1, num2 ,num3, largest);
         System.out.printf("smallest of three numbers %d, %d, and %d is : %d %n", num1, num2 ,num3, smallest);  
    }     

    //function
            public static int largest(int num1, int num2 ,int num3){
              int max = num1;
              if(num2>max){
               max = num2;
              }
              if(num3>max){
               max = num3;
              }
              return max;
            }

            public static int smallest(int num1, int num2 ,int num3){
               int min = num1;
               if(num2<min){
               min = num2;
               }
               if(num3<min){
               min = num3;
               }
               return min;
    }
}


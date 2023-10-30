package CoreJava.Recursion;

import java.util.Scanner;
//print the fibonacci of a number n
public class fibonacci {
    static int fib(int n ){
       if(n==0 || n==1){
         return n;
       }
       int fib1 = fib(n-1);
       int fib2 = fib(n-2);

       int fib_main = fib1 + fib2; 
       return fib_main;
        

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(fib(n));
    }
}

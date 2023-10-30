package CoreJava.Recursion;

import java.util.Scanner;

//print the factorial of a number n

public class factorial1 {


    public static int calcfactorial(int n){
        if(n==1 || n==0){
            return 1;
        }
        int fac_num1 = calcfactorial(n-1);
        int fact_n = n * fac_num1;
        return fact_n;
        //short code below
        // return n * calcfactorial(n-1);
        
    }
    public static void main(String[] args) {
        int n = 5;
        int ans = calcfactorial(n);
        System.out.println(ans);
        // System.out.println(calcfactorial(5));
    }
}

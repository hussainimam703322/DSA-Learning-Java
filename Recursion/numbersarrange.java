package CoreJava.Recursion;

import java.util.Scanner;

//print numbers in arranging order

public class numbersarrange {
    public static void InNumber(int n){
        if(n == 1){
            System.out.print(n+" ");
            return;
        }
        InNumber(n-1);
        System.out.print(n+" ");
    }

    //print numbers in decreasing order
    public static void DecNumber(int n){
        if(n==1){
           System.out.print(n);
           return;
        }
        System.out.println(n+" "); // first it will print 10 then funtion will call n-1
        DecNumber(n-1);
    }
    public static void main(String[] args) {
        // 
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        DecNumber(n);
        
    }
}

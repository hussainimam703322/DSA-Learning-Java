package CoreJava.Recursion;

//print the fibonacci seqence  till the N^th term
public class fibonacci2 {
    public static void printFib(int a, int b, int n){
       if(n==0){
        return;
       } 
       int c = a+b;
       System.out.print(c + " "); 
       //already a, b and c is printed. so now a becomes b and b becomes c 
       //and pass in the function also c is printed so total number of terms will be n-1
       printFib(b,c,n-1); 
       

    }
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        System.out.print(a+ " ");
        System.out.print(b + " ");
        int n =10;
        printFib(a,b,n-2);
        //n-2 is passed as already two terms are printed
        

    }
}

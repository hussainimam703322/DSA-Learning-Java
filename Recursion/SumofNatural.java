package CoreJava.Recursion;
//print the sum of natural numbers
public class SumofNatural {
    public static int  printSum(int n){
        if(n==1){
            return 1;
        }
        int sum1 = printSum(n-1);
        int sumfinal = n + sum1;
        return sumfinal;
        //recursion helps to minmize the code as written below;
        // return n + printSum(n-1);
    }
    public static void main(String[] args) {
        int n  =10;
        System.out.println(printSum(n));

    }
}

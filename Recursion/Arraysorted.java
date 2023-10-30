package CoreJava.Recursion;

import java.util.Scanner;

//check if a given array is sorted or not.
public class Arraysorted {
    public static boolean arraysort(int arr[], int i){
        if(i== arr.length-1){
            return true;
        }
        int min = arr[i];
        int max = arr[i+1];
        if(max > min){
            return true;
        }
        else{
            return false;
        }
        
        

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        
    //    int[] arr = {1,2,3,4,5};
       System.out.println(arraysort(arr, 0));

    }
}

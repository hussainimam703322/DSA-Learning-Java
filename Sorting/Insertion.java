import java.util.*;

public class Insertion {
    static void InsertionSort(int arr[]){
        int n = arr.length;
        for(int i =1;i<n;i++){ //0 1 2 3 4 5
            int j = i; // 
            while(j>0 && arr[j] < arr[j-1]){ //j>0 && arr[2] < arr[1] ->true,it will swap 
                                              //and again j-- means it will again check for previous one until all left side will sorted
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
                j--; //it will check until previous are not sorted
            }
            
        }
    }
    public static void main(String[] args) {
        int arr[] = {7,8,3,1,2,4};
        InsertionSort(arr);
        for(int i : arr){
            System.out.print(i + " ");
        }
    }
}

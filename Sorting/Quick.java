import java.util.*;

//worst case occurs when pivot is always the smallest or the largest element
//Time complexity : Worst : O(n^2)
//                : Average : O(nlogn)

public class Quick {
    public static int partition(int arr[] , int low, int high){

        int pivot = arr[high]; //we can take first element ,last or median of array
                              //pivot->it is center around all elements move
                              
        int i = low-1; //starting space for placing element

        for(int j=low; j<high;j++){
            if(arr[j] < pivot){
                i++; //create space so i will increase
                //swap the elements with the space created
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        i++; // space created to place the pivot element
        int temp = arr[i];
        arr[i] = pivot;
        arr[high] = temp;
        return i; //return the index of element
    }
    static void quickSort(int arr[], int low, int high){
       if(low < high){
         int pivotidx = partition(arr,low,high);

         quickSort(arr, low, pivotidx-1); // it means it will contain all elements which is smaller than pivot
         quickSort(arr, pivotidx+1,high); // greater than pivot. it will be right side of pivot
       } 
    }
    public static void main(String args[]){
        int arr[] = {2,3,8,9,4,7,10};
        int n =arr.length;

        quickSort(arr, 0,n-1);

        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        
    }

}

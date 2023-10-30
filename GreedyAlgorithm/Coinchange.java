/*
Given a value of V Rs and an infinite supply of each of the denominations {1, 2, 5, 10, 20, 50, 100, 500, 1000} valued coins/notes, 
The task is to find the minimum number of coins and/or notes needed to make the change?
 */

import java.util.ArrayList;

public class Coinchange {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        int arr[] = {2000,500,200,100,50,20,10,5,2,1};
        int N = 540;
        int current=N;
        for(int i =0;i<arr.length;i++){
            if(arr[i] <= N){
                while(arr[i] <= current ){
                  list.add(arr[i]);
                  current -= arr[i];
                }
            }
        }
        System.out.println("coin need"+" "+ list);
    }
}

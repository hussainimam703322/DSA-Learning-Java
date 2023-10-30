import java.util.*;
/*
You are given two arrays A and B of equal length N.
Your task is to pair each element of array A to an element in array B, 
such that the sum of the absolute differences of all the pairs is minimum.

 */
public class MinDiff {
    public static void main(String[] args) {
        int A[] = {1,2,3};
        int B[] = {2,1,3};

        Arrays.sort(A);
        Arrays.sort(B);

        int MinDiff = 0;
        for(int i=0;i<A.length;i++){
            MinDiff += Math.abs(A[i]-B[i]);
            //get difference of each pair with same index and sum till N...
        }

        System.out.println("Minimum absolute difference ="+" "+ MinDiff);


    }
}

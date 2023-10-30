import java.util.Arrays;

public class Selection {
    static void SelectionSort(int a[]){
        int n = a.length;
        for(int i=0;i<n-1;i++){ //we will get sorted in n-1 ,last element will be found sorted
            int min = i; //take minimum element from array and compare the all elements and swap 
            for(int j=i+1;j<n;j++){
                if(a[j]< a[min]){
                    min = j;
                }
            }
            //swap current element and minimum element -> current index i will have minimum element
            int temp = a[i]; //in this we are taking min from unsorted and keeping in sorted array
            a[i] = a[min];
            a[min] = temp;
        }
    }
    public static void main(String[] args) {
        int a[] = {2,8,6,4,1};
        SelectionSort(a);
        for(int i : a){
            System.out.print(i + " ");
        }
    }
}

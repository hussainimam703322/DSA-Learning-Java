public class Merge {
    public static void conquer(int arr[], int s, int mid, int e) {
        int merged[] = new int[e - s + 1];
        int idx1 = s;
        int idx2 = mid + 1;
        int x = 0;
        while (idx1 <= mid && idx2 <= e) {
            if (arr[idx1] <= arr[idx2]) {
                merged[x++] = arr[idx1++];
            } else {
                merged[x++] = arr[idx2++];
            }
        }
        while (idx1 <= mid) {
            merged[x++] = arr[idx1++];
        }
        while (idx2 <= e) {
            merged[x++] = arr[idx2++];
        }
        for (int i = 0, j = s; i < merged.length; i++, j++) {
            arr[j] = merged[i];
        }
    }

    public static void divide(int arr[], int s, int e) {
        if (s < e) {
            int mid = s + (e - s) / 2;
            divide(arr, s, mid);
            divide(arr, mid + 1, e);
            conquer(arr, s, mid, e);
        }
    }

    public static void main(String[] args) {
        int arr[] = {2, 4, 5, 1, 3, 8, 7};
        int n = arr.length;
        divide(arr, 0, n - 1);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
/*
static void displayArr(int arr[]){
        for(int val : arr){
           System.out.println(val);
        }
    }
    static void merge(int arr[],int l,int mid,int r){
        int n1 = mid-l+1;
        int n2 = r-mid;
        int[] left = new int[n1];
        int[] right = new int[n2];
        
        for(int i=0;i<n1;i++) left[i] = arr[l+i];
        for(int j=0;j<n2;j++) right[j] = arr[mid+1];
        int i =0,j=0,k=l;
        while(i<n1 && j<n2){
            if(left[i]<n1 && left[j]<n2){
                 arr[k++] = left[i++];
            }
            else{
            arr[k++] = right[j++];
            }
        }
        while(i<n1){
            arr[k++] = left[i++];
        }
        while(j<n2){
            arr[k++] = right[j++];
        }

        

    }

    

    static void mergesort(int[] arr,int l, int r){
        if(l>=r) return;
        int mid = l + r /2;
        mergesort(arr,l,mid);
        mergesort(arr, mid+1, r);
        merge(arr,l,mid,r);

    }
 */
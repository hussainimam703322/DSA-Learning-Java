

class counting{
    static void CountSort(int arr[]){

      int largest = Integer.MIN_VALUE; //find maximum value from array
      for(int i=0;i<arr.length;i++){
        largest = Math.max(largest, arr[i]);
      }
      
      int count[] = new int[largest+1]; //make an array of size more than the maximum value
      //count is nothing it's only value given in array
      for(int i=0;i<arr.length;i++){
        count[arr[i]]++; //count the each value and place at the index
      }
      int j = 0;
      for(int i = 0;i<count.length;i++){
        //original index
        while(count[i] > 0){
           arr[j] = i; 
           j++; // place at every index
           count[i]--;// frequency should be decreased by 1 till it becomes 0 and place in original array 
           
        }
      }
    }
    static void printArr(int arr[]){
        for(int i =0;i<arr.length;i++){
           System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] ={2,6,4,3,2,4,9,9,7,7};
        CountSort(arr);
        printArr(arr);
        

    }
}
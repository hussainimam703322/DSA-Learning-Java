package CoreJava.Array;



public class spanArray {
    public static void main(String[] args) {
       
        int[] arr = {10,20,25,30};

       

        int max = arr[0];
        int min = arr[0];
        for(int i = 0; i<arr.length; i++){
            if(arr[i] > max){
               max = arr[i]; 
            }

            if(arr[i] < min){
                min = arr[i];
            }
        }
        int span = max -min;
        System.out.println(span);
    }
}

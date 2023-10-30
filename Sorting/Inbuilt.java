import java.util.Arrays;
class sort{
    static void printArr(int arr[]){
        for(int i : arr){
            System.out.print(i+" ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {2,8,4,6,3,0};
        Arrays.sort(arr);
        printArr(arr);

    }
}
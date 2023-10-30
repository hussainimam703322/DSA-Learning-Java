package CoreJava.Recursion;

//To find the first occurance of an element in an array
public class occurance {
    static int firsoccurance(int arr[], int key, int i){
        if(arr[i] == arr.length){
            return -1;
        }
        if(arr[i] == key){
            return i;
        }
        return firsoccurance(arr, key, i+1);//it will call till get the key
    }

//To find the last occurance of an elment in an array
    static int lastOccurance(int arr[], int key, int i){
        if(arr[i] == arr.length){
            return -1;
        }
        int isFound = lastOccurance(arr,key,i+1);
        if(isFound == -1 && arr[i] == key){
            return i;
        }
        return isFound;
    }    
    public static void main(String[] args) {
        int arr[] = {1,5,4,3,5,9,7,5,0,5}; //i=0,1,2,3.....
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // int arr[] = new int[n];
        System.out.println(lastOccurance(arr, 5, 0));
    }
}

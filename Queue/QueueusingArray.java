package CoreJava.Queue;

public class QueueusingArray {
    //structure to represent queue
    static class Queue{
      static int arr[]; //using array we are creating queue
      static int size;
      static int rear = -1;
     
      //constructing queue 
      Queue(int n){
        arr = new int[n];
        this.size = n;
      }
      public static boolean isEmpty(){
        return rear == -1;
      }
       
  // function to add element in queue
      public static void add(int data){
           if(rear == size-1){
            System.out.println("full queue");
            return;
           }

          rear++;
          arr[rear] = data;
      }
      // function to remove element
      public static  int remove(){
          if(isEmpty()){
            System.out.println("empty queue");
            return -1;
          }

          int front =arr[0];
          for(int i = 0; i<rear; i++){
            arr[i] = arr[i+1];
          }
          rear--;
          return front;
      }

      public static  int peek(){
        if(isEmpty()){
          System.out.println("empty queue");
          return -1;
        }
        return arr[0];
    }

    public static void main(String[] args) {
        Queue q =new Queue(5);
        q.add(1);
        q.add(2);
        q.add(3);
         while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
         }
         




    }


    }
}

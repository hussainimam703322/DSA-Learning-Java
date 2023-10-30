package CoreJava.Queue;
//curcular queue using Array
public class CircularQueue {
    //structure of queue
    static class Queue{
        static int arr[];
        static int size;
        static int rear =-1;
        static int front =-1;

        //declare queue
        Queue(int n){
           arr = new int[n];
           size = n;
        }

        public static boolean isEmpty(){
            return rear ==-1 && front == -1;
        }
        public static boolean isFull(){
            return (rear+1) % size == front;
        }

        public static void add(int data){
           if(isFull()){
            System.out.println("queue is full");
            return;
           }
           //increase front to add rear element 
           if(front ==-1){
            front =0;
           }
           rear = (rear + 1) %size;
           arr[rear] =data;
        }

        //dequeue -O(1)
        public static int remove(){
            if(isEmpty()){
                System.out.println("empty queue");
                return -1;
            }
            
            //as front is element so declare result to store front
            int result = arr[front];
            if(rear == front){
                rear = front = -1;
            }
            else{
                front = (front +1) % size;
            }
            return result;

        }
        public static int peek(){
            if(isEmpty()){
                System.out.println("queue is empty");
                return -1;
            }
            return arr[front];
        }
        public static void main(String[] args) {
            Queue q =new Queue(5);
            q.add(1);
            q.add(2);
            q.add(3);
            q.add(4);
            q.add(5);
            System.out.println(q.remove());
            q.add(6);
            System.out.println(q.remove());
            q.add(7);

                while(!q.isEmpty()){
                  System.out.println(q.peek());
                  q.remove();
                }
        }   

    } 
}

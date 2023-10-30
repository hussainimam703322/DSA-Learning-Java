package CoreJava.Queue;

//collections framework contains all functions

import java.util.*;
public class CollectionsQueue {
    public static void main(String[] args) {
        //queue q = new queue();
       // Queue<Integer> q = new ArrayDeque<>();
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        System.out.println(q.remove());
        q.add(6);
        

        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}


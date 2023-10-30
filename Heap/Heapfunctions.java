package CoreJava.Heap;

import java.util.*;

public class Heapfunctions {
    static class Heap{
        ArrayList<Integer> arr = new ArrayList<>();
        public void add(int data){
            //add data
            arr.add(data);

            int x = arr.size()-1; // x is child index
            int par = (x-1)/2; // par is root

            while(arr.get(x) < arr.get(par)){ //> for maxheap
               int temp = arr.get(x);
               arr.set(x, arr.get(par));
               arr.set(par, temp);

               //now child and parent value is changed so we need to update
               x = par;
               par = (x-1)/2;
            }
        }
        public int peek(){
            return arr.get(0);
        }

        //Heapify method to arrange the elements
        public void heapify(int i){ //O(log n)
            int left = 2*i;
            int right = 2*i + 1;
            int minIdx = i; //assume root element
                                                  //< for max heap
            if(left < arr.size() && arr.get(minIdx) > arr.get(left)){
                minIdx = left;
            }
            if(right < arr.size() && arr.get(minIdx) > arr.get(right)){
                minIdx = right;
            }
            if(minIdx !=i ){ 
                int temp = arr.get(i);
                arr.set(i,arr.get(minIdx));
                arr.set(minIdx,temp);

                heapify(minIdx);
            }   
        }
        
        public int remove(){
            int data = arr.get(0);
            //swap first and last 
            int temp = arr.get(0);
            arr.set(0,arr.get(arr.size()-1));
            arr.set(arr.size()-1, temp);

            //delete last element
            arr.remove(arr.size()-1);
            
            heapify(0); 
            return data;
        }
        public boolean isEmpty(){
            return arr.size() == 0;
        }
        public static void main(String[] args) {
            Heap h = new Heap();
            h.add(2);
            h.add(4);
            h.add(5);
            h.add(1);
            while(!h.isEmpty()){
               System.out.println(h.peek());
               h.remove();
            }
        }
        
    }
}

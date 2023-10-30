package CoreJava.Queue;

import java.util.*;

public class Classroom {
       static class Student implements Comparable<Student>{
        //comparable has power to compare objects of their classes
            String name;
            int rank;
        
            public Student(String name, int rank){
              this.name = name;
              this.rank = rank;

            }
           //child class also implement the same class called overriding.
            @Override
            public int compareTo(Student s2){
                return this.rank - s2.rank;
            }
        }
    
    public static void main(String[] args) {
        PriorityQueue<Student> pq = new PriorityQueue<>();
                                                    //Comparator.reverseOrder()

        pq.add(new Student("imam",4));
        pq.add(new Student("hussain",1));
        pq.add(new Student("ansari",2));
        pq.add(new Student("talif",5));

        while(!pq.isEmpty()){
            System.out.println(pq.peek().name + "-> " + pq.peek().rank);
            pq.remove();
        }
        
    }
}

package CoreJava.Hashmap;

import java.util.HashSet;
import java.util.Iterator;

public class Hash_set {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("Chennai");
        set.add("Patna");
        set.add("Delhi");
        set.add("Kolkata");
        set.add("Mumbai");
        System.out.println(set);

        //add
        HashSet<String> cities = new HashSet<>();
        cities.addAll(set); //this is used to add previous set in new one
        cities.add("Ranchi");
        System.out.println("New Hashset:" + cities);

        //size
        System.out.println("size is" + " "+cities.size());

        //search
        if(cities.contains("kolkata")){
             System.out.println("present");
        }
        if(!cities.contains("chakia")){
            System.out.println("not present");
        }
        //ITERATION - It has in-built iterator
        //WORKS in Unordered way 
        Iterator it = set.iterator();
        while(it.hasNext()){
            System.out.print(it.next()+" ");
        }

        //using for each loop
        for(String city : cities){ //it will get all the data from cities and store in city
            System.out.println(city);
        }
       
    }
}

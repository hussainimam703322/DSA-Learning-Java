
import java.util.*;

//In this we will learn a basic knowledge of hashmap in detail with implementation
public class BasicOperation {
    public static void main(String[] args) {
        HashMap<String,Integer> map =  new HashMap<>();

        //insert
        map.put("india",150);
        map.put("china", 50);
        map.put("bangladesh",40);
        map.put("nepal", 30);
        System.out.println(map);

        //size
        System.out.println("Size of map is"+" "+ map.size());

        //Get value through key
        int population = map.get("india");
        System.out.println("population is"+" "+ population);

        //search
        if(map.containsKey("india")){
            System.out.println("present");
        }
        else{
            System.out.println("not present");
        }

        //remove
        System.out.println(map.remove("nepal"));//value of key will print
        System.out.println(map);

        //Isempty()
        map.clear(); //it will clear all the key and value inside the map
        
        System.out.println(map.isEmpty()); // it will check whether the map is empty or not
        
        //Iteration through keyset in hashmap
        
        Set<String> keys = map.keySet();
        System.out.println(keys);

        for (String k : keys) { // key will come out from keys and store in k
            System.out.println("keys="+k+ ","+ "value="+map.get(k));
            
        }

    }
}

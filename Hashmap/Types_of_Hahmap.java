package CoreJava.Hashmap;
import java.util.*;
public class Types_of_Hahmap {
    public static void main(String[] args) {
        HashMap<String,Integer> hm = new HashMap<>();
        hm.put("India",100);
        hm.put("china",150);
        hm.put("US",50);
        System.out.println(hm);

        //linkedHashMap is used when we want  our data in an ORDER(i.e order in which we insert)
        LinkedHashMap<String,Integer> lhm = new LinkedHashMap<>();
        lhm.put("India",100);
        lhm.put("china",150);
        lhm.put("US",50);
        System.out.println(lhm);


        //sorted in arranging order of alphabets
        TreeMap<String,Integer> tree = new TreeMap<>();
        tree.put("India",10);
        tree.put("china",150);
        tree.put("US",50);
        System.out.println(tree);
    }
    
}

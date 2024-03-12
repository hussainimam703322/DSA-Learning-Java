
import java.util.*;
public class Types_of_set {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("Chennai");
        set.add("Patna");
        set.add("Delhi");
        set.add("Kolkata");
        set.add("Mumbai");
        System.out.println(set);

        //LinkedHashset--this concept is same as LinkedHashMap
        LinkedHashSet<String> lhs = new LinkedHashSet<>();
        lhs.add("Chennai");
        lhs.add("Patna");
        lhs.add("Delhi");
        lhs.add("Kolkata");
        lhs.add("Mumbai");
        System.out.println(lhs);

        //TreeSet-this concept is same as TreeMap
        // *Keys are sorted in Ascending Order by default
        TreeSet<String> tree = new TreeSet<>();
        tree.add("Chennai");
        tree.add("Patna");
        tree.add("Delhi");
        tree.add("Kolkata");
        tree.add("Mumbai");
        System.out.println(tree);
    }
}


import java.util.*;
public class Stringbuilder {
    public static void main(String[] args) {
       StringBuilder sb = new StringBuilder("hussain");
       System.out.println(sb);

       System.out.println(sb.charAt(0));
       
       sb.setCharAt(0 ,'m');
       System.out.println(sb);
       
       sb.insert(1, 'a');
       System.out.println(sb);

       sb.delete(5, 7);
       System.out.println(sb);
    }
}

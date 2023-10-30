package CoreJava.Stacks;
import java.util.*;
public class pushpeek {
    public static void main(String[] args) {
        Stack <Integer> st = new Stack<>();
        st.push(30);
        st.push(40);
        st.push(50);
        st.push(60);

        System.out.println(st.peek() + " " + st.size());
        st.pop();
        System.out.println(st + " -> " + st.peek() + " "+ st.size());
        
        
    }
}

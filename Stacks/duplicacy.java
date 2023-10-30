package CoreJava.Stacks;
import java.util.*;
public class duplicacy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        Stack <Character> st  = new Stack<>();
        char ch = str.charAt(0);
        for(int i=0; i<str.length(); i++){
            if(ch == ')'){
                if(st.peek()=='('){
                  System.out.println("duplicate");
                  return;
                }else{
                   while(st.peek() != '('){
                    st.pop();
                   }
                   st.pop();
                }
            }else{
                st.push(ch);
            }
        }
        System.out.println("not duplicate");
    }
}

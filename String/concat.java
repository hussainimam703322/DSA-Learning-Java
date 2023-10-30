

public class concat {
    public static void main(String[] args) {
        String s1 = "imam";
        String s2 = "hussain";
        String fullname = s1 + " " + s2;
        System.out.println(fullname);
        System.out.println(fullname.length());

       for(int i = 0; i<fullname.length(); i++){
         System.out.println(fullname.charAt(i));
       }
    }
}

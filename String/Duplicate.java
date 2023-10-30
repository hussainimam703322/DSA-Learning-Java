import java.util.*;
public class Duplicate {
   public static void Duplicate(String str, int idx, StringBuilder newString, boolean map[]){
      if(idx ==str.length()){
        System.out.println(newString);
        return;
      }
      char currchar = str.charAt(idx);
      if(map[currchar - 'a'] == true){
        Duplicate(str,idx+1, newString, map);
      }
      else{
        map[currchar-'a'] = true;
        Duplicate(str, idx+1, newString.append(currchar), map);

      }
   }
   public static void main(String args[]){
    String str = "appnacoolege";
    Duplicate(str,0,new StringBuilder("str"),new boolean[26]);
   }
}

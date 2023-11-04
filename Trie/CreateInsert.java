public class CreateInsert {
    static class Node{
        Node children[] = new Node[26];
        boolean eow = false;

        Node(){
           for(int i=0;i<26;i++){
            children[i]=null;
           }
       }
    }
    
    public static Node root = new Node();

    public static void insert(String word){
        Node curr = root;
        for(int level=0;level<word.length();level++){
            int idx = word.charAt(level)-'a';
            if(curr.children[idx] == null){
                curr.children[idx] = new Node();
            }
            curr = curr.children[idx];
        }
        curr.eow = true;
    }
    
    public static void main(String[] args) {
        String word[] = {"the","a","there","any","thee"};
        for(int i=0;i<word.length;i++){
            insert(word[i]);
        }
    }
}

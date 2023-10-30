package CoreJava.Tree;
public class BST{
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
        }

    }
    //INSERT NODE IN BST
    public static Node insert(Node root, int val){
        if(root == null){
            root = new Node(val);
            return root;
        }        
        if(root.data > val){
           root.left =  insert(root.left, val);
        }
        else{
            root.right = insert(root.right , val);
        }
        return root;
    }
    //THIS IS USED TO GET SORTED SEQUENCE OF BST
    public static void inorder(Node root){
        if(root==null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }
    //SEARCH A KEY IN BST
    public static boolean search(Node root, int key){
        if(root==null){
            return false;
        }
        if(root.data == key){
            return true;
        }
        if(root.data > key){
          return search(root.left , key);
        }
        else{
            return search(root.right, key);
        }
    }
    //DELETE A NODE
    class Tree {
        // Function to delete a node from BST.
        public static Node deleteNode(Node root, int key) {
            if(root==null){
                return root;
            }
            if(root.data > key){
                root.left = deleteNode(root.left, key);
                return root;
            }
            else if(root.data < key){
                root.right = deleteNode(root.right,key);
                return root;
            }
            else{
                if(root.left == null)
                    return root.right;
                
                else if(root.right == null)
                    return root.left;
                    
                //current root is root.data(Now assign with minimum value means after deleting replace with inorder succcesor)
                root.data = Inordersuccesor(root.right);
                
                root.right= deleteNode(root.right, root.data); 
            
            }    //we need to delete minimum value (left most from right tree i.e minimum) 
            return root;
        }
        static int Inordersuccesor(Node root){
            int minv = root.data; //assigning here current root that need to be deleted with minimum value
            while(root.left != null)
            {
                
                minv = root.left.data;
                root = root.left;
            }
            return minv;
        }
    }
    //driver code
    public static void main(String[] args) {
        int values[] = {8,5,3,1,4,6,10,11,14};
        Node root = null;
        for(int i = 0; i<values.length; i++){
            root = insert(root,values[i]);
        }
        //to get sorted sequence of BST using inorder
        inorder(root);
        System.out.println();

        //searching a node
        // if(search(root,8)){
        //     System.out.println("found");
        // }
        // else{
        //     System.out.println("not founded");
        // }
        
        //delete a Node of case 1 ,case 2 and case 3
        delete(root, 1);
        System.out.println();

        inorder(root);

        
        
        
    }
}
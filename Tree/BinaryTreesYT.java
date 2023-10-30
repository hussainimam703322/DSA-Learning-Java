package CoreJava.Tree;
//creating binary tree and printing the root element
public class BinaryTreesYT {
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            this.left = left;
            this.right =  right;
        }

    }
   //first we need to make a class under which we can make a method 
    static class BinaryTree{
        static int idx = -1;
        //here all nodes return in Node  
        public static Node buildTree(int nodes[]){
           idx++;

            if(nodes[idx] == -1){
                return null;
            }
            
            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);

            return newNode;
        }
    }
    public static void main(String[] args) {
        int nodes[] = {1,2,-1,6,-1,5,-1,-1,3,-1,6,-1,-1};
        //here we make a object of our class so that we can call method using our object
        BinaryTree tree =  new BinaryTree();
        Node root =  tree.buildTree(nodes);
        System.out.print(root.data);
    }
}

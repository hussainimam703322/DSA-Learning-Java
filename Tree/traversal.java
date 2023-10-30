package CoreJava.Tree;
import java.util.*;
//TRAVERSAL IN BINARY TREE

//creating binary tree and printing the root element
public class traversal {
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
   

    //level order traversal
     public static void levelorder(Node root){
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        
        while(!q.isEmpty()){
            Node currNode = q.remove();
            if(currNode==null){
                System.out.println();
                if(q.isEmpty()){
                   break;
                }
                else{
                    q.add(null);
                }
            }
            else{
                System.out.print(currNode.data+" ");
                if(currNode.left !=null){
                    q.add(currNode.left);  
                }
                if(currNode.right !=null){
                    q.add(currNode.right);
                }
            }
        } 
    }
    // count of nodes and time complexity is O(N)
    public static int countofNodes(Node root){
        if(root==null){
            return 0;
        }
        int leftNodes = countofNodes(root.left);
        int rightNodes = countofNodes(root.right);

        return leftNodes + rightNodes + 1;
    }

    //SUM OF NODES

    public static int sumofNodes(Node root){
        if(root==null){
            return 0;
        }
        int leftNodes = sumofNodes(root.left);
        int rightNodes = sumofNodes(root.right);

        return leftNodes + rightNodes + root.data;
    }

    //HEIGHT OF TREE

    public static int height(Node root){
        if(root== null){
            return 0;
        }

        int leftheight = height(root.left);
        int rightheight = height(root.right);
        int myheight = Math.max(leftheight , rightheight) +1;
         //calculate height of both left and right and compare both height                                                    

        return myheight;
    }

    //DIAMETER OF TREE- no. of nodes in the longest path betweeen any 2 nodes
    public static int diameter(Node root){
        if(root==null){
            return 0;
        }
        int leftdiam = diameter(root.left);
        int rightdiam= diameter(root.right);
        int leftheight = height(root.left);
        int rightheight = height(root.right);
        int selfdiam = (leftheight + rightheight +1);
        return Math.max(selfdiam , Math.max(leftdiam , rightdiam));
    }

    public static void main(String[] args) {
        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        //here we make a object of our class so that we can call method using our object
        BinaryTree tree =  new BinaryTree();
        Node root =  tree.buildTree(nodes);
        
        System.out.println(diameter(root));
    }
}

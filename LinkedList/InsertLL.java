package CoreJava.LinkedList;

public class InsertLL {
    Node head;
    //creating node
    static class Node{
        int data;
        Node next;
        //node contains
        Node(int d){
            this.data =d;
            Node next;
        }
    }
    //method to add new node at first of linked list
    public void addfirst(int newdata){
        Node newNode = new Node(newdata);
        if(head == null){
            head =newNode;
            return;
        }
        newNode.next =head;
        head = newNode;
     
    }
    //method to add new node at last of linked list
    public void addLast(int newdata){
        Node newNode = new Node(newdata);
        if(head == null){
            head =newNode;
            return;
        }
        //we should not traverse the whole linked list with head node otherwise head 
        //will be lost after reaching next node so it is better to make head with different name
        //and assign in it as head node
        Node currNode =head;
        while(currNode.next != null){
          currNode = currNode.next;
        }
        currNode.next = newNode;
    }
    //this method is used to access in main method 
    public void printList(){
        if(head ==null){
            System.out.println("list is empty");
            return;
        }
        Node currNode = head;
        while(currNode != null){
            System.out.print(currNode.data + "->");
            currNode = currNode.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        InsertLL list = new InsertLL();
        list.addfirst(4);
        list.addfirst(3);
        list.addfirst(2);
        list.printList();
        list.addLast(5);
        list.printList();    

        list.addfirst(1);
        list.printList();
             
    }
}

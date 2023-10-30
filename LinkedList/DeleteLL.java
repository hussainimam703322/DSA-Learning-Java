package CoreJava.LinkedList;

public class DeleteLL {
    Node head;
    private int size;
    DeleteLL(){
        this.size = 0;
    }
    
    //creating node
    class Node{
        int data;
        Node next;
        //node contains
        Node(int d){
            this.data =d;
            this.next = null;
            size++;
            
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

    //delete first in linked list 

    public void deleteFirst(){
        if(head == null){
            System.out.println("the list is empty");
            return;
        }
        size--;
        head = head.next;
    }

    //delete last in linked list
    public void deleteLast(){
        if(head == null){
            System.out.println("the list is empty");
            return;
        }
        size--;
        //In case there is only one head then corner case
        if(head.next == null){
            head = null;
            return;
        }

        Node SecondLast = head;
        Node LastNode = head.next;
        while(LastNode.next != null){
            LastNode = SecondLast.next;
        }
        SecondLast.next = null;
    }

    public int getSize(){
       return size;
    }
    public static void main(String[] args) {
        DeleteLL list = new DeleteLL();
        list.addfirst(4);
        list.addfirst(3);
        list.addfirst(2);
        list.printList();
        list.addLast(5);
        list.printList();
        

        list.addfirst(1);
        list.printList();

        list.deleteFirst();
        list.printList();

        list.deleteLast();
        list.printList();   

        System.out.println(list.getSize());
    }
}

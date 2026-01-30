public class Head_and_tail_in_linked_list_02 {
     public static class Node{ // Creating a node class of a linked list  
       int data ;  // the value stored inside the node . (int , string , char, boolean , float .......)
       Node next; // actually node is pointing towards the object of the node class so its data type is also node so the name variable data type  is same as of the class name. 
       public Node(int data){ // constructor 
        this.data = data; 
        this.next = null; // next is the reference variable . 
       } 
    
    }
    public static Node head; // head is the first node of the linked list 
    public static Node tail; // tail is the last node of the linked list

    public void addFirst(int data){
        // base case ........................................................
        if (head == null){ // when there is no node in the linked list 
            Node newNode = new Node(data); // creating a nnew node 
            head = tail = newNode; // both head and tail point to the same node 
            return;
        }
        // when there is greater than or equal to 1 node in the linked list
        // step 1 = create a new node 
        Node newNode = new Node(data);
        // step 2 - new node next = head 
        newNode.next = head; // linking Step
        // step 3 - head = new node
        head = newNode; //Assigning head to new node 


    }
    public static void main (String args[]){
    Head_and_tail_in_linked_list_02 aman = new Head_and_tail_in_linked_list_02();
    aman.addFirst(100);
    aman.addFirst(200);
    System.out.println("aman head node data is "+ aman.head.data);
    System.out.println("aman tail node data is "+ aman.tail.data);
   // Time complexity of addFirst() is O(1) constant time 
    }
}

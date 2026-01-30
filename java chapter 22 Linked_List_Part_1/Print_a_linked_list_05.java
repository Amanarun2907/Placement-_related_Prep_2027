public class Print_a_linked_list_05 {
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
            Node newNode = new Node(data); // creating a new node 
            head = tail = newNode; // both head and tail point to the same node 
            return;
        }
        // when there is greater than or equal to 1 node in the linked list
        // step 1 = create a new node 
        Node newNode = new Node(data);
        // step 2 - new node next = head 
        newNode.next = head; // linking
        // step 3 - head = new node
        head = newNode; 
    }
     public void addLast(int data){
        // base case ........................................................
        if (head == null){ // when there is no node in the linked list 
            Node newNode = new Node(data); // creating a nnew node 
            head = tail = newNode; // both head and tail point to the same node 
            return;
        }
        // when there is greater than or equal to 1 node in the linked list
        // step 1 = create a new node 
        Node newNode = new Node(data);
        // step 2 - tail next = new node 
        tail.next = newNode; // linking
        // step 3 - tail = new node
        tail = newNode;
     }
     public void printLL(){ // TIME COMPLEXITY = O(n) as it traveres all the nodes of the linked list
        if(head == null){
            System.out.println("Linked list is empty");
            return;
        }
        Node temp = head ; // creating a temporary node
        while(temp!=null){
            System.out.print(temp.data + " -> "); // print the data of temp 
            temp = temp.next; // moving to the next node 
        }
        System.out.println("null");
     }
    public static void main (String args[]){
   Print_a_linked_list_05 aman = new Print_a_linked_list_05();
   aman.printLL();
    aman.head = new Node(1);
    aman.head.next = new Node(2);
    aman.tail = aman.head.next;
    aman.printLL();
    aman.addFirst(350);
    aman.printLL();
    aman.addFirst(250);
    aman.printLL();
    aman.addLast(300);
    aman.printLL();
    aman.addLast(400);
    aman.printLL();
    // Methods of addition , removal , searching , printing
    // System.out.println("the data stored in head of the linked list is " + aman.head.data); // 250
    // System.out.println("the data stored in 2nd node  of the linked list is " + aman.tail.data); // 400
    //
     }
}

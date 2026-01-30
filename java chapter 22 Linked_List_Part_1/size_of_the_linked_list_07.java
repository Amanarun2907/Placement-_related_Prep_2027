public class size_of_the_linked_list_07 {
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
    public static  int size; // size is the number of nodes in the linked list
       public void addFirst(int data){
        // base case ........................................................
        Node newNode = new Node(data); // creating a new node 
        size++;
        if (head == null){ // when there is no node in the linked list 
        
            head = tail = newNode; // both head and tail point to the same node 
            return;
        }
        // when there is greater than or equal to 1 node in the linked list
        // step 1 = create a new node 
       
        // step 2 - new node next = head 
        newNode.next = head; // linking
        // step 3 - head = new node
        head = newNode; 
    }
     public void addLast(int data){
        // base case ........................................................
        Node newNode = new Node(data); // creating a new node 
        size++;
        if (head == null){ // when there is no node in the linked list 
            head = tail = newNode; // both head and tail point to the same node 
            return;
        }
        // when there is greater than or equal to 1 node in the linked list
        // step 1 = create a new node 
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
     
     public void add (int idx , int data){
        // base case 
        if (idx == 0){// we have to add at the 0th index of the linked list 
            addFirst(data); // so we are calling the addFirst method
            return;
        }
        Node newNode = new Node(data); // creating the new node 
        size++;
        Node temp = head; // creating a temporary node and pointing it to the head
        int i = 0;
        while(i < idx - 1){ // traversing the linked list till the idx - 1 node (previous node ) 
            temp = temp.next;
            i++;
        }
        // i = idx - 1 ; temp -> prev
        newNode.next = temp.next; // linkage between the new node and the next node of the temp (previous node)
        temp.next = newNode; // linkage between the previous node and the new node
     }
    public static void main (String args[]){
   size_of_the_linked_list_07 aman = new size_of_the_linked_list_07();
   aman.printLL();
    // aman.head = new Node(1);
    // aman.head.next = new Node(2);
    // aman.tail = aman.head.next;
    aman.printLL();
    aman.addFirst(350);
    aman.printLL();
    aman.addFirst(250);
    aman.printLL();
    aman.addLast(300);
    aman.printLL();
    aman.addLast(400);
    aman.printLL();
    aman.add(2,1000); // 250->350->1000->300->400
    aman.addLast(4000);
     aman.printLL();
      aman.addLast(40);
     aman.printLL(); 
    System.out.println("Size of the linked list is : " +aman.size);
    // Methods of addition , removal , searching , printing
    // System.out.println("the data stored in head of the linked list is " + aman.head.data); // 250
    // System.out.println("the data stored in 2nd node  of the linked list is " + aman.tail.data); // 400
 // Size of the linked list is the static variable which is incremented whenever we add a new node in the linked list
    }    
}

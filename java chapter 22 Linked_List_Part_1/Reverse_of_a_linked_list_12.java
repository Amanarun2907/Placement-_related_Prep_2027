public class Reverse_of_a_linked_list_12 {
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
    public int removeFirst(){
        // Case 1 : if the linked list is empty ..........................
    if (head == null){ // when there is no node in the linked list 
        System.out.println("Linked list is empty");
        return Integer.MIN_VALUE; // returning the minimum value of integer 
    }
    // Case 2 : if the linked list contains only one node .................
    else if (size==1){
      int val = head.data;
        head = tail = null;
        size = 0;
        return val;  
    }
    int val  = head.data;
    head = head.next;
    size--;
    return val;
     }
     public int removeLast(){
        if(size==0){
         System.out.println("Linked list is empty"); 
         return Integer.MIN_VALUE;  
        }
        else if (size==1){
            int val = tail.data; // tail.data  = head.data as both head and tail point to the same node
            head = tail = null;
            size = 0;
            return val;
        }
        // prev : i =  size-2
        Node prev = head;
        for (int i = 0;i<size-2;i++){
            // prev = prev.next;
            prev = prev.next;  
        }
        int val = tail.data; // int val = prev.next.data;
        prev.next = null;
        tail = prev; // tail is pointing to the previos node of the linked list ....
        size--; // decrementing the size of the linked list as we have removed one node from the linked list
        return val;
     }
     public int itrSearch(int key){ // ITERATIVE SEARCH Time complexity = O(n)
        Node temp = head; // temp node is pointing to the head of the linked list
        int i = 0;
        while(temp!=null){ // linear search by iterative method
            if(temp.data==key){
                return i; // key found at index i 
            }
            temp = temp.next; // moving to the next node .
            i++; // incrementing the index by 1
        }
        // if key is not found anywhere in the linked list then return -1 .
        return -1;
     }
     public int helper(Node head , int key){ // Time complexity = space complexity = O(n) 
 if (head==null){  // if linked list is empty
    return -1;
 }
 if(head.data==key){ // if head.data = = key 
    return 0;
     }
     int idx = helper(head.next,key);
     if (idx == -1){
        return -1; // if key is not found in the recursive call
     }
     return idx+1; // if key is found in the recursive call then we are adding 1 to the index returned by the recursive call
    }
     public int recSearch (int key){
     return helper(head,key);
     }
     public void reverse (){
        Node prev = null ; 
        Node curr = tail = head; // assignement in java is always from right to left in java .... 
        Node next ; 
        while(curr!=null){
           // 3 varaible : prev , curr and next 
           // 4 steps : 
           // step 1 : next  = curr.next 
           // step 2 : curr.next = prev 
           // step 3 : prev = curr 
           // step 4 : curr = next 
              next = curr.next; // step 1
              curr.next = prev; // step 2
              prev = curr; // step 3
              curr = next; // step 4

        }
        // loop stops when my curr becomes null 
        // at this point prev is pointing to the last node of the linked list
        // so , we have to make the head point to the last node of the linked list to reverse the linked list 
        head = prev;
     }
   
    public static void main (String args[]){
 Reverse_of_a_linked_list_12 aman = new Reverse_of_a_linked_list_12();
   aman.printLL();
    // aman.head = new Node(1);
    // aman.head.next = new Node(2);
    // aman.tail = aman.head.next;
    aman.printLL();
    aman.addFirst(350); // 350
    aman.printLL();
    aman.addFirst(250); // 250 -> 350
    aman.printLL();
    aman.addLast(300); // 250 -> 350 -> 300
    aman.printLL();
    aman.addLast(400); // 250 -> 350 -> 300 -> 400
    aman.printLL();
    aman.addLast(1200); // 250 -> 350 -> 300 -> 400 -> 1200
    aman.printLL();
    aman.addLast(1300); // 250 -> 350 -> 300 -> 400 -> 1200 -> 1300
    aman.printLL();
    aman.add(2,1000); // 250->350->1000->300->400->1200->1300
    aman.addLast(4000); // 250->350->1000->300->400->1200->1300->4000
    aman.printLL();
    aman.addLast(40); // 250->350->1000->300->400->1200->1300->4000->40
    aman.printLL(); 
    aman.removeFirst(); // 350->1000->300->400->1200->1300->4000->40
    aman.printLL();
    aman.removeFirst(); // 1000->300->400->1200->1300->4000->40
    aman.printLL();
     aman.removeFirst(); // 300->400->1200->1300->4000->40
    aman.printLL();
    aman.removeLast(); // 300->400->1200->1300->4000
    aman.printLL();
    System.out.println(aman.itrSearch(1200)); // 2
    System.out.println(aman.itrSearch(1300)); // 3
    System.out.println(aman.itrSearch(400)); // 1
    System.out.println(aman.itrSearch(1000000)); // -1
    System.out.println("Size of the linked list is : " +aman.size);
       System.out.println(aman.recSearch(1300)); // 3
    System.out.println(aman.recSearch(400)); // 1
    aman.reverse();
    aman.printLL();
    // Methods of addition , removal , searching , printing
    // System.out.println("the data stored in head of the linked list is " + aman.head.data); // 250
    // System.out.println("the data stored in 2nd node  of the linked list is " + aman.tail.data); // 400
 // Size of the linked list is the static variable which is incremented whenever we add a new node in the linked list
    }  
}

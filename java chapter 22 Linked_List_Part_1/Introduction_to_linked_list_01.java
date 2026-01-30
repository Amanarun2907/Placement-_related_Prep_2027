public class Introduction_to_linked_list_01{
    public static class Node{ // Creating a node class of a linked list  
       int data ;  // the value stored inside the node . (int , string , char, boolean , float .......)
       Node next; // actually node is pointing towards the object of the node class so its data type is also node so the name of the  variable data type  is same as of the class name. 
       public Node(int data){ // constructor 
        this.data = data; 
        this.next = null; // next is the reference variable . So initially it is pointing towards null . No linking is there .
       } 
    }
    public static void main (String args[]){
    System.out.println("Introduction to linked list");

    }
}


// What is a Reference Variable in Java?
// In Java, objects are not stored directly in variables.
// Instead, variables hold references (addresses in memory) to objects created in the heap.
// These are called reference variables.

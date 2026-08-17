import java.util.*;

public class Implementation_of_stack_and_queue_by_Linked_List {
    static class Node{
        int data;
        Node next; 
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
      ; 
    // public static Node tail ;

    static class stack{
        public static Node head = null;
      LinkedList<Integer> l1 = new LinkedList<>();
        
       public boolean isEmpty(){
       // if my linkedlist is empty 
         return head==null;
         // if the linked list is empty then head is pointing towards null 
       }
       public void Push(int data){
        // what is my linkedlist is empty ? 
        // in stack push and pop is always from top and we consider our head as a top
        // create a node
        Node newnode = new Node(data);
        // adding the first node 
        if(head==null){
            head=newnode;
            return ;
        }
        newnode.next = head;
        head = newnode;
        
       }
       public int pop ()
       {
        // what is linkedlist is empty ? 
        if(isEmpty()){
            System.out.println ("Stack is empty no element");
            return -1;
        }
        // we have to pop the element from the top only 
        int remove_element  = head.data;
        head = head.next;
        return remove_element;
       }
       public int peek()
       {
        if(isEmpty()){
            return -1;
        }
        return head.data;
       }
    
    }
    static class queue{
        public static Node head = null;
        public static Node tail = null;

        LinkedList<Integer> l1 = new LinkedList<>();
        public boolean isEmpty(){
        return head==null;
        }
        public void add (int data){
            // in queue we always add the element in the rear so add the element at the last (tail)
            Node newnode = new Node ( data);
            if(isEmpty()){
                head = tail = newnode;
                return ;
            }
            
            tail.next = newnode;
            tail = newnode;
        } 
        public int remove (){
            // in queue removal is always from front (head)


            if(isEmpty()){
                return -1;
            }
            int remove_quantity = head.data;
            head=  head.next;
            return remove_quantity;
        }
        public int peek(){
            return head.data;
        }

    }

public static void main (String []args){
    System.out.println("Time to implement Stack from LinkedList");
    stack s1 = new stack ();
    s1.Push(1);
    s1.Push(10);
    s1.Push(100);
    // push --> 1 10 100
    while(!s1.isEmpty()){
        System.out.println(s1.peek());
        s1.pop();
    }
    System.out.println();
    // 100 10 1

    System.out.println("Time to implement queue from LinkedList");
   queue q1 = new queue ();
    q1.add(1);
    q1.add(10);
    q1.add(100);
    // push --> 1 10 100
    while(!q1.isEmpty()){
        System.out.println(q1.peek());
        q1.remove();
    }
System.out.println();
}
}

public class Queue_using_Linked_List {
    // class of linked list node 
    static class node {
        int data;
        node next ;
        // constructor 
        node(int data){
            this.data = data;
            this.next = null;
        }
    }
    static class queue {
        static node head = null; // head of linked list
        static node tail = null; // tail of linked list 
    public static boolean isempty(){
        // tells me  wheather my linked list is empty or not 
        return head==null & tail==null;
    }
    // add 
    public static void add(int data){
        // add--> tail 
        // in queue => entry = rear and exit = front
    //Create a node
    node newnode = new node(data);

    // if linked list is  empty 
    if(isempty()==true){
        tail=head=newnode;
    }
    tail.next = newnode;
    tail = newnode;

    }

    // remove
    public static int remove(){
        // what if there is no element in the linked list 
        if(isempty()==true){
        System.out.println("queue is  empty");
        return -1;
        }
        int front = head.data; // storing the data of head
        if(head==tail) {
            head=tail=null;
        }
        else{
        head = head.next;
        }
        return front;
    }
    // peek 
    public static int peek(){
        // see the value of head 
        if(isempty()==true){
            System.out.println("queue is empty");
            return -1;
        }
        return head.data;
    }
    }

    
    //Implementation of queue using linked list 
    public static void main(String[] args) {
        queue q1 = new queue ();
        q1.add(77);
        q1.add(89);
        q1.add(100);
        // queue --> FIFO ---> 77 89 100
        while(q1.isempty()!=true){
            System.out.println(q1.peek());
            q1.remove();
        }
    }
}

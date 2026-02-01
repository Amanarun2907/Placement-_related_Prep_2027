
//I/P ---> 5 4 3 2 1 
// O/P ---> 5 1 4 2 3
public class Zig_Zag_LL {
// defing a node class 
public static  class Node{
        int data;
        Node next;
        public Node(int data){ // constructor 
            this.data = data;
            this.next =null;
        }
     }
    public static Node head; // defining head 
    public static Node tail ; // defining tail 
    public  static void print(){ // print function 
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }
    
     public  static void addfirst (int data){ // add first function 
        //creating a new node 
        Node temp = new Node(data);
        if(head == null){
            head = temp;
            tail = temp ;
            return ;
        }
        temp.next = head;
        head = temp ;
    }
    public static void ZigZag(){ 
        // find the middle element 
        // slow fast pointer approach 
        Node slow = head; 
        Node fast = head.next; // as the middle should be the last node of the left part of the linked list
        while(fast!=null && fast.next!=null){
        slow = slow.next; // +1
        fast = fast.next.next ; // +2
        }
        // Where there is slow there is mid ...................
        Node mid = slow ;
        // reverse the 2nd half 
        Node curr = mid.next;
        mid.next = null; // break into two parts;
        Node prev = null ;
        Node next; 
        while(curr!=null){
            next = curr.next;
            curr.next = prev ;
            prev = curr;
            curr= next;
        }


        Node left = head;
        Node right = prev; 
        Node nextl;
        Node nextr;


        // alternate mer
        while(left!=null && right!=null){
          // 4 steps of zig zag fashion
          //storing 
          nextl  = left.next;
          // connection 
          left.next = right;
          // storing 
          nextr=right.next ;
          // connection 
          right.next = nextl;

          // 2 steps of updating 
          left = nextl;
          right = nextr;
        }
    }
    public static void main(String[] args) {
       Zig_Zag_LL l1 = new Zig_Zag_LL();
       l1.addfirst(1);
       l1.addfirst(2);
       l1.addfirst(3);
       l1.addfirst(4);
       l1.addfirst(5);
       l1.addfirst(6);
       // 6 5 4 3 2 1 
       l1.print();
        l1.ZigZag();
       l1.print();
 
    }
    
}

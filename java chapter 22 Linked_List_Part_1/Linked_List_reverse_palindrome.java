

public class Linked_List_reverse_palindrome {
    // class node is defined here ..............
    public class Node {
        // data 
        int data;
        // next (reference variable and pointing to the object of the node class)
        Node next ;
        public Node (int data) { // constructor 
           this.data = data;
           this.next = null;
        }
    }

    public Node head;
    public Node tail;

    // function to reverse the linked list ......................
    public void reverse_LL (){
        // 3 variable and 4 steps 
        Node prev = null;
        Node curr = tail=head;
        Node next ;
        while(curr!=null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }
    // printing of the linked list..........................
    public void print(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }

   // add the element at  the 0TH index 
    public void add_first(int data){
        // creating a new node 
        Node newnode = new Node(data);
        if(head==null){
        head = newnode;
        tail = newnode;
         return;
    }
        
        // newnode.next = head;
        newnode.next = head;
        // head = newnode
        head = newnode;
    

    }



    // palindrome 

    // find the middle element using slow and fast point 
    public Node mid_find (Node head){
        // slow pointer 
        Node slow = head;
        // fast pointer 
        Node fast = head;
        while(fast!=null && fast.next!=null){
           // movement of the slow pointer 
           slow = slow.next;
           // movement of the fast pointer  
           fast = fast.next.next;

        }
        return slow;
    } 
    
    
    // check the right and left part of the linked list 
     public boolean ispalindrome (){
        // always remember that if the linked list has only one element or 0 element then it will considered as palindrome
        if(head == null || head.next ==null){
            return true;
        }
        // 2nd part of the linked list have to be reversed 
        // 3 variable and 4 steps  
        
        Node prev  = null;
        Node curr =  mid_find(head);
        Node next;
        while(curr!=null){
            //1.
            next = curr.next;
            //2.
            curr.next = prev;
            //3.
            prev = curr;
            //4.
            curr=next;
        }
        // head of the left linked list 
        Node left = head;
        // head of the right linked list 
        Node right = prev;

        while(right!=null){
            if(right.data!=left.data){
                return false;
            }
            right = right.next;
            left = left.next;
        }
        // if all the elements are matched then return true
        Node prev_2 = null;
        Node curr_2 = prev;
        Node next_2;
        // reverse(reverse) = original // !(!x) = x
        // process of restoration ........................
        while(curr_2!=null){
           next_2 = curr_2.next;
           curr_2.next= prev_2;
           prev_2=curr_2;
           curr_2 = next_2;
        }
      return true;
        

     }



     public void delete_nth_node(int n){
     // n is the position from the right (from last)
    int sz = 0;
    Node temp = head;
    while(temp!=null){
        temp = temp.next;
        sz++;
    }
    if(n==sz){
        // nth node from the right is the first node from left
        head = head.next;
        return;
    }
    // rp+lp+1 = sz (zero based indexing)
    // lp = sz-rp-1
    // one based index 
    // lp = sz-rp -1+1 = sz-rp
    int idx = 1;
    Node srk = head;
    int inTofind = sz-n;
    while(idx<inTofind){ 
       srk = srk.next;
       idx++;
    }
    // we will find the correct position of the srk after the completion of the loop 
    srk.next = srk.next.next;
     }
    public static void main (String [] args){
       Linked_List_reverse_palindrome l1 = new Linked_List_reverse_palindrome();
        l1.add_first(12);
        l1.add_first(14);
        l1.add_first(16);
        l1.add_first(18);
        l1.add_first(20);
        l1.print();
        System.out.println(l1.ispalindrome());
        l1.reverse_LL();

        l1.print();

        Linked_List_reverse_palindrome l2 = new Linked_List_reverse_palindrome();
        l2.add_first(1);
        l2.add_first(2);
        l2.add_first(2);
        l2.add_first(1);
        l2.print();
        System.out.println(l2.ispalindrome());
        l2.reverse_LL();
        l2.print();
        l2.delete_nth_node(1);
        l2.delete_nth_node(2);
        l2.delete_nth_node(3);
        l2.print();
    }
}

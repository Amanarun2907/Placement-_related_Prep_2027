public class Remove_cycle {
    public static class Node {
        int data ; 
        Node next ; 
        public Node (int data ){
            this.data = data ;
            this.next = null;
        }
    }

    public static Node head ; 
    public static Node tail ;
    
    // public  static void print(){
    //     Node temp = head;
    //     while(temp!=null){
    //         System.out.print(temp.data+" ");
    //         temp = temp.next;
    //     }
    //     System.out.println();
    // }

     public static void addfirst (int data){
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


 // detecting the cycle in linked list
   public static  boolean isCycle(){ // Floyd's Cycle Finding Algorithm
   Node slow  = head;
   Node fast  = head;
   // condition for cycle in linear non cyclic linked list , which we also used to find the middle of the linked list and that also we used in palindrome linked list
   while(fast!=null && fast.next!=null){
    slow= slow.next; // move one step 
    fast = fast.next.next; // move two step 
    if(slow==fast){
        return true;
    }
   }
   return false ; // cycle does not exist 
   // After the starting position , if cycle exits then again slow and fast point will meet at some point but if there is no cycle they will never ever meet again .........
   }

// removing the cycle from linked list
public static void remove_cycle(){
    // detect cycle first 
    Node slow = head;
    Node fast = head;
    boolean srk  = false; 
    while(fast!=null && fast.next!=null){
        slow = slow.next; // +1
        fast = fast.next.next; //+2
        // slow and fast are meeting first time 
        if(slow==fast){
          srk = true;
          break;
        }
    }
    if(srk==false){
        return;  // if no cycle is present then you have not to remove any cycle at all 
    }

    // find meeting point
    slow = head;
    Node prev = null; // to keep track of the node previous to fast
    // slow and fast are meeting second time 
    while(slow!=fast){
        slow = slow.next;
        prev = fast; 
        fast = fast.next;
    }
    // remove cycle 
    prev.next = null; 



    
}
    

    public  static void main(String[] args) {
        head = new Node (1);
         Node temp = new Node (2);
       head.next = temp;
        head.next.next = new Node (3);  
        head.next.next.next = temp;
        // head.next.next.next = new Node (4);
        // 1->2>3>4 (loop do not exist)
        // 1->2->3->1 ( Loop exist)
       
        System.out.println("Before the cycle is removed"+isCycle()); // true
      
        remove_cycle(); // 1->2->3->null
      
        System.out.println("After the cycle is removed"+isCycle()); // false

    }
}

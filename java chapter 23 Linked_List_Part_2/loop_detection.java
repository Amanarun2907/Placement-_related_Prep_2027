public class loop_detection {
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

    public  static void main(String[] args) {
        head = new Node (1);
        head.next = new Node (2);
        head.next.next = new Node (3);  
        // head.next.next.next = head;
        head.next.next.next = new Node (4);
        // 1->2>3>4 (loop do not exist)
        // 1->2->3->1 ( Loop exist)
        System.out.println(isCycle());
    }

}
public class Linked_List{
    // creating a node class of the linked list 
    public static  class Node{
        int data ; 
        Node next; // next is the reference varaible and it is pointing to the object of the node class 
        public  Node(int data){ // Constructor is defined 
            this.data = data;
            this.next = null;
        }
    }
    // Node class is completed here 
    public  Node head ;
    public  Node tail ;
    public  int size;

    //Add first function 
    public  void add_first (int data){
        // base case 
        // if linked list is empty
        Node newnode = new Node(data);
        // i am adding a new node in my linked list
        size++; 
        if(head==null){
            // creating a new node
            // Node newnode = new Node(data);
            // head is pointing towards newnode
            head = newnode;
            // tail is also at newnode
            tail = newnode;
            // as if only one node is present then head and tail is pointing to the newnode only 
            return;
        }


        // creating a new node 
        // Node newnode = new Node(data);
        // now newnode.next = head 
        newnode.next = head;
        // now head is pointing towards newnode
        head  = newnode;

    }

    public  void add_last (int data){
        // base case 
      Node newnode = new Node(data);
      // Again  i am adding a new node in my linked list
      size++;
        // if linked list is empty 
           if(head==null){
            // creating a new node
            // Node newnode = new Node(data);
            head = newnode;
            tail= newnode;
            return;
           }


        // original work 
        // creating a new node first
        // class_Name object_name = new class_name ();
        // String str = new String("Shah Rukh Khan");
        // Node newnode = new Node(data);
        // now the next of the tail is pointing towards newnode
        tail.next = newnode;
        // tail is on newnode now 
        tail = newnode;
    }


    public  void print (){ // O(n) ---> time complexity ....
        if(head==null){
            System.out.println("Linked List is empty");
            return;
        }
        Node temp = head;
        while(temp!=null){ // do not use temp.next!=null as here last node will not be printed because the last node is pointing towards null pointer ....
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    public  void add_middle(int index , int data){
        
       
        if(index==0){
         add_first(data);
         // do not writing size++ here because size is already increased in add_first function
         return;
        }
        // create a new node
        // Node newnode = new Node(data);
        Node newnode = new Node(data);
        size++;
        // initialize the value of temp as head; 
        int i =0 ;
       Node  temp = head;
       while(i<index-1){
        temp = temp.next;
        i++;
       }
       // at i = idx-1 loop stops .............
       // temp at index-1;
       newnode.next = temp.next;
       temp.next = newnode;
    
        
    }
    


    public int remove_last(){
        // linked list is empty 
        if(size==0){
            System.out.println("No node is present in the linked list");
            return Integer.MIN_VALUE;
        }
        // linked list having one node only 
        if(size==1){
            int val = head.data;
            head = null; // head is pointing towards null
            tail=null;  // tail is also pointing towards null
            size = 0;
            return val;
        }
        // general case 
        Node temp = head;
        while(temp.next!=tail){
            // jaab taak temp ka next tail ko point na kare taab taak loop run karega .....
            temp = temp.next; // temp is moving forward ...............
        }
        // temp is at second last node
        int data = tail.data;
        temp.next = null;
        tail= temp;
        size--;
        return data;
    }


    public  int remove_first(){
        // what if the size is 0
        if(size ==0){
            System.out.println("Linked List is empty");
            return Integer.MIN_VALUE;
        }
        // if only one node is present
        else if (size==1){
            int val = head.data;
            head = null;
            tail =  null;
            size=0;
            return val ; // the value in the node that we have deleted ...

        }
        int data = head.data;
        head = head.next;
        size--;
        return data;
    }


     public  int search (int key){ // O(n)
        // create a temp node and point it towards head
        Node temp = head; 
        int idx =0;
        while(temp!=null){ // traversal till last ........
            // searning linearly
            if(temp.data==key){
                return idx;
            }
            // updating the value of temp
            temp = temp.next; 
            // updating the value of idx
            idx +=1; 
        }
        return -1; // key not found 
     }
    

    public  int helper (Node head , int key){
        // base case 
        if(head==null){
            return -1;
        }
        // if key is found at the index 
        if(head.data == key){
            return 0;
        }
        // recurrsive call 
        int idx = helper(head.next,key); 
        // we do not have to use temp node here as we are solving by recursion not by iteration ........ 

        if(idx==-1){
            return -1;
        }
        return idx+1; // to return original index 
    }

     public  int search_recursive(int key){
        return helper(head,key);
        // whatever value is returned by the helper we will return that by this function 
     }
  


     public  void reverse (){ // O(n)............
        // two nodes are very important here 1. prev and 2 . curr
        Node prev = null;
        Node curr = tail = head; 
        // as we are reversing the linked list so the value of the head is assign to the tail and value of tail is assign to the head ...
        while(curr!=null)
{
    //Perform 4 steps 
    //1 . make a next node 
    Node next = curr.next;
    //2 break the bridge b/w curr and next 
    curr.next = prev;
    // move prev to curr
    prev = curr;
    // move curr to next
    curr = next;

}

head = prev;
  }



public  void deleteNthfromEnd(int n){
    // calculate the size of the linked lize ;
    int srk = 0; // size 
     Node aman = head; 
     while(aman!=null){
        aman = aman.next;
        srk++;
     }


     // corner case : delete the first node from the start ........
     if(n == srk){
        // nth node from end is the first node from start
        head = head.next; // deleteing the first node
        return ;
     }



     int i = 1;
     int itofind = srk-n;
     Node prev = head;
     // prev is the previous node
     while(i<itofind){
             prev = prev.next;
             i++;
     }
     prev.next = prev.next.next;
     return;
}


public  Node middle (Node head){ //helper in palindrom 
    Node slow = head;
    Node fast = head;
    while(fast!=null &&fast.next!=null){
        slow = slow.next; // +1
        fast = fast.next.next; //+2

    }
    return slow;
} 


public  boolean isPalindrome(){
    if(head==null || head.next == null){
        return true;
        // if linked list is empty or having only one element then the linked list is considered as a palindrome...

    }

    // step 1 --> find the middle
    Node midnode = middle(head);
    // step-2---> reverse 2nd half
    Node prev = null;
    Node curr = midnode; // only difference 
    Node next;
    while(curr!=null){
        next = curr.next;
        curr.next = prev;
        prev = curr;
        curr = next;
    }
    Node right = prev; // right half head
    Node left = head; // left half head

   while(right!=null){
    if(left.data!=right.data){
        return false;
    }
    left = left.next; //updating step 
    right = right.next; // updating step 

   }
return true;


}
    public static void main(String[] args) {
//         Linked_List l1 = new Linked_List();
//  l1.print();
//         l1.add_first(1);
//         // l1.print(); // 1
//         l1.add_first(2);
//         //  l1.print(); // 2 1 
//         l1.add_last(3);
//         //  l1.print(); // 2 1 3
//         l1.add_last(4);
//          l1.print(); // 2 1 3 4 

//         l1.add_middle(2, 100);
//         l1.print();  // expected output = 2 1 100 3 4


//         l1.add_middle(0, 500);
//         l1.print(); // expected output = 500 2 1 100 3 4
//         l1.add_middle(1, 999);
//         l1.print();
//         System.out.println(l1.size);
//         int ans = l1.remove_first();
//         System.out.println( ans);
//         l1.print();
//         System.out.println(l1.size);
//         int ans2 = l1.remove_last();
//         System.out.println(ans2);
//         l1.print();
//         System.out.println(l1.size);
//         l1.print();
//         int index = l1.search (100);
//         System.out.println(index);
      

//         System.out.println(search_recursive(2));
//         System.out.println(search_recursive(300));


//         l1.print();
//         l1.reverse();
//         l1.print();


//         l1.deleteNthfromEnd(3);
//         l1.print();


        Linked_List l2 = new Linked_List();
        Linked_List l3 = new Linked_List();

        l2.add_last(1);
        l2.add_last(2);
        l2.add_last(2);
        l2.add_last(1);
        l2.print();
        System.out.println(l2.isPalindrome());

        l3.add_last(3);
        l3.add_last(2);
        l3.add_last(8);
        l3.add_last(9);
        l3.print();
        System.out.println(l3.isPalindrome());

        // Using static makes all linked list objects share the same memory, which breaks encapsulation
    }
}
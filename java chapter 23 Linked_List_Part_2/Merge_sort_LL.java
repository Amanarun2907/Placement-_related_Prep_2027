public class Merge_sort_LL {


    // Node class 
     public static  class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next =null;
        }
     }

    // Middle finding 
     public static  Node getMid(Node head){
        Node slow = head;
        Node fast = head.next;
        while(fast!=null && fast.next!=null){
            slow  = slow.next;
            fast = fast.next.next;
        }
return slow; // mid node 
     }

    private static   Node merge(Node head1 , Node head2){
        Node mergedLL = new Node(-1);  // dummy node  / auxillary node 
        // initialization with -1
        Node temp = mergedLL; 
        // why temp is of node type 
        // because it is pointing towards the object of the node class 


        while(head1!=null && head2!=null){
            if(head1.data <= head2.data){
                temp.next = head1;
                head1=  head1.next;
                temp = temp.next;

            }
            else{
                 temp.next = head2;
                head2=  head2.next;
                temp = temp.next;
            }
        }

        while(head1!=null){
         temp.next = head1;
         head1 = head1.next;
         temp = temp.next;
        }
        while(head2!=null){
         temp.next = head2;
         head2 = head2.next;
         temp = temp.next;
        }

        return mergedLL.next;
        // as -1 is my first node 
    }



    public static  Node mergeSort(Node head){
         // if linked list is empty or have only 1 element then it is already sorted 
        if(head== null || head.next==null){
            return head;
        }
        // find the middle element 
        // slow and fast pointer approach 
        Node mid = getMid(head); // this function will give me the value of the mid 
         
        // Dividing the list into 2 parts 
        Node rh = mid.next;
        mid.next= null ;
        Node newright  =  mergeSort(rh); // right part 
        // mergeSort will return me the head of the linked list
        Node newleft  = mergeSort(head); // left part
        // mergeSort will return me the head of the linked list
 
        // Merge the sorted left and right parts 
         return merge(newleft,newright);


    }
    public static  Node head; 
    public static  Node tail; 

    public  static void print(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }
    

    public  static void addfirst (int data){
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

    public static void main(String[] args) {
       Merge_sort_LL l1 = new Merge_sort_LL();
       l1.addfirst(1);
       l1.addfirst(2);
       l1.addfirst(3);
       l1.addfirst(4);
       l1.addfirst(5);
       // 5 4 3 2 1 
       l1.print();
       l1.head = mergeSort(l1.head);
       l1.print();

    }
}

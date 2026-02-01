public class Doubly_linked_list {
    public class Node {
        int data; 
        Node next;
        Node prev ;

        public Node (int data){
            this.data =data;
            this.next = null;
            this.prev = null;
        }
    }

 // add 
 public void addFirst(int data){
    Node newnode = new Node (data);
    size++;
    if(head==null){
        // newnode will be the first node 
        head = newnode;
        tail = newnode;
        return ;
    }
    newnode.next = head;
    head.prev = newnode;
    head = newnode;


 }

 // print 
 public void print(){
    Node temp = head;
    while(temp!=null){
        System.out.print(temp.data+"<->");
        temp = temp.next;
    }
    System.out.print("null");
    System.out.println();
 }
    public static Node head; 
    public static Node tail;
    public static int size ;

// remove last 
public int removeFirst(){
  

    if(head==null){
      System.out.println("Doubly linked list is completely empty");
        return Integer.MIN_VALUE;
    }
    if (size==1){
        int aman = head.data;
         head = null;
         tail= null;
         size--;
         return aman;
    }
      // value conservation 
    int aman  =  head.data;
    head =head.next;
    head.prev = null;
    size--;
    return aman;

}


public void reverse (){
    Node curr = head;
    Node prev = null;
    Node next;
    while(curr!=null){
        next = curr.next;
        curr.next = prev;
        // one extra line ...........
        curr.prev = next;
        prev = curr;
        curr = next;
    }
    head = prev;
}
    public static void main(String[] args) {
      Doubly_linked_list d1 = new Doubly_linked_list(); 
      d1.addFirst(3); 
      d1.addFirst(2); 
      d1.addFirst(1);
      // 1<->2<->3
      d1.print(); // 3
      System.out.println("the size of the doubly linked list is : "+ d1.size); 
// d1.removeFirst();
// d1.print();
// System.out.println("the size of the updated DLL is "+ d1.size);
// d1.removeFirst();
// d1.print();
// System.out.println("the size of the updated DLL is "+ d1.size);
d1.reverse();
d1.print();
    }
}

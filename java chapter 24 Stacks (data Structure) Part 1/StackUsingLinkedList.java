public class StackUsingLinkedList {

    static class Node{
    int data;
    Node next;
    Node (int data){
        this.next = null;
        this.data = data;
    }
    }
    static class Stack {
     static Node head = null;


     public static boolean isEmpty(){
        // if the head of the linked list is empty then return true other wise false...
        return head==null;
     }

     // push 
     public static void push(int data){
        Node newnode = new Node(data);
        if(isEmpty()==true){
           head = newnode;
           return;
        }
        newnode.next = head;
        head= newnode;
     }


     // pop 
     public static int pop (){
        if(isEmpty()==true){
            return -1;
        }
       int top = head.data;
       // below is the most important line if you have to remove the element from the head of the linked list
       
       head = head.next;
       return top;
     }

    // peek 
    // to know the value at the top position 
    public static int peek (){
        if(isEmpty()==true){
            return -1;
        }
        int val = head.data;
        return val;
    }
    }
    public static void main(String[] args){
      Stack s = new Stack ();
      s.push(1);
      s.push(2);
      s.push(3);
      while(s.isEmpty()!=true){
        System.out.println(s.peek());
        s.pop();
      }
    }
}

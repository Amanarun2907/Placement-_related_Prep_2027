import java.util.*;
public class Implementation_of_stack_and_Queue_with_help_of_deque {
    static class queue{
    Deque<Integer> deque = new LinkedList<>();
    // add--> rear
    // remove--> front 
    // peek ---> front
    //add
    public void add (int data){
    deque.addLast(data);
    }
    // remove
    public int remove(){
    return deque.removeFirst();
    }
    // peek
    public int peek(){
    return deque.getFirst();
    }
    }
    static class stack{
    Deque<Integer> deque = new LinkedList<>();
    // Last In First Out 
    // push --> top
    // pop --> top 
    // peek --> top
    // push
    public void push (int data){
    deque.addLast(data);
    }
    // pop
    public int pop (){
    return deque.removeLast();
    }
    // peek
    public int peek()
    {
    return deque.getLast();
    }    
}
    public static void main (String args[]){
       queue q1 = new queue ();
       stack s1 = new stack ();
    //    q1.add(1);
    //    q1.add(2);
    //    q1.add(3);
    //    System.out.println(q1.peek());
    //    System.out.println(q1.remove());
    //    System.out.println(q1.remove());
    //    System.out.println(q1.remove());

       s1.push(1);
       s1.push(2);
       s1.push(3);
       System.out.println(s1.peek());
       System.out.println(s1.pop());
       System.out.println(s1.pop());
       System.out.println(s1.pop());


    }
}
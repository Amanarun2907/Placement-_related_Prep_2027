import java.util.*;
public class Stack_Using_Deque{
    // Deque : Double ended queue 
    // Enqueue : Adding the elements in the  queue (.add())
    // Dequeue : Removing the elements from the queue (.remove())
    // Stack : push , pop and peek 
    // Property : element enter into the stack  and exit from the stack through top only 
    static public class stack {
        // in stack 
        // entry from last
        // exit from last
        // peek from last
        Deque<Integer> deque = new LinkedList<>();
        public void push (int data){
        // front : exit 
        // rear : entry 
        // place of exit = place of entry 
        deque.addLast(data);
        }
        public int  pop (){
           return  deque.removeLast();
        }
        public int peek (){
            return deque.getLast();
        }

    }
    public static void main (String [] args){
     // not using JCF
     stack s1 = new stack();
     s1.push(10);
     s1.push(20);
     s1.push(30);
     // 10 20 30
     System.out.println(s1.peek());
     System.out.println(s1.pop());
     System.out.println(s1.pop());
     System.out.println(s1.pop());
     // 30 20 10 
     
    }
}
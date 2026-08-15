import java.util.*;
public class Queue_using_2_stacks {
    static class queue {
        static Stack<Integer> s1 = new Stack<>(); // stack 1
        static Stack<Integer> s2 = new Stack<>(); // stack 2 

    public static boolean isEmpty(){
        return s1.isEmpty(); // empty function 
    }
    // add 
    // Transfer all the elements from s1 to s2 (pop from s1 and push to s2) till s1 is not empty
    // push the new element to the s1
    // now  tranfer all the elements from s2 to s1 till the s2 is not empty 
    public static void add(int data){
        while (s1.isEmpty()!=true){ // there are elements in s1 
         s2.push(s1.pop());   
        }
        s1.push(data);
        while (s2.isEmpty()!=true){
            s1.push(s2.pop());
        }
    }

    // remove
    public static int remove(){
        if(isEmpty()==true){
            System.out.println("queue is empty");
            return -1;
        
        }
        return s1.pop();
    }
    public static int peek(){
          if(isEmpty()==true){
            System.out.println("queue is empty");
            return -1;
        
        }
        return s1.peek();
    }
    }

public static void  main (String [] args){
    queue q = new queue();
q.add(1);
q.add(11);
q.add(111);
while(q.isEmpty()!=true){
    System.out.println(q.peek());
    q.remove();
}


}
}
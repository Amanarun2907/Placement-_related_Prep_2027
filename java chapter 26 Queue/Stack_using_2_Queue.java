import java.util.*;
public class Stack_using_2_Queue{
    // stack : push , pop and peek 
    // queue : add , remove and peek 
    // i have to implement the stack using 2 queue 
    static class Stack {
        // we have to made two queue 
        Queue<Integer> q1 = new LinkedList<>();
        Queue<Integer> q2 = new LinkedList<>();
        public  boolean isEmpty(){
            return q1.isEmpty() && q2.isEmpty();
        }
        public void push (int data){
        // jo bhi queue non empty hogi ussme mai push karunga 
        // we have to queue 
        if(!q1.isEmpty()){
            q1.add(data);
        } 
        else{
            q2.add(data);
        }
        }
        public int pop (){
        // stack is empty 
        if(isEmpty()){
            System.out.println("Stack is empty");
            return -1;
        }
        int top = -1; // initialise top with -1
        if(!q1.isEmpty()){
        while(!q1.isEmpty()){
            top = q1.remove();
            if(q1.isEmpty()){
                break;
            }
            q2.add(top);
        }
        }
        else{
            while(!q2.isEmpty()){
            top = q2.remove();
            if(q2.isEmpty()){
                break;
            }
            q1.add(top);
        }
       
        }
         return top ;
    }



    }
    public static void main (String [] args){
    Stack s1 = new Stack ();
    s1.push(1);
    s1.push(2);
    s1.push(3);
    s1.push(4);
    s1.push(5);
    s1.push(6);

    while(!s1.isEmpty()){
        System.out.println(s1.pop());
    }
  
    }
}
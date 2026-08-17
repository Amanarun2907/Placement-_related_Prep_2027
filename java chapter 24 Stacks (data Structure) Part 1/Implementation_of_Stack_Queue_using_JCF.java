import java.util.*;
public class Implementation_of_Stack_Queue_using_JCF {
    public static void main (String[]args){
        // implementation of stack using JCF
        System.out.println("Now its time for Stack");
        Stack<Integer> s1 = new Stack <>();
        s1.push(1);
        s1.push(2);
        s1.push(3);

        while(!s1.isEmpty()){
            System.out.println(s1.peek());
            s1.pop();
        }
        System.out.println("Now its time for Queue");
        // implementation of Queue using JCF
           Queue<Integer> q1 = new LinkedList <>();
        q1.add(1);
        q1.add(2);
        q1.add(3);

        while(!q1.isEmpty()){
            System.out.println(q1.peek());
            q1.remove();
        }
    }
}

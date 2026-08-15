
import java.util.*;
public class Queue_using_JCF {
    public static void main(String[] args) {
        System.out.println("implementation using LL ");
        Queue<Integer> q = new LinkedList<>();
        // Queue<Integer> q = new ArrayDeque<>();
        q.add(1);
        q.add(11);
        q.add(111);
        while(q.isEmpty()!=true){
            System.out.println(q.peek());
            q.remove();
        }

       System.out.println("implementation using Array Deque");
        //    Queue<Integer> q = new LinkedList<>();
         Queue<Integer> q1 = new ArrayDeque<>();
        q1.add(2);
        q1.add(22);
        q1.add(222);
        while(q1.isEmpty()!=true){
            System.out.println(q1.peek());
            q1.remove();
        }
    }
}

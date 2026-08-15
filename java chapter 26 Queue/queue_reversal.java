import java.util.*;
public class queue_reversal {
    // i/p -> queue -> 10 20 30 40 50
    // o/p -> reverse(queue) -> 50 40 30 20 10
    public static void reverse(Queue<Integer> q1){
        Stack<Integer> s1 = new Stack<>();
        // putting all the elements of the queue into the stack
        while(!q1.isEmpty()){
            s1.push(q1.remove());
        }
        // again putting all the elements from stack to queue
        while (!s1.isEmpty()){
            q1.add(s1.pop());
        }
    }
    public static void main(String [] args){
        Queue<Integer> q1 = new LinkedList<>();
        q1.add(10);
        q1.add(20);
        q1.add(30);
        // 10 20 30 
        reverse(q1);
        while(!q1.isEmpty()){
            System.out.println(q1.peek());
            q1.remove();
        }
        // 30 20 10 
    }
}
// Auxillary memory (stack)

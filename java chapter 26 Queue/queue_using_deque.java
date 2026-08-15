import java.util.*;
public class queue_using_deque {
    // queue : add , remove , peek 
    // add : rear 
    // remove : front 
    // peek : front 
    static class queue{

        Deque<Integer>deque = new LinkedList<>();
        public void add(int data){
        // add : rear : (last )
        deque.addLast(data);
        }
        public int remove(){
            // remove: front : first
         return deque.removeFirst();
        }
        public int peek()
        {
            // peek : front : first
        return deque.getFirst();
        }
    }
    public static void main(String[] args){
queue q1 = new queue();
q1.add(10);
q1.add(20);
q1.add(30);
// 10 20 30
System.out.println(q1.peek()); // 10
System.out.println(q1.remove()); // 10
System.out.println(q1.remove()); // 20
System.out.println(q1.remove()); // 30 

    }
}

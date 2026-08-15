import java.util.*;
public class Interleave_2_Half_of_the_queue_of_even_length {
    // i/p : 1 2 3 4 5 6 7 8 9 10
    // O/p : 1 6 2 7 3 8 4 9 5 10
    public static void interleave (Queue<Integer> q1){
    // function 
    // we are breaking the queue into 2 equal parts 
    // 2nd part is in original queue but first part is first_half_queue
    Queue<Integer> first_half = new LinkedList<>();
    int Size = q1.size(); // very important 
    // in loop second condition should be static not dynamic ...
    for(int i = 0 ; i<Size/2;i++){ // do not write it like for (int i = 0 ; i<q1.size();i++){ }
        // wonderfull line 
        first_half.add(q1.remove());
    }
while (!first_half.isEmpty()){
        q1.add(first_half.remove());
        q1.add(q1.remove());
    }
    // original queue : 1 2 3 4 5 6 7 8 9 10
    // indexing : 0 to 9 
    // first_half : 1 2 3 4 5 
    // original queue : 6 7 8 9 10
    // By logic original queue : 1 6 2 7 3 8 4 9 5 10

    }
    public static void main(String []args){
    Queue<Integer> q1 = new LinkedList<>();
    q1.add(1);
    q1.add(2);
    q1.add(3);
    q1.add(4);
    q1.add(5);
    q1.add(6);
    q1.add(7);
    q1.add(8);
    q1.add(9);
    q1.add(10);
    interleave(q1);
    // 1 2 3 4 5 6 7 8 9 10
    while (!q1.isEmpty()){
        System.out.println(q1.remove());
     
    }
    }
}

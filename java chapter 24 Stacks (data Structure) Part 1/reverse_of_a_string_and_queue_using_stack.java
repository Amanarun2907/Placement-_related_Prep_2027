import java.util.*;
public class reverse_of_a_string_and_queue_using_stack {

    public static void reverse_queue(Queue<Integer> q1){
        Stack <Integer> s1 = new Stack <>();
        while(!q1.isEmpty()){
            s1.push(q1.remove());
        }
        while(!s1.isEmpty()){
            q1.add(s1.pop());
        }
    }


    public static String reverse_string(String str){
        // reverse of this  string 
        Stack <Character> s1 = new Stack <>();
        int idx = 0;
        while(idx<str.length()){
             s1.push(str.charAt(idx));
             idx++;
        }
        StringBuilder sb =  new StringBuilder();
        while(!s1.isEmpty()){
            char ch = s1.pop();
            sb.append(ch);
        }
        return sb.toString();
    }
    public static void main (String [] args){
    //     Queue<Integer> q1 = new LinkedList<>();
    //     q1.add(1);
    //     q1.add(2);
    //     q1.add(3);

    //     System.out.println();

    //     reverse_queue(q1);

    //    while(!q1.isEmpty()){
    //     System.out.println(q1.peek());
    //     q1.remove();
    //    }
    String name = "ARUN KUMAR JAIN";
    System.out.println(reverse_string(name));
    }
}

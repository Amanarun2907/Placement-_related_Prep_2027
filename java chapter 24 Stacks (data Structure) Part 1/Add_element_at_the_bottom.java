import java.util.*;
public class Add_element_at_the_bottom {

    public static void pushAtBottom(Stack<Integer> s , int data){
        // base case 
        if(s.isEmpty()==true){
            s.push(data);
            return ;
        }

        // recursive 
        int top = s.pop();
        pushAtBottom(s,data);
        s.push(top);
    }
    public static void main(String[] args) {
       Stack <Integer> s = new Stack <>();
       s.push(1);
       s.push(2);
       s.push(3);

       pushAtBottom(s,4);
       while(s.isEmpty()!=true){
        System.out.println(s.peek());
        s.pop();

       }
       // s is the stack and 4 is the element we are going to push at bottom
    }
}

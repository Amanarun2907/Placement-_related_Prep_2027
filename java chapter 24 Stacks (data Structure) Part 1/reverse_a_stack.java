import java.util.*;

public class reverse_a_stack {
    public static void pushAtBottom(Stack<Integer> s , int data){
        // base case 
        if(s.isEmpty()==true){
            s.push(data);
            return ;
        }

        // recursive 
        int top = s.pop(); // store the element we are removing 
        pushAtBottom(s,data); // recursive call 
        s.push(top); // pushing 
    }
  public static void printStack (Stack<Integer>s ){
  while(s.isEmpty()!=true){
    System.out.println(s.pop());
    
  }
  }

  public static void reverse_stack (Stack<Integer> s){
    if(s.isEmpty()==true){
        return ;
    }
    int top = s.pop(); // you have to remove the top element 
    reverse_stack(s); // function calling 
    pushAtBottom(s,top); // push the element at the bottom ...............

  }
 

 public static void main(String[] args) {
     Stack <Integer> s = new Stack <>();
     s.push(1);
     s.push(2);
     s.push(3);
    // 3 2 1
    reverse_stack(s);
    printStack(s);
     
     // 1 2 3 

 }   
}

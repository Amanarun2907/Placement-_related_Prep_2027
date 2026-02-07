
import java.util.*;
public class stack_implementation_using_java_collections_framework {


    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
    // by this line we actually build a complete stack using JCF 
    for (int i = 1 ; i<=10;i++){
        s.push(i);
    }
    while(s.isEmpty()!=true){
        System.out.print(s.peek()+" ");
        s.pop();
    }
   
    }
}
// Last in first out rule is applicable here 

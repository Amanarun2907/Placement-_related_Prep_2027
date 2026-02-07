
import java.util.*;
public class StackUsingArrayList{
    static class Stack {
// creating a array list
    static ArrayList<Integer> list = new ArrayList<>();
// add , get , set, contains , remove ...........
    public static boolean isEmpty(){
        // check if the array list is empty or not 
    return list.size()==0;
    // if the value of list.size()==0 then return true otherwise return false ;
}
// push  (Add)
public static void push (int data){
    // if array list is empty then also we can add the element 
    // list is the arraylist here
    list.add(data);

}
//pop (remove)
public static int pop(){
    // if array  list is empty then no element to remove ......
    if(isEmpty()==true){
        return -1;
    }
    int top = list.get(list.size()-1);
    list.remove(list.size()-1);
    return top;
}
//peep operation  (See)
public static int peek(){
    if(isEmpty()==true){
        return -1;
    }
    // if array list is empty then no element to see also 
     return list.get(list.size()-1);
}
    }
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        while(s.isEmpty()!=true){
            System.out.println(s.peek());
            s.pop();
        }
    }
}
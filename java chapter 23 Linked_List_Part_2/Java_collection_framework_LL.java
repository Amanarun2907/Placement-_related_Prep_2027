import java.util.*;
public class Java_collection_framework_LL {
    
    
    public static void main(String[] args) {
    // create 
    // do not use float , boolean , int ---->  Float , Integers , Boolean
    LinkedList<Integer> l1 = new LinkedList<>(); 
    // adding of the elements in linked list 
        l1.addLast(1);
        l1.addLast(2);
        l1.addFirst(3);
        l1.addFirst(4);
// [4 3 1 2]

    // Printing the linked list 
    System.out.println(l1); // [4, 3, 1, 2]
    // removing elements 
    l1.removeLast();
    l1.removeFirst();

    // Printing the linked list 
    System.out.println(l1);  // [3, 1]

    }
}

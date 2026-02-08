import java.util.*;
// given a balanced expression , find if it contains duplicate parentheses or not 
// a set of parenthesis are duplicate if the same subexpression is surronded by multiple parenthesis
// return true if it contains duplicates and false if it does not contain duplicates ....

public class Duplicate_parenthesis {
    public static boolean is_valid (String str){
        // stack creater 
        Stack<Character> s = new Stack<>();

        for(int i = 0 ; i<str.length();i++){
         // storing the current character 
         char ch = str.charAt(i);
         // operator = + , - ,*,/,%
         // operator = a,b 
         // opening = "("
         // Closing = ")"
         if(ch ==')'){
            // case of closing character 
            int count = 0; // counting 
            while(s.isEmpty()!=true && s.peek()!='('){
                s.pop();
                count++;
            }
            if(count<1){
                return true; // it is duplicate valid string
            }
            else{
                s.pop(); // romove = '('
            }
         }
         else{ // case of opening character 
            s.push(ch);
         }
           
        }
        // if the string is not a duplicate string . Bydefault the string given to you is the valid string
        return false;
    }
    public static void main(String[] args) {
        String str = "((a+b))"; // true
        String str1 = "(a-b)"; // false 
        System.out.println(is_valid(str));
        System.out.println(is_valid(str1));
    }
}

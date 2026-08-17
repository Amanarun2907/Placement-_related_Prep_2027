import java.util.*;
// given a balanced expression , find if it contains duplicate parentheses or not 
// a set of parenthesis are duplicate if the same subexpression is surronded by multiple parenthesis
// return true if it contains duplicates and false if it does not contain duplicates ....

public class Duplicate_parenthesis {
    // Function 
    public static boolean is_valid (String str){
        // stack creater 
        Stack<Character> s = new Stack<>();

        for(int i = 0 ; i<str.length();i++){
         // storing the current character (Track the character) 
         char ch = str.charAt(i);
         // operator = + , - ,*,/,%
         // operator = a,b 
         // opening = "("
         // Closing = ")"
         if(ch ==')'){ // closing character
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
           // for the opening character we have to push it in stack 
           // but for duplicate character we have to check the value of count (<1 or >1) if it is less than 1 then there is no operator or operand is present between parenthesis then it is a duplicate parenthesis so return true and string is valid (it is given in the question ) 
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

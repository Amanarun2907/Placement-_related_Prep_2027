import java.util.*;  
public class Valid_Parenthesis {

   public static boolean isValid (String str){
      // true----> if the string is  valid 
      // false ---> if the string is not valid 
      // use of stack


      Stack<Character> s = new Stack<>();
      for (int i = 0 ; i<str.length();i++){
         char ch = str.charAt(i); // this is my current character
         // Approach 
         // As fast as you get the opening character in the string you have to add it in stack 
         // if there are only clossing character then also string is invalid  
         // as you get an closing character you have to check it with the head of the stack if they match then continue , if not you have to return false 
         // at last check the length of stack if stack is not empty then there is a possibility that there are some opening character still left in the i/p string 

         if(ch=='[' || ch =='{' || ch=='('){
            s.push(ch);
         } // opening character
         else{
            // i/p string do not contain any opening character then the string is empty 
            // if string is empty then the length is 0 
            if(s.isEmpty()==true){
               return false;
            }
            if((s.peek()=='(' && ch==')') || // ()
            (s.peek()=='{' && ch =='}') ||  // {}
            (s.peek()=='[' && ch ==']') ){ // []
                 // opening and closing must be of same type and order also matter 
                 s.pop();
            }
            else{
               return false;
            }
         }
      }
      if(s.isEmpty()==true){
         return true;
      }
      else{
         return false;
      }

   }
   public static void main (String[] args ){
    String str = "({})[]"; // TRUE
    String str1 = "({[)]}"; // false
    String str2 = "})]}}}}]]]]])"; // false 
    String str3 = "((((()[]{})" ; // false 
    String str4 = "(){}[]({})";
    System.out.println(isValid(str));
    System.out.println(isValid(str1));
    System.out.println(isValid(str2));
    System.out.println(isValid(str3));
    System.out.println(isValid(str4));
    //Given a string s containing just the characters '(' , ')' ,'{' , '}' , '[' ,']' 
    // determine if the i/p string is valid or not 
    // rules of validation 
    // open bracket must be closed by the same time of bracket '[]' , '{}' , '()'
    // open bracket must be closed in the correct order 
    // every close braket has the corresponding open bracket of the same type 
    // Implementing of this question by the time complexity of o(n)
   
   }
}
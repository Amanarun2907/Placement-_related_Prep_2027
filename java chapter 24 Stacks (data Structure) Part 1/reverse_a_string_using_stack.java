import java.util.*; // JCF 
public class reverse_a_string_using_stack {

    public static String reverseString(String str){
        Stack<Character> s = new Stack <>(); // stack formation using Java collection framework 
        int idx = 0; // initialization 
        while(idx<str.length()){
            s.push(str.charAt(idx)); // stack adding 
            idx++;
        }
    StringBuilder result = new StringBuilder ("");
    while(s.isEmpty()!=true){
        char curr = s.pop(); // remove 
        result.append(curr); // add 
    }

    return result.toString(); // string builder to string 
    }
    public static void main(String[] args) {
        String str = "Shah Rukh khan ";
        String aman = reverseString(str);
        System.out.println(aman);
    }
}

import java.util.*;
public class string_first_word_to_upper_case {
    // creating a function 
    public static String upcase( String str )
    {
        String str1  = ""; // creating a blank string
         str1 = str1+Character.toUpperCase(str.charAt(0)); 
         for (int i = 1;i<str.length();i++)
         {
            // first word of each letter must be capital and that letter must be after space 
            if(str.charAt(i)==' '  && i<str.length()-1)
            {
                 str1 = str1 + str.charAt(i);
                i++; // i = i + 1
                str1 = str1+Character.toUpperCase(str.charAt(i));
            }
            else{
              str1 = str1+str.charAt(i) ;         
              }

         }
        return str1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("enter the string");
        String str = sc.nextLine(); // importance of nextLine();
       System.out.println("Answer is: "+upcase(str));
    }
}

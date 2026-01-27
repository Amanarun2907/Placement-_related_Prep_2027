import java.util.*;
public class String_permutation_lexicographic_order {
    //String "abc"
    // o/p => abc , acb, bac,bca,cab,cba
    //String "aaa"
    // o/p => aaa,aaa,aaa,aaa,aaa,aaa
    public static void string_permutation(String str , String ans , ArrayList<String> srk){
        // Recursion 



        // base case 
         if(str.length()==0){
            srk.add(ans);
         }

        // Kaam (Recursion)
        // travel on each character of string first 
        for (int i = 0 ;i<str.length();i++){
            // capture the current character first 
            char ch = str.charAt(i);
            // removing the current character from the string 
            String new_str = str.substring(0,i)+str.substring(i+1);
            // recursive call 
            // adding the current_character in ans .........
            string_permutation(new_str,ans+ch,srk);
 
        }

    } 




    public static ArrayList<String> main_function (String S){
        String ans = "";// creating an empty list to store
        ArrayList<String> new_list = new ArrayList<>(); // creating a  new array list 
        char ch [] = S.toCharArray(); // convert an string to character array 
        Arrays.sort(ch); // sorting of the array 
        S = new String(ch); // Convert the array into a string
        // function call 
        string_permutation(S, ans, new_list);
        Collections.sort(new_list); // sorting of the arraylist
        return new_list;

    }

    public static void main(String[] args) {
        System.out.println(main_function("abc"));
        System.out.println(main_function("AAA"));
    }
}

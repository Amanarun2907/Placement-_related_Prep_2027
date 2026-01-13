public class Remove_duplicates_in_a_string_basic_part_02 {
   public static void removeDuplicates (String str, int idx, StringBuilder newstr,boolean map[]){
   // String str = > original string 
   // idx = indicating the position 
   // Stringbuilder newstr => creating a string where there is no duplicates. 
   // boolean map[] => we are creating an array that is representing the following 
   //'a'==>map[1],'b'=>map[2]...........
    // by recursion only 
    // base case of recurrsion......................................................
    if (idx==str.length()){ // this is our base case 
        System.out.println(newstr);
        return;
    } 
    // kaam 
    char currChar = str.charAt(idx); // here we use charAt function of string class .....
    if(map[currChar-'a']==true){ 
         // duplicate
        // here we are doing type conversion ............
        // means duplicate exists so we just have to shift the position of our idx by 1 
        removeDuplicates(str, idx+1, newstr, map); // we are traversing the original string ....
    }
    else{ // duplicate does not  exits then we have to put that character in newstr and also in map that the position of currChar-'a' we have to marks it true as map is our boolean variable .
        map[currChar-'a']=true;
        removeDuplicates(str, idx+1, newstr.append(currChar), map);
    }
   }
    public static void main(String[] args) {
    String str="birlashikshakendra";
    // StringBuilder str = new StringBuilder(str);
    // boolean map [] = new boolean [26];
    removeDuplicates(str, 0, new StringBuilder(""),new boolean[26]);
    // Type conversion 
    // System.out.println('a'-'a'); // output = 0
    // System.out.println('b'-'a'); // output = 1
    // System.out.println('c'-'a'); // output = 2
    // System.out.println('z'-'a');// output = 25
    }
}
// Question 
// you have to remove the duplicates from the string 
// the characters in the string are from 'a' to 'z' only 
// example : "birlashikshakendra" as i/p 
// o/p = "birlashkend"
// solve using recursion 
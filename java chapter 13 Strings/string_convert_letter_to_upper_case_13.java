
public class string_convert_letter_to_upper_case_13 {
 public static String touppercase(String str ){
    StringBuilder  sb = new StringBuilder(""); // formation of the stringBulider.

    char ch = Character.toUpperCase(str.charAt(0)); // starting letter of the String
    sb.append(ch); // add to the sb that is the object of string builder 
   for (int i = 1;i<str.length();i++){
    if (str.charAt(i)==' ' &&  i<str.length()-1){  
        sb.append(str.charAt(i)); // blank space 
         i++; // increment the value of i
        sb.append(Character.toUpperCase(str.charAt(i))); // toUpperCase is the inbuilt function of the String
    }
    else {
        sb.append(str.charAt(i));
    }
   }
   return sb.toString(); // stringBuilder conversion into String
 }
    public static void main(String[] args) {
    //    char a = 'b';  
    //    char b = 'A';
    //    System.out.println(Character.toUpperCase(a)); // small into capital 
    //    System.out.println(Character.toLowerCase(b));  // capital into small 
   
    String str = "hi i am aman jain.";
    System.out.println(touppercase(str));


}
}
// <codenation>
// input = "hi i am aman jain " 
// output = "Hi I Am Aman Jain" // first letter of each word is in upper case 
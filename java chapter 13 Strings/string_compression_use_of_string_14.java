public class string_compression_use_of_string_14 {
    // String compression problem 
    // input = "aaabbbcccddd" ---> output = "a3b3c3d3"
    // input = "abc"---> output = "abc"


    // creating a function for string compression 
    public static String compress (String str){
    // USE OF STRING 
    //     String newstr = ""; // empty string ................................................................
    //     for (int i = 0 ;i<str.length();i++){
    //         Integer count = 1; // creating an object with name count of Integer class and we initialize it with 1
    //         while (i<str.length()-1 && str.charAt(i)==str.charAt(i+1)){
    //             count++; 
    //             i++;
    //         } 
    //         newstr += str.charAt(i);
    //         if(count>1){
    //             newstr = newstr + count.toString(); // toString() method is used 
    //         }
    //     }
    //     return newstr; // compress string 
    // }
        // .........................................................
        // USE OF STRING BUILDER 
        // creating a empty string builder first 
        StringBuilder sb = new StringBuilder(""); // creating a empty string builder 
        for (int i  = 0;i<str.length();i++)  // for loop 
        {
            Integer count = 0;  // assigning a count variable 
            // we have not used int here , we are using Integer as we have to convert it into String 
            while (i<str.length()-1 && str.charAt(i)==str.charAt(i+1))
            {
                count++;
                i++;
            }
            sb.append(str.charAt(i));    // important step (no matter what is the frequency of the character just add the character)
            if(count>1){   // means frequency of the character in the string is greater than 1  
                sb.append(count.toString());  // add the number
            }
        }
        return sb.toString();

        }
    
    public static void main(String[] args) {
        String str = "aaaaaasbbbbbbbbrrrrrrccccccddef";
        System.out.println(compress(str)); //a6sb8r6c6d2ef
        String str1 = "abcdefg";
        System.out.println(compress(str1));
    }
}
// homework {try this with string builder} 
// Case of String builder : The code snippet iterates through the input string 'str' once in a for loop, where n is the length of the input string. Within the loop, there is a while loop that may iterate through a portion of the string, but overall the time complexity is still linear with respect to the length of the input string.
// Case of String : The code snippet iterates through the input string 'str' once using a for loop, and within that loop, it may also iterate through consecutive characters in the while loop. Therefore, the overall time complexity is linear, O(n), where n is the length of the input string 'str'.
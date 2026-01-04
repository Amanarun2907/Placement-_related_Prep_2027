public class String_function_substring_09 {
    public static String substring(String str , int startindex , int endindex){
        // user defined  function of substring in java
            String str1  = ""; // initalize str1 with null string
            // starting index is included but ending index is not in substring 
            for (int i = startindex;i<endindex;i++){
                // string concatenate 
                str1 =str1+str.charAt(i); // string concatenation 
            }
            return str1;
    }
    public static void main(String[] args) {
        String str = "Arun_kumar_jain";
       System.out.println(str.substring(2,6)); // inbuilt function of substring in Section String of java  like inbuit fnction for sorting of elements of an array 
        System.out.println(substring(str, 2, 6)); // un_k
    }
}
// there is a difference in subsequence and substring (CONTINUOUS PART)
// We are asking the user at which continuous part of the string he/she is interested so that if user answer we can print that part . 

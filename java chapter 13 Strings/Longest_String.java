


public class Longest_String{

    public static String longest_string (String words[]){
        // array of string is given 
        // pick a word (element of array)
        // pick a prefix (substring ) of the word 
        // update the answer 
        String answer ="";
        for (int i = 0 ; i<words.length;i++){
               String word = words[i]; // selection of a word
             boolean valid = true;
        for (int len = 1 ; len<=word.length();len++){ // upper range is excluded in str.substring(lower_range , upper_range)
            String prefix = word.substring(0,len);
            boolean found = false;
            for (int j = 0;j<words.length;j++){
                if(prefix.equals(words[j])==true){
                    found =true;
                    break;
                }
            }
            if(found==false){
               valid = false;
               break;
            }
        }
        if(valid==true){
        if(answer.length()<word.length() // longest 
         || answer.length()==word.length()&& (answer.compareTo(word))>0 ){ // lexicographic
            answer = word;
        }
    }    
            }
             return answer;
        }
   
    public static void main(String[] args) {
        String arr [ ] = {"p", "pr", "pro", "probl", "problem", "pros", "process", "processor"};
        String arr1 [] = {"ab", "a", "abc", "abd"};
        System.out.println(longest_string(arr)); // pros
        System.out.println(longest_string(arr1)); // abc 

    }
}
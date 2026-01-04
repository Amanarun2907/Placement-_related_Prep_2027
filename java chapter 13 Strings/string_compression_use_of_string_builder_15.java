public class string_compression_use_of_string_builder_15 {
        // input = "aaabbbcccddd" ---> output = "a3b3c3d3"
        // input = "abc"---> output = "abc"
        // creating a function for string compression 
        public static String compress (String str){
            StringBuilder newstr= new StringBuilder(""); // empty stringbuilder  
            for (int i = 0 ;i<str.length();i++){
                Integer count = 1; // creating an object with name count of Integer class and we initialize it with 1
                while (i<str.length()-1 && str.charAt(i)==str.charAt(i+1)){
                    count++;
                    i++;
                } 
                newstr.append(str.charAt(i));
                if(count>1){
                    newstr.append(count.toString());
                }
            }
            return newstr.toString(); // compress string 
    
            }
        
        public static void main(String[] args) {
            String str = "aaaaaasbbbbbbbbrrrrrrccccccddef";
            System.out.println(compress(str)); //a6sb8r6c6d2ef
            String str1 = "abcdefg";
            System.out.println(compress(str1));
        }
    }
    // homework {try this with string builder} 

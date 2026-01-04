

public class why_strings_are_immutable_11 {
    public static void main(String[] args) {
        String s1 = "tony";
        String s2 = "Tony";
        String s3 = new String ("Tony");

        // Note: s1 and s2 are the reference variable that are pointing to the "Tony" in the intern Or String pool present in the heap...... 
        // so s1 and s2 are pointing to the same but s3 is the reference variable pointing to the different Tony in the intern pool 
        // if (s1==s2){
        //     System.out.println("Strings are equal"); 
        // }else{
        //     System.out.println("Strings are not equal ");// output
        // }
        // if (s2==s3){
        //     System.out.println("Strings are equal");
        // }else{
        //     System.out.println("Strings are not equal "); // output
        // }
        // if (s1.equals(s3)){ // focus on the content 
        //     System.out.println("Strings are equal"); 
        // }else{
        //     System.out.println("Strings are not equal "); // output 
        // }
        // if (s3.equals(s2)){
        //     System.out.println("Strings are equal"); // output
        // }else{
        //     System.out.println("Strings are not equal "); 
        // }
        // if (s3.compareTo(s2)==0){
        //     System.out.println("Strings are equal"); // output
        // }else if (s3.compareTo(s2)>0){
        //     System.out.println("Strings are not equal "); 
        // }
        // else {
        //     System.out.println("Strings are not equal ");  
        // }
              
             
        // if (s1.compareTo(s2)==0){ // "tony "  "Tony"  ---> tony  
        //     System.out.println("Strings are equal (0)"); // output
        // }else if (s1.compareTo(s2)>0){
        //     System.out.println("Strings are not equal (+ve) ");  // output 
        // }
        // else {
        //     System.out.println("Strings are not equal (-ve) ");  
        // } 

        // System.out.println(s1.compareTo(s2)); // output should be positive 
        // System.out.println(s2.compareTo(s1)); // output should be negative 
        // System.out.println(s3.compareTo(s2)); // ouptut = 0 
      
    //   String s4 = "Aman";
    // for (char i = 'a' ;i<'k';i++){
    // System.out.println(s4 += i);
    //   }
    // }

    String s5 = "arun";
    String s6 = "Arun";
    System.out.println(s5.equals(s6));  // false 
    }
}
    // concept............................................
    // interning..........................................
    // stack and heap memory..............................
    // string pool / intern pool..........................
    // reference variable.................................
    //....................................................
    // in string we are not able to commit any changes in the existing string .

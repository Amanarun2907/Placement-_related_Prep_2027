public class string_function_compare_08 {
    public static void main(String[] args) {
        // concept of interning in string 
        String s1 = "Tony";
        String s2 = "tony"; 
        String s3 = new String("Tony");
        if (s1==s2){
            System.out.println("Strings are equal"); 
        }else{
            System.out.println("Strings are not equal ");// output
        }
        if (s1==s3){
            System.out.println("Strings are equal");
        }else{
            System.out.println("Strings are not equal "); // output
        }
        if (s1.equals(s3)){ //In Java, the equals() function compares the content of two strings for equality. It is case-sensitive and returns true if both strings have the same sequence of characters, otherwise false. 
            System.out.println("Strings are equal"); // output 
        }else{
            System.out.println("Strings are not equal ");
        }
        if (s3.equals(s1)){
            System.out.println("Strings are equal"); // output 
        }else{
            System.out.println("Strings are not equal ");
        }
    }
}
// equals() finction in string basically comparing the content of the two strings with each other . (Simple)
//In Java, the equals() function compares the content of two strings for equality. It is case-sensitive and returns true if both strings have the same sequence of characters, otherwise false. 
// it is case senstive in nature
// two type of memory in computer 
// heap and stack memory 
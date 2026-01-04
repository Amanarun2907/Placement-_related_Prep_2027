public class print_largest_string_10 {
    // function to print the largest string according to the lexicographic order 
    // Lexicographic order is a generalization of the way words are alphabetically ordered in dictionaries.
    public static String largest_string(String str[]){
        // str is a string  
        String largest = str[0];
   for (int i = 0;i<str.length;i++){
        if (largest.compareTo(str[i])<0){ // it means str[i]>largest so update the value of largest with str[i] .... 
            largest = str[i];
        }
   }
   // compare to ignore case();
   return largest ; 
    }
    public static void main(String[] args) {
        // comparision of string in lexicographic  order 
        // string array in which names of various fruits 
        // str1.compareTo(str2)---> 0 : str1 = str2 , -ve : str1<str2 ,+ve: str1>str2 
        String str []={"apple" ,"mango","chicku","pineapple","banana"};
        System.out.println(largest_string(str));

    }
}

// The compareTo() method in Java is used to compare two strings lexicographically. It is defined in the java.lang.String class and implements the Comparable interface. Here's how it works:

// Key Points:
// Comparison Basis:

// The method compares each character of two strings sequentially using their Unicode values.
// The comparison stops as soon as a mismatch is found or all characters are compared.
// Return Values:

// 0: If the strings are equal.
// Negative Value: If the calling string is lexicographically smaller than the argument string.
// Positive Value: If the calling string is lexicographically larger than the argument string.
// Case Sensitivity:

// It is case-sensitive, so uppercase letters are considered smaller than lowercase letters.
// Comparison Length:

// If the strings are identical up to the length of the shorter string, the longer string is considered greater
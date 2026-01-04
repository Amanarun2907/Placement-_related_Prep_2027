

public class string_builder_12 {
    public static void main(String[] args) {
//      String s1 = "aman" ;
//      for (char i = 'a' ; i<'z';i++){
//         System.out.println(s1+=i);
//         // output 
// // amana
// // amanab
// // amanabc
// // amanabcd
// // amanabcde
// // amanabcdef
// // amanabcdefg
// // amanabcdefgh
// // amanabcdefghi
// // amanabcdefghij
// // amanabcdefghijk
// // amanabcdefghijkl
// // amanabcdefghijklm
// // amanabcdefghijklmn
// // amanabcdefghijklmno
// // amanabcdefghijklmnop
// // amanabcdefghijklmnopq
// // amanabcdefghijklmnopqr
// // amanabcdefghijklmnopqrs
// // amanabcdefghijklmnopqrst
// // amanabcdefghijklmnopqrstu
// // amanabcdefghijklmnopqrstuv
// // amanabcdefghijklmnopqrstuvw
// // amanabcdefghijklmnopqrstuvwx
// // amanabcdefghijklmnopqrstuvwxy
//      } 




// Integer a = 10; // Object of a integer class 
// System.out.println(a.toString());
// Character  b  = 'B'; // Object of a character class 
// System.out.println(b.toString());


// StringBuilder s1 = new StringBuilder();
// for (char i = 'a';i<='z';i++){
//     s1.append(i);
//     // time complexity o(26) / o(n) as n = 26
// }
// System.out.println(s1); //abcdefghijklmnopqrstuvwxyz
// System.out.println(s1.length()); // 26 
// System.out.println(s1.charAt(10));// k





String s2 = new String ("");
for (char i = 'a';i<='z';i++){
    System.out.println(s2 = s2+i);
    // time complexity = o(n*n);
}
System.out.println(s2); //abcdefghijklmnopqrstuvwxyz
System.out.println(s2.length()); // 26


}
}
// string builder 
// append function (adding character in the string builder at the last place )
// There is the huge difference in terms of time complexity in case of stringbuilder and string
// length function in string builder 
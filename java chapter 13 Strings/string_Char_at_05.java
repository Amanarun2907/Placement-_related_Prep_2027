import java.util.*;
public class string_Char_at_05 {
    public static void printletters(String str){ // this is the function to print all the characters of the string using charAt();
        for (int i = 0 ; i<str.length();i++){
            System.out.print(str.charAt(i)+" ");
        }
    }
    public static void main(String[] args) {
        String first_name = "Aman";
        String last_name ;
        last_name = "jain";
        String full_name = first_name+" "+last_name;
        System.out.println(full_name);
        System.out.println(full_name.charAt(0));//A
        System.out.println(full_name.charAt(1));//m
        System.out.println(full_name.charAt(2));//a
        System.out.println(full_name.charAt(3));//n
        System.out.println(full_name.charAt(4));//" " space 
        printletters(full_name);
        System.out.println();
        System.out.println("enter your father name: ");
        Scanner sc = new Scanner(System.in);
        String fname = sc.nextLine();
        System.err.println(fname);
        printletters(fname);
        System.out.println();
        System.out.println("enter your mother name: ");
        // Scanner sc = new Scanner(System.in);
        String Mname = sc.nextLine();
        System.out.println(Mname); 
        printletters(Mname);
        System.out.println();
        String dname = new String ("asmita jain "); // object creation 
        System.out.println("my sister name is: "+dname);
        printletters(dname);

    }
}
// string 
// input and output of the string 
// concatenate string
// length of the string 
// use of charAt() function 

import java.util.*;
public class max_of_3_number {
public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
    System.out.println("Enter value of a: ");
    int a = sc.nextInt();
    System.out.println("Enter value of b:");
    int b = sc.nextInt();
    System.out.println("Enter value of c:");
    int c = sc.nextInt();
    if(a>=b && a>=c){
        System.out.println("largest is a ");
    }
    else if (b>=c && b>=a){
        System.out.println("largest is b ");
    }
   else if (c>=b && c>=a){
    System.out.println("largest is c ");
   }
//    else if (a==b && b==c){
//     System.out.println("numbers are equal ");
//    }
//    else {
//     System.out.println("you have enter value of two number equal ");
//    }


// Logic 
   // a>=b and a>=c (true ) then print a 
   // if upper condition is false 
   // b>=c then print b 
   // if both the upper condition is false then print c 
}    
}

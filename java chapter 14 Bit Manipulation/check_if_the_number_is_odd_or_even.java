import java.util.*;
public class check_if_the_number_is_odd_or_even {
    public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
System.out.println("enter number ");
int a = sc.nextInt();
int bitmask = 1;
if ((a&bitmask)==0){ // lsb is 0 then number is even 
System.out.println("even number");
}   
else{ // (a&bitmask)==1 it means lsb is 1 then number is odd 
System.out.println("odd number ");
} 
}
}
//  if number is odd : lsb is always 1 
// if number is even : lsb is always 0 
// and operator is used  
 
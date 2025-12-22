import java.util.*;
public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
System.out.println("Enter the first number: ");
int a = sc.nextInt();          
System.out.println("Enter the second  number: ");  
int b = sc.nextInt();         
System.out.println("Enter the type of operation you have to perform on number (+,-,*,%,/): ");   
char operator = sc.next().charAt(0); 
switch (operator){
case '+':System.out.println("the value after addition is: "+(a+b));
break;
case '-':System.out.println("the value after substraction is: "+(a-b));
break;
case '*':System.out.println("the value after multiplication  is: "+(a*b));
break;
case '/':System.out.println("the value after division  is: "+(a/b));
break;
case '%':System.out.println("the value after modulus operator  is: "+(a%b));
break;
default:System.out.println("Please enter the valid operator");
}      
    }
    
}

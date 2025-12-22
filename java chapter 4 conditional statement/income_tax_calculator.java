import java.util.*;
public class income_tax_calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter your income");
        int income = sc.nextInt();
        float tax;
        if(income<=500000){ // 0 percent tax on your income
            tax = 0;
            System.out.println("value of tax is : "+tax);
        }
        else if(income>500000 && income<1000000){ // 20 percent tax on your income
            tax = (float)(0.2*income); // type casting // by default (0.2*income) is double 
            System.out.println("value of tax: "+tax);
        }
        else{
            tax = (float)(0.3*income); // 30 percent tax on your income
            System.out.println("Value of tax is: "+tax); // type casting
            // by default (0.3*income) is double  
        }
             
    }
}

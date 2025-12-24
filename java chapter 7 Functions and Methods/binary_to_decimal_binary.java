import java.util.*;
// bit are 0 and 1 in computer 

// binary to decimal 
//() base2 ---->()base10
public class binary_to_decimal_binary {
    public static int binary_to_decimal(String binary_number){
       int decimal_number = Integer.parseInt(binary_number,2); // parseInt is the helper function 
       return decimal_number;
    }

// binary to decimal 
    public static void binToDec(int binNum){
        int myNum = binNum;
        int pow=0;
        int decNum=0;
        while(binNum>0){
            int lastdigit = binNum%10;
            decNum = decNum + (lastdigit *(int)Math.pow(2,pow));
            pow++;
            binNum=binNum/10; // logic of palindrome
        }
        System.out.println("Decimal equivalent of  "+myNum+" : "+decNum);
    }

// let the binary number is: 1100 
// decimal equivalent is :  (2^3*1)+(2^2*1)+(0*2^1)+(2^0*0) = 0+0+4+8 = 12 
// so decimal equivalent is 12 ..............................................
// decimal to binary 
    public static void  decToBIN(int decinum){
        int pow = 0; // intializing the power to 0 
        int binnum = 0; 
        int mynum = decinum; // creating the copy of decinum 
        while (decinum>0){
            int last_digit = decinum%2; // remainder 
            binnum = binnum + (last_digit*(int)Math.pow(10,pow)); // logic and type casting 
            pow++;
            decinum = decinum / 2; // result  quotient  after divide 
        }

// let the decimal number is 12 . 
//          2    12      
//               q       r  
//          2    6       0 
//          2    3       0
//          2    1       1
//          2    0       1 
//  binary equivalent is : 1100
System.out.println("binary equivalent of "+mynum+" is "+binnum);
    }

// decimal to binary 
// ()base10----->()base2
    public static String decimal_to_binary(int decimal_number){
        String binary_number = Integer.toBinaryString(decimal_number); // toBinaryString is the helper function 
        return binary_number;
     } 



// main function 
   public static void main(String[] args) {
       Scanner sc = new Scanner (System.in);
    //    System.out.println("enter the binary number ");
    //    String binary_number = sc.nextLine();

    //    int final_decimal_number = binary_to_decimal(binary_number);
    //    System.out.println("decimal equivalent : "+final_decimal_number);
      
    //    System.out.println("enter the binary  number ");
    //    int  binNumber  = sc.nextInt();
    //    binToDec(binNumber);



       System.out.println("enter the decimal   number ");
       int  decNumber  = sc.nextInt();
       decToBIN(decNumber);

    //    System.out.println("enter the decimal number ");
    //   int  decimal_number = sc.nextInt();

    //   String final_binary_number = decimal_to_binary(decimal_number);
    //   System.out.println("binary equivalent: "+final_binary_number);

   } 
}
// decimal number system = {0,1,2,3,4,5,6,7,8,9}
// binary number system = {0,1}  
// 999 = (9*10^2) + (9*10^1) + (9*10^0) = 900 + 90+ 9 = 999
// logic building 
import java.util.Scanner;
public class prime_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of n: ");
        int n = sc.nextInt();
        if(n==2){ // 2 is a prime number (unique case )
            System.out.println("the number is prime ");
        }
        else{
        boolean isprime=true; // initializing the value of isprime by true // we are assuming the number to be prime 
        for (int i = 2; i<=Math.sqrt(n) ;i++){
        // loop 2 to n-1 -----> loop is running n-2 times 
        // for optimization we run the loop from 2 to square root (n). 
            if(n%i==0){ // composite number
            isprime=false; // update isprime value to false as number having more than 2 factors .(composite number )
            }
        }
        if(isprime==false)
        System.out.println("number is composite number (not prime )");
        else{ // isprime== true (prime number)
            System.out.println("number is prime number");
        }
    }
    }

}
// prime number are  divisible by 1 and itself. 
// prime number: 2,3,5,7,11
// n = a*b = ---> a = root(n) and b = root(n) so this are the maximum value of a and b possible
// repetition starts after root (n) .  
// unique factors are till root (n).
// every number is divisible by itself and 1
// n = root(n)*root(n)
//   12= 1*2 let 12 = a*b
//     = 2*6
//     = 3*4
//     = 6*2
//     =12*1 
// observation:a keeps on increasing and b keeps on decreasing 
// observation: repetition starts after root(12).

import java.util.Scanner;
public class prime_no_in_range {
    public static boolean isprime(int n ){
        if (n<0){
            return false; //corner case
        }
        else if (n==1){
            return false; // corner case 
        }
        else if (n==2){
            return true; // corner case 
        }
        else{
            for(int i = 2;i<=Math.sqrt(n);i++){
                if(n%i==0){
                    return false; // composite number 
                }
            }
            return true; // for prime number 
        }
    }
    public static void prime_in_range(int n){
        for (int i =1;i<=n;i++){
            if(isprime(i)){ // isprime(i)==true  // isprime is the helper function of prime_in_range
                System.out.print(i+" ");
            }
        }   
        // isprime check wheather the number is prime or not 
        // if the number is prime then prime_in_range will print it . 
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("enter the value of n in (1-n)  !! prime number in range ");
        int n = sc.nextInt();
        prime_in_range(n); // function calling 
        // for (int i =1;i<=n;i++){
        //     if(isprime(i)){ // isprime(i)==true 
        //         System.out.print(i+" ");
        //     }
        // }
    }
}
// Count Primes In Range  : GFG (TLE) : https://www.geeksforgeeks.org/problems/count-primes-in-range1604/1
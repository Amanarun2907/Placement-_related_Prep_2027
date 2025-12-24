public class check_if_the_number_is_prime_or_not_optimization{
    public static  boolean isprime(int n){
 if (n<0){ // corner case of negative number 
    return false;
 }
  else   if(n==2){
    return true; // corner case of 2 as it is prime number 
 }
 else if (n==1){ // corner case of 1 as it is not a prime number 
    return false;
 }
 else {
    for ( int i =2 ;i<=Math.sqrt(n);i++){ // [optimization of the code as i move from 2 to Math.sqrt();]
     if(n%i==0){
       return false;  // composite number 
     }
    }
}
    return true;// return true or false 
    }
    public static void main(String[] args) {
        System.out.println(isprime(-12)); // false 
        System.out.println(isprime(2));// true 
        System.out.println(isprime(1)); // false 
        System.out.println(isprime(12)); // false 
        System.out.println(isprime(37)); // true
    }
}
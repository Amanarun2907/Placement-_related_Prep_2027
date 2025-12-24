public class revision {
    // to check whether a number is prime number or not 
    public static boolean check_prime (int n){ // n>=1 // helper function 
        if (n==1){ // corner case 
            return false ;
        }
        if (n==2){ // corner case 
            return true ; 
        }
        for (int i = 2 ; i<=Math.sqrt(n);i++){
              if (n%i==0){
                return false ;
              }
        }
        return true;
    }
    // prime number in range [L,R]
    public static void in_range (int L , int R){
        int counter = 0;
        // 1 is neither a prime nor composite number 
        for (int i = L ; i<=R ; i++){
            // concept of helper function 
            if(check_prime(i)==true){
                counter++;
                System.out.print(i + " ");
            }
        }
        System.out.println();
        System.out.println("total prime number in the range " + L + " to " + R + " is " + counter);
    }
    // factorial of the number
    public static void factorial (int n ){
        int fac = 1;
        for (int i = 2 ; i<=n;i++){
            fac = (fac*i);
        }
        System.out.println("the value of the factorial of the number "+ n + " is "+ fac);
    } 
    // reverse of the number 
    public static void rev_num (int n){
        int stored_num = n ;
        int rev= 0;
        while(n>0){
            int last_digit = n%10;
            rev = (rev * 10) + last_digit;
            n= n/10; 
        }
        System.out.println("the reverse of the number " + stored_num +  " is equal to "+ rev);
    }
    // binary to decimal 
    public static void bin_to_dec ( int n ){
        int bin = n; 
        int power = 0; 
        int dec = 0 ; 
        while (n>0){
            int last_digit= n%10;
            dec = dec +(last_digit* (int) Math.pow(2,power)); // type  casting as Math.pow(a,b) returns a double to you need to convert it in int using type cast 
            power++;
            n = n/10;
        }
        System.out.println(" the conversion of the binary number "+ bin + " to the decimal number is "+ dec);
    }
    // built-In function binary to decimal
    public static int bin_to_dec_1 ( String n ){
    int bin = Integer.parseInt(n,2);
    return bin;
    }


    // decimal to binary 
    public static void dec_to_bin (int n ){
        int dec = n; // decimal number 
        int bin = 0; 
        int power = 0;
        while (n>0){
            int remain = n%2;
            bin = bin + (remain * (int) Math.pow(10 ,power));
            power ++; 
            n = n/2;
        }
        System.out.println("the conversion of the decimal  number "+ dec + " to binary is "+ bin  );
    }

    public static String dec_to_bin_1 (int n) {
        String bin = Integer.toBinaryString(n);
        return bin;
    }
    public static void main(String[] args) {
        // to check whether a number is prime number or not 
        // boolean answer = check_prime(19);
        // System.out.println(answer);

        // prime number in range [L,R]
        // in_range(1,20); // 2 ,3,5,7,11,13,17,19

        // factorial of the number
        // factorial(5);
        // factorial(12);
       
        // reverse of the number 
        //rev_num(12976453);// 35467921


        // binary to decimal 
        //bin_to_dec(1111); // 15
        // int dec = bin_to_dec_1("1111"); // 15
        // System.out.println(dec);



        // decimal to binary 
        //dec_to_bin(12);
        // dec_to_bin(24);
        String bin = dec_to_bin_1(12);
        System.out.println(bin); // 1100



    }
}
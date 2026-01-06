public class clear_last_ith_bits {
    public static int clearIbits (int n , int i ){
        int bitmask = ((~0)<<i); // -1<<i
        return (n&bitmask);
 
    }
    public static void main(String[] args) {
        System.out.println(clearIbits(15, 2));
        //  (~0) = -1
    }
}
// example 
// i/p n= 1111 and i = 2 
// set last two bits of n equals to 0 .
// o/p ---> 1100

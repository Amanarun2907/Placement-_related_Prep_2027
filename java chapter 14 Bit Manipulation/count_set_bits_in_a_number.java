public class count_set_bits_in_a_number {
    public static void SetBitCount(int n ){
        Integer count = 0;
        Integer count1 = 0;
        while (n!=0){ // n = 0 is the stopping condition 
            if ((n&1)==1){
                count++; // odd number logic 
            }
            else{
                count1++; // even number logic 
            }
            n=n>>1;  // updation 
        }
       System.out.println("the number of set bit (no of 1 ) is: "+count);
       System.out.println("the number of clear bit (no of 0 ) is: "+count1);

    }
    public static void main(String[] args) {
       // counting of no of set bits in a number 
       // count of no of 1 in the number which is in binary format 
        // google // amazon 
    SetBitCount(8);
   

    }
}
// if there is a number n then how many bits are required to make this number = logn+1 (log with base 2 )
// n= 16 so no of bits are  log(16)+1 = 5 --> 10000 (minimum)

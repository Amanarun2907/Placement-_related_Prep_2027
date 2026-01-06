public class clear_ith_bit {
    public static int clearIthbit(int n , int i ){
        int bitmask = ~(1<<i); // bitmask is ~(1<<i)
        return (n&bitmask);

    }

    public static void main(String[] args) {
    System.out.println(clearIthbit(10, 2)); 
    System.out.println(clearIthbit(12, 2)); 
    }
}
//operation 
// 1. get ith bit
// bitmask is (1<<i)
// 2. set ith bit means set the ith bit of the number to 1
// bitmask is (1<<i) 
// 3. clear ith bit means make the ith bit of the number equal to 0 .
// bitmask is ~(1<<i) 
//so we need to clear  the ith bit as 0 and rest all bit are same so this is the meaning of clear ith bit . 
// 4. Update ith bit 
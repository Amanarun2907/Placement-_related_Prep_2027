public class set_ith_bit {
    public static int setIthbit(int n , int i){
        int bitmask = 1<<i;
        return (n|bitmask); // or operator is used 
    }
    public static void main(String[] args) {
        System.out.println(setIthbit(12, 2)); // 12
        System.out.println(setIthbit(12, 1)); // 14 
        System.out.println(setIthbit(12, 0)); // 13
        System.out.println(setIthbit(12, 3)); // 12

    }
}
//operation 
// 1. get ith bit
// bitmask is (1<<i)
// 2. set ith bit means set the ith bit of the number to 1
// bitmask is (1<<i) 
// so we need to set the ith bit as 1 and rest all bit are same so this is the meaning of set ith bit . 
// 3. clear ith bit 
// 4. Update ith bit 
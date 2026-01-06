public class get_ith_bit {
    public static int getIthBit(int n , int i ){
        int bitmask = (1<<i); // left shift = (a*2^b)
        if ((n&bitmask)==0)
        {
          return 0;
        }
        else {
            return 1;
        }
    }
    public static void main(String[] args) {
    System.out.println(getIthBit(12, 0)); // 0
    System.out.println(getIthBit(12, 1)); // 0 
    System.out.println(getIthBit(12, 2)); // 1 
    System.out.println(getIthBit(12, 3)); // 1 

    }
}
//operation 
// 1. get ith bit   
//as we know that ith bit is either 0 or 1 so we need to know either it is 0 or 1 .......
// bitmask is (1<<i)
// 2. set ith bit 
// 3. clear ith bit 
// 4. Update ith bit 
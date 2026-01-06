public class Clear_range_of_bits {
    public static int clear_range_of_bit(int n , int i , int j ){
        int a = ((~0)<<(j+1));
        int b = (1<<i)-1;
        int bitmask = a|b;
        return (n&bitmask);
    }
    public static void main(String[] args) {
        System.out.println(clear_range_of_bit(14, 1, 2)); //8
        System.out.println(clear_range_of_bit(10, 2, 4)); //2
    }
}
// n = 100111010011
// i =2 as note here that i = 0 from left side 
// j= 7 
// final number  = 100100000011
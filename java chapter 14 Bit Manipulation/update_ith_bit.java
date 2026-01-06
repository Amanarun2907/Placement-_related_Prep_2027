public class update_ith_bit {
    public static int setIthbit(int n , int i){
        int bitmask = 1<<i;
        return (n|bitmask); // or operator is used 
    }

    public static int clearIthbit(int n , int i ){
        int bitmask = ~(1<<i); // bitmask is ~(1<<i)
        return (n&bitmask);

    }
    public static int UpdateIthbit(int n ,int i , int newBit ){
    
    // if (newBit==0){
    //     return clearIthbit(n, i);
    // }
    // else {
    //     return setIthbit(n, i);
    // }
   
    n = clearIthbit(n, i); // function calling 
    int bitmask = newBit<<i; // left shift 
    return n|bitmask;  // or operator is used 


    }
    public static void main(String[] args) {
        System.out.println(UpdateIthbit(10,2 ,1)); //14
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
// so we have to set or clear the ith bit as per the instruction given by the user . 


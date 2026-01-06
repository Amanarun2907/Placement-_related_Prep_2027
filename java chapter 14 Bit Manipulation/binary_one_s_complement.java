public class binary_one_s_complement {
    public static void main(String[] args) {
        System.out.println(~5);
        System.out.println(~0);
        System.out.println(~8);
    }
}
// not operator 
// least significant bit (lsb) [rightmost bit]
// most significant bit (msb)  [leftmost bit]
// if msb is 0 ---> number is positive 
// if msb is 1  ---> number is negative 

// working of binary (~) is shown below 
// 5  000101 
// not of 5 -->  111010
// as msb is changed from 0 to 1 . 
// 2's complement 
// 1st complement --> 000101 of  (111010) 
// add 1 -->    000101
//                  +1
//              000110 --->  6  
//ans is  -6   as msb changed from 0 to 1 in line 17  



// 8 
// step 1 : binary of 8 : 0001000
// step 2 : 1's complement of (0001000) --> 1110111
// step 3 : 1's complement of (1110111) --->0001000
// step 4 : add 1 in (0001000)  -->  0001000
//                                        +1
//                                   0001001----> 9 in decimal 
// you you run sout(~8) it will show you -9  
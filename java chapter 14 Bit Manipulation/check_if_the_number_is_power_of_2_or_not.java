public class check_if_the_number_is_power_of_2_or_not {
    public static void power_of_2_or_not(int n ){
        if ( ((n) & (n-1)) == 0){
            System.out.println("number is power of 2 ");
        }
        else{
            System.out.println("number is not the  power of 2 ");
        }
    }
 public static void main(String[] args) {
     power_of_2_or_not(16); // number is power of 2
     power_of_2_or_not(90); //number is not the  power of 2
}   
}


// example 
// n = 16 ---> binary ---->   10000
// n-1 = 15 ---> binary ----> 01111
// (n&(n-1))----------------->00000
// so the number is power of 2 . hence proved 

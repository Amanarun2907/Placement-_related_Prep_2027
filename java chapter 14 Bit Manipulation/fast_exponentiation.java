public class fast_exponentiation {

    public static int fastexpo(int a , int n ){
        int ans = 1; // initialize a variable
       // a^3 = a^(011) = (a)(a^2*1)(1) = a^3 = a^3
        
        while (n>0){ // converting our power in binary 
            if((n&1)!=0){ //LSB (odd no logic)
            ans = ans*a;
            }
            a = a*a;
            n=n>>1;
        }


        return ans;
    }
    public static void main(String[] args) {
        System.out.println(fastexpo(3, 5));
        System.out.println(fastexpo(5, 3));
    }
}
// time complexity = o(logn) otherwise timecomplexity going to be o(n^n)


// logic 
// 8 4 2 1 
// calculate 5^3 (fast exponentiation)
// 5^(011) 
// ans = 1
// n = 3 
// a =5 


// step 1 :
// n = 3---> 011 
// (011&1) = 1 
// ans = 1*5 = 5 
// a = a*a = 25 
// n = n>>1 = 1  --->001



// step 2 :
// n = 1---> 001 
// (001&1) = 1 
// ans = 25*5  = 125 
// a = a*a = 25*25 = 625 
// n = n>>1 = 0 

// as n = 0 so we do not enter into the loop 


// ans  = 125 

//read the value  of modular exponentiation 
//  modular exponentiation 
// a^n%x

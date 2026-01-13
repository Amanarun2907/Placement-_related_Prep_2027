public class  Revision {
    //Print X^n (Normal Approach)
    public static int power (int x , int n){
        // base case 
        if (n==1){
            return x; 
        }
        // if(n==0){
        //     return 1;
        // }
        int Srk = power(x,n-1); // function calling
        int ans = x*Srk; // main answer
        return ans; // return statement 
    }
    // Print X^n (Optimised approach)
    public static int power_2 (int x ,int n){
        // base case 
        if(n==1){
            return x;
        }

        // if n is even ---> x^n = x^n/2 *x^n/2;
        // if n is odd -----> x^n = x*x^n/2 * x^n/2;
        int halfpower = power_2(x,n/2);
        int halfpowersq = halfpower*halfpower;
        if(n%2!=0){
            halfpowersq = x*halfpowersq;
        }
        return halfpowersq;
    }



    // first occurence (index)
    public static int firstocc (int arr[] , int i , int key){ // arr is array , i is index and key is element to search 
        // base  ( if key is not found)
        if (i == arr.length){ // if key is not found !!!!!
            return -1; // return -1 
        }

        if(arr[i]==key){ // searching first 
            return i;
        }
       return firstocc(arr,i+1,key); // moveforward second 
    }


    // last occurence 
    public static int lastocc (int arr[] , int i , int key){
        // base case 
        if (i == arr.length){
            return -1;
        } 
        // move forward first 
        int is_found = lastocc (arr, i+1,key);
        // search 
        if(is_found == -1 && arr[i]==key){
            is_found = i;
        }
        return is_found;
    }




    // array is sorted or not 
    public static boolean is_sorted (int arr[], int i){

     // base case 
     // we are on last position 
     if(i==arr.length-1){
        return true;
     }

        if(arr[i]>arr[i+1]){ // searching  (eek case mai handle kar leta hoon , baaki resursion kar lega )
            return false;
        }
        return is_sorted(arr , i+1); // (work of recurrsion)
    } 


    // fibonacci number 
    public static int fib(int n){
        // find out nth term of the series by this function 
        // base case 
        if(n==0 || n==1){
            return n;
        }
        // every third term is the sum of previous two terms in fibonaaci series
        int fib_1 = fib(n-1);
        int fib_2 = fib(n-2);
        int ans = fib_1 +  fib_2;
        return ans;
    }



    // first n natural numbers 

    public static int sum (int n){
        // base case 
        if (n==1){
            return 1;
        }
        int srk = sum(n-1);
        int ans = n+srk;
        return ans;
    }


   // print number from 1 to n
   public static void print1(int n){
    // base 
     if (n==1){
        System.out.print(1+" ");
        return;
     }
       // move backward
       // print
    print1(n-1);
    System.out.print(n + " ");
   } 
   // print number from n to 1
    public static void printn (int n){
        if(n==1){
            System.out.print(1+" ");
            return ;
        }
        // first print 
        System.out.print(n+ " ");
        // move backward
        printn(n-1);
    }
    public static int fac(int n){
        // base case 
        if (n == 0 || n==1){
            return 1;
        }
        int srk = fac(n-1);
        int ans = n*srk;
        return ans;
    }
    public static void main (String[] args ){
    //    int ans = power(2,10);
    //    System.out.println(ans); // 1024
    //     int ans = power_2(2,5);
    //    System.out.println(ans); // 32
     int arr[]= {1,1,2,3,4,2,5,2,3,2};
     //System.out.println(firstocc(arr, 0, 2)); // 2   --> first occurence
    // System.out.println(lastocc(arr, 0, 2)); // 9 ----> last occurence
    //  System.out.println(is_sorted(arr, 0));
     int arr1 []= {1,2,3,4,5,6,7,8,9}; // false
    //  System.out.println(is_sorted(arr1, 0)); // true  --> because it is ascending 
    // System.out.println(fib(7)); // 0 1 1 2 3 5 8 13 
    // System.out.println(sum (10)); // 55
    // System.out.println(fac(6));
    print1(10);
    System.out.println();
    printn(10);
    }
}
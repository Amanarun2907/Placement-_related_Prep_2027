public class call_by_value{
    //swap function 
    public static void swap(int a , int b ) { // passing the copy of original value 
        int temp = a; 
        a = b;
        b = temp ;
     System.out.println("the value of a when we are in function area  is: "+a);
     System.out.println("the value of b when we are in function area  is: "+b);

    }
    public static void main(String[] args) {
     // swap the value (exchange the value) 
     int a = 5;
     int b = 10;
     System.out.println("the value of a before swap is: "+a); // initial value of a  = 5 
     System.out.println("the value of b before swap is: "+b); // initial value of b = 10
     swap (a,b);  // values of a and b after swap  is 10 and 5  
     

     //                 temp   a   b 
                   //          5   10
    // int temp =a;   //     5    5   10
    // a=b ;          //     5    10  10
    // b = temp;      //     5    10  5     
    // call by value 

    
    System.out.println("the value of a after swap when we are in main function is: "+a); // initial value of a = 5 
     System.out.println("the value of b  after swap when we are in main function is: "+b);  // initial value of b = 10 
    
    }

}
public class function_overloading {
    public static int multiply (int a , int b ){
        return a*b;
    }
    public static float   multiply (float  a , float b ){
        return a*b;
    }
    public static double  multiply (double a , double b ){
        return a*b;
    }
    public static int   multiply ( int a , int b, int c ){
        return a*b*c;
    } 
    // name of function is same but either data type of parameters  or no of parameters are different or both are different 

    public static void main(String[] args) {
   // multiple function with the same name but different parameters
   int x = multiply(4,5);
    float  y = multiply(4.2f,5.3f);
    double z = multiply(4.23,5.33);
    int g = multiply(2, 3, 5);
    System.out.println(x);
    System.out.println(y);
    System.out.println(z);
    System.out.println(g);
    }
}
 // function overloading only concern about no of arguments or data type of arguments but does not take care of return type of function .
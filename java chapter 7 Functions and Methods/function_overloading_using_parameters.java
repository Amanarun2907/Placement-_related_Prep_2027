public class function_overloading_using_parameters {
    public static int add(int a,int b){
        return a+b;
        // function overloading only concern about no of arguments or data type of arguments but does not take care of return type of function .
    }
    public static int add(int a,int b, int c){
        return a+b+c;
        // function overloading only concern about no of arguments or data type of arguments but does not take care of return type of function .
        // both add have same return type but still function overloading occur.
    }
    public static void main(String[] args) {
        int add_1 = add(2,3); // int add_1 = 5; 
        int add_2 = add(2,3,5); // int add_2 = 10;
        System.out.println(add_1); // 5
        System.out.println(add_2); // 10
    }
}

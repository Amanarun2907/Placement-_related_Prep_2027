public class function_overloading_using_data_type {
    public static  int sum (int a , int b){
        return a+b;
    }
    public  static  double  sum (float a , float b){
        return a+b;
    }
    public static void main(String[] args) {
        int add_1 = sum (4,5);
        double add_2 = sum (3.2f,4.3f);
        System.out.println(add_1);
        System.out.println(add_2);
    }
}

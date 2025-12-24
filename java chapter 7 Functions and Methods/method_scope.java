public class method_scope {
    public static void print_s(){
        int s = 45;
        System.out.println(s);
    }
    public static void main(String[] args) {
        // method scope 
       /*  System.out.println(s); */ // error : s can not be resolved to a variable
        int a = 45;
        System.out.println(a);
       /* System.out.println(s); */     // error : s can not be resolved to a variable
       print_s();
    }
}

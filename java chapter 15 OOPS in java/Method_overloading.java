public class Method_overloading {
    public static void main(String[] args) {
        calculator c = new calculator();
        System.out.println(c.sum(10,12));
        System.out.println(c.sum((float)12.34,(float)23.56));
        System.out.println(c.sum(23,56,78));
// method overloading 

    }
}
class calculator{
int sum (int  a , int  b){
    return a+b;
}
float sum (float a, float b){
    return a+b;
}
int sum (int a ,int b, int c ){
    return a+b+c;
}
}

// multiple function with the same name but different parameters 
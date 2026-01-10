
public class PQ10 {
    public static void main(String[] args) {
        test t = new test ();
        System.out.println(test.b); //0
        System.out.println(test.a); // 10
        t.changeB(); // b= 30 
        System.out.println(test.b); // 30
        System.out.println(test.a); // 10
        System.out.println(test.a+test.b); // 40 = 30 +10    
    }
    

}
class test {
    static int a = 10;
    static int b;
    static void changeB(){
        b = a*3;
    }
}
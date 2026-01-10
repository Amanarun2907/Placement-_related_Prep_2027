public class PQ9 {
    public static void main(String[] args) {
       test t = new test ();
       t.set_marks(98); // line 2 
       System.out.println(test.marks);  // line 3
    }
}
class test {
    static int marks ;
    void  set_marks(int marks){
        this.marks = marks ; // line 1 
    }
}
// no error 
// static variable can be acces with the class or object name both 
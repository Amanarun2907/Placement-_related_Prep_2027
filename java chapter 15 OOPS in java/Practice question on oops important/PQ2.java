class person {
    String name ;
    int weight;
}
class Student extends person { // inheritance 
int rollNumber;
String shoolName;
}
public class PQ2 {
    public static void main(String[] args) {
        person p  = new person ();
        p.name = "aman";
        p.weight  = 50;
        System.out.println(p.name);
        System.out.println(p.weight);
        
    }
}

public class constructors_in_java {
public static void main(String[] args) {
    Student s1 = new Student("Aman",230572); 
    System.out.println(s1.name);
    System.out.println(s1.roll);

}
}
// constructors 
//constructor is a special method which is invoked automatically at the time of object creation .
// constructor have the same name as class or structure .
// constructor are only called once , at object creation .
// memory allocation happens when constructor is called .
// constructor do not have a return type (not even void )
class Student {
    String name;
    int roll;
    Student(String name,int roll){
        System.out.println("constructor of Student class is called ");
        this.name = name;
        this.roll = roll;
        // System.out.println();
    }
}
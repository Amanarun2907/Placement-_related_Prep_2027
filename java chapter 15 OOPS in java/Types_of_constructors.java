public class Types_of_constructors {
    public static void main(String[] args) {
        Student s4 = new Student();
        Student s1 = new Student("Aman jain");
        Student s2 = new Student(230572);
        Student s3 = new Student("Arun jain",230571);

    }
}
class Student {
    String name;
    int roll;
    Student (){
        System.out.println("non parameterized constructor is called !!!");
    }
    Student(String name,int roll){ // parameterized constructor
        System.out.println("constructor of Student class is called (name,roll no)");
        this.name = name;
        this.roll = roll;
        // System.out.println();
    }
    Student(int roll){ // parameterized constructor
        System.out.println("constructor of Student class is called (roll no) ");
        this.roll = roll;
        // System.out.println();
    }
    Student(String name){ // parameterized constructor
        System.out.println("constructor of Student class is called (name )");
        this.name = name;
        // System.out.println();
    }
}
// types of constructors 
// non-parameterized 
// parameterized 
// copy 
// constructor overloading like method overloading (example of polymorphism )
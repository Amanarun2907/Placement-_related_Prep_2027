public class Copy_constructors {
    public static void main(String[] args) {
        Student s1 = new Student();//non parameterized constructor is called !!!
        s1.name = "aman jain ";
        s1.roll=230572;
       s1.password = "abcdefg";
       Student s2 = new Student (s1); //copy constructor is called 
       s2.password = "xyz";
       s1.marks[0]=90;
       s1.marks[1]=92;
       s1.marks[2]=94;
       for (int i = 0;i<3;i++){
       System.out.print(s2.marks[i]+" "); //90 92 94
       }
       System.out.println();
       s1.marks[0]=82;
       s1.marks[1]=84;
       s1.marks[2]=86;
       
       for (int i = 0;i<3;i++){
        System.out.print(s2.marks[i]+" ");  //82 84 86
        }
    }
}
class Student {
    String name;
    int roll;
    String password;
    int marks[] ; // there is the array of marks 
    Student (){
        marks = new int[3];
        System.out.println("non parameterized constructor is called !!!");
    }
    Student(String name,int roll){ // parameterized constructor
        marks = new int[3];
        System.out.println("constructor of Student class is called (name,roll no)");
        this.name = name;
        this.roll = roll;
        // System.out.println();
    }
    Student(int roll){ // parameterized constructor
        marks = new int[3];
        System.out.println("constructor of Student class is called (roll no) ");
        this.roll = roll;
        // System.out.println();
    }
    Student(String name){ // parameterized constructor
        marks = new int[3];
        System.out.println("constructor of Student class is called (name )");
        this.name = name;
        // System.out.println();
    }
    Student (Student s1 ){
        marks = new int[3];
        this.name = s1.name;
        this.roll = s1.roll;
       System.out.println("copy constructor is called ");
       this.marks = s1.marks; // marks is an array 
    }
}
// types of constructors 
// non-parameterized 
// parameterized 
// copy 
// constructor overloading like method overloading (example of polymorphism )
// Shallow and deep copy 

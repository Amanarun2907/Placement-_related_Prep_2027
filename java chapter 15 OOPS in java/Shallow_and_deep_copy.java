public class Shallow_and_deep_copy {
    public static void main(String[] args) {
        Student s1 = new Student();//non parameterized constructor is called !!!
        s1.name = "aman jain ";
        s1.roll=230572;
       s1.password = "abcdefg";
       s1.marks[0]=90;
       s1.marks[1]=92;
       s1.marks[2]=94;
       Student s2 = new Student (s1); //copy constructor is called 
       s2.password = "xyz";
    //    for (int i = 0;i<3;i++){
    //    System.out.print(s2.marks[i]+" "); //90 92 94
    //    }
    //    System.out.println();
       s1.marks[0]=82;
       s1.marks[1]=84;
       s1.marks[2]=86;
       
       for (int i = 0;i<3;i++){
        System.out.print(s2.marks[i]+" ");  //90 92 94
        }
    }
}
class Student {
    String name;
    int roll;
    String password;
    int marks[] ;



    Student (){//non parameterized constructor
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


    // shallow copy constructor 
    // Student (Student s1 ){
    //     marks = new int[3];
    //     this.name = s1.name;
    //     this.roll = s1.roll;
    //    System.out.println("shallow copy constructor is called ");
    //    this.marks = s1.marks; // marks is an array 
    // }



    // deep copy constructor
    Student (Student s1){
        marks = new int[3];
        this.name = s1.name;
        this.roll = s1.roll;
        System.out.println("deep copy constructor is called ");
        for (int i = 0 ;i<marks.length;i++ ){
            this.marks[i] = s1.marks[i];
        }
    }
}
// shallow & deep copy 
// changes reflect in shallow copy 
// changes does not reflect in deep copy 
// lazy copy 
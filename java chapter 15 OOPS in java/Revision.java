// Class and objects 
// Access Modifiers in Java (Private, default , protected and Public)
// Getters and Setters as function 
// 4 Pillars of OOPS [Encapsulation , Inheritance , Polymorphism and Abstraction]
// 1. Encapsulation 
// Constructor 
// Types of constructor (Default constructor, Parameterized constructor and Copy constructor)
// Construction overloading 
//Shallow and deep copy in Java 
// Destructor in Java (Balance is very important in life )
// Inheritance in Java (Single , Multilevel , Hierarchical and Hybrid )
// Polymorphism in Java (compile/static/Method overloading and runtime/ dynamic/Method overriding)
// Inbuilt and User defined packages in Java
// Abstraction in Java (Abstract class and Interfaces) 
// Abstract class in Java
// Interfaces in Java
// Static Keyword 
// Super Keyword
// Final Keyword
// Constructor chaining and Lazy Copy in Java



// how to access the private variables in java 
public class Revision {
    public static void main (String args[]){
     BankAccount account1 = new BankAccount("Rajasthan","India");
     account1.user_name = "SRK";
     account1.setpassword("Aman@12345");

    System.out.println(account1.user_name);
    System.out.println(account1.getpassword());
    System.out.println(account1.state);
    System.out.println(account1.country);

    student s1 = new student();
    s1.age = 20;
    s1.roll_no = 101;
    s1.marks[0] = 80;
    s1.marks[1] = 90;
    s1.marks[2] = 100;
     
    student s2 = new student(s1);
    s1.marks[1] = 95;
     System.out.println(s1.marks[0]); // 80  // 80
     System.out.println(s1.marks[1]); // 95  // 95
     System.out.println(s1.marks[2]); // 100 //100
    System.out.println(s2.marks[0]); // 80   //80
    System.out.println(s2.marks[1]); // 95   // 90
    System.out.println(s2.marks[2]); // 100  // 100

    Raj R1 = new Raj();
    R1.state_name();
    Budget b1 = new Budget();
    b1.RR_defination();
    b1.CR_defination();
    b1.RE_defination();
    b1.CE_defination();
    }
}

//abstract classes 
// 1. Used to achieve abstraction (one of the pillar of object oriented programming)
// 2. Can have constructor 
// 3. Can have abstract or non abstract methods 
// 4. Object can not be made of abstract classes 

abstract class States{
    void country (){
        System.out.println("Welcome to the states of India");
    }
    abstract void state_name ();
    States(){
        System.out.println("States class constructor is called");
    }
}

class Raj extends States{
    void state_name(){
        System.out.println("Rajasthan");
    }
    Raj (){
        System.out.println("Rajasthan Class Constructor is called");
    }
}
class U_P extends States{
    void state_name(){
        System.out.println("Utterpradesh");
    }
     U_P (){
        System.out.println("Utter-Pradesh Class Constructor is called");
    }
}




// interface 
// Used to achieve 100 percent abstraction and Multiple Inheritance
// Variable : public static and final 
// Function : public , abstract and without implementation 
// Keyword : implements and interface 
// interface is the blueprint of a class and class is a blueprint of object 

interface  revenue_receipt {
  public void RR_defination();
}
interface capital_receipt{
    public void CR_defination();
}
interface revenue_expenditure{
    public void RE_defination();
}
interface capital_expenditure{
    public void CE_defination();
}
class Budget implements revenue_receipt , capital_receipt , revenue_expenditure, capital_expenditure{
    public void RR_defination(){
        System.out.println("Income of GOI neither by reducing assests or creating liabilities");
    }
    public void CR_defination(){
        System.out.println("Income of GOI either by reducing assests or creating liabilities");
    }
    public void RE_defination(){
        System.out.println("Expenditure performed by GOI in consumption or maintainance");
    }
    public void CE_defination(){
        System.out.println("Expenditure performed by GOI in creating assests");
    }
}












































































































class BankAccount{
    // variables (attributes)
    public String user_name;
    private String password;
    public String state ;
    public String country;

// constructor 
    BankAccount(String state, String country){
        // this.state = "Rajasthan";
        // this.country = "India";
        this.state = state;
        this.country = country;

    }
    // methods 
    public void setpassword(String password){
        this.password = password;
    }
    public String getpassword(){
        return this.password;
    }
    
}

class student{
    public int age;
    public int roll_no;
public int marks[];
public student (){
    marks = new int[3];
}
// copy constructor
public student(student s1){
marks = new int[3];
this.age = s1.age;
this.roll_no = s1.roll_no;
this.marks = s1.marks;
// for (int i = 0 ; i< marks.length;i++){
//     this.marks[i] = s1.marks[i];
// }
}
}


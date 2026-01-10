class Vehicle {
    void print (){
        System.out.println("base class (Vehicle)");
    }
}
class Car extends Vehicle {
    @Override
    void  print (){
        System.out.println("derived class (Car)");
    }
}
public class PQ5 {
 public static void main(String[] args) {
    Vehicle obj1 = new Car (); // object of Car is created here 
    obj1.print(); //derived class (Car)
    Vehicle obj2 = new Vehicle(); // object of vehicle is created here 
    obj2.print(); // base class (Vehicle)
    Car obj3 = new Car ();
    obj3.print(); //derived class (Car)
    Vehicle ojb4 = new Vehicle();
    ojb4.print(); //base class (Vehicle)
 }   
}

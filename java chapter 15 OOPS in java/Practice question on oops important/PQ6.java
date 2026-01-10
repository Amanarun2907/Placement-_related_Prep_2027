public class PQ6 {
   public static void main(String[] args) {
     vehicle obj1 = new car();
     obj1.print(); // base class (Vehicle)
    //  obj1.print1(); error
    vehicle obj2 = new vehicle();
    obj2.print(); // base class (Vehicle)
    // obj2.print1(); error
    
    car obj3 = new car ();
    obj3.print1(); // derived class (car)
   } 
}
class vehicle {
    void print(){
        System.out.println("base class (Vehicle)");
    }
}
class car extends vehicle {
    void print1 (){
        System.out.println("derived class (car)");
    }
}
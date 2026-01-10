


public class Abstract_class {
    public static void main(String[] args) {
     Horse h = new  Horse();
     h.eat();
     h.run();
     h.walk();
     System.out.println();  
     Chicken c = new Chicken ();
     c.eat();
     c.run();
     c.walk();
System.out.println();
System.out.println(h.color);
h.changeColor();
System.out.println(h.color);
System.out.println(c.color);
c.changeColor();
System.out.println(c.color);
    // Animal a = new Animal(); throw an error 
horse_type ht = new horse_type();
// constructor calling -> Animal Horse horse_type (how we call constructor in Hierarchy)
    }
}
abstract class Animal {
    String color;
    void eat (){
        System.out.println("Animal eats");
    }
    abstract void walk(); // Abstract function 
    abstract void run();  // Abstract function 
    Animal (){ // constructor 
      color =  "red";
      System.out.println("constructor of animal  ");
    }
    abstract void changeColor();
}

class Horse extends Animal {
    void walk(){
        System.out.println("walks on four legs ");
    }
    void run (){
        System.out.println("horse is runing");
    }
    void changeColor(){
    color = "black";
    };
    Horse(){
       
    System.out.println("constructor of horse ");
    }
}
class horse_type extends Horse{
    horse_type(){
        System.out.println("constructor of horse_type");
    }
}
class Chicken extends Animal{
    void walk(){
        System.out.println("walks  on two legs ");
    }
    void run (){
        System.out.println("chicken is runing");
    }
    void changeColor(){
        color = "brown";
    };
    Chicken (){
        System.out.println("constructor of chicken");
    }
}
// cannot create create an instance of abstract class means we are not able to create the object of abstract class
// can have abstract / non abstract method 
// can have constructors 

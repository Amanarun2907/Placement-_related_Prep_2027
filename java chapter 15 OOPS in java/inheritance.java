public class inheritance {
    public static void main(String[] args) {
        Fish shark = new Fish();
        shark.swim();
        shark.eat(); // inheritance
        shark.breathe(); // inheritance 
        Animal ranbir = new Animal();
        ranbir.eat();
        ranbir.breathe();
        // ranbir.swim(); throw an error as swim function is not the part of Animal class 
    }
}
// base class
class Animal {
    String color;
    void eat(){
        System.out.println("Animal is eating");
    }
    void breathe (){
        System.out.println("Animal takes breathes");
    }
}
// derived class 
class Fish extends Animal {
    int fins ;
    void swim(){
        System.out.println("Fish swims in water");
    }
}
// 4 major components of oops 
// encapsulation 
// inheritance 
// abstraction 
// polymorphism 
// Defination of encapsulation : Encapsulation is defined as the wrapping up of data and method under a single unit . It also implements data hiding (example Highly sensitive data )
// Defination of inheritance : inheritance is when properties and methods of  base class are passed on to a derived class .

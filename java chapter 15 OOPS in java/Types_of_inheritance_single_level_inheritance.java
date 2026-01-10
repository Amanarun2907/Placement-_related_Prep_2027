public class Types_of_inheritance_single_level_inheritance {
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
// types of inheritance 
// single level inheritance 
// code is the example of single level inheritance 
